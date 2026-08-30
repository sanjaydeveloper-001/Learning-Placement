# Node.js Interview Questions & Answers

A complete question bank for Node.js interviews, organized from basic to advanced, with concise answers for each question.

---

## Basic Node.js

**1. What is Node.js?**
Node.js is a JavaScript runtime built on Chrome's V8 engine. It lets JavaScript run outside the browser, commonly for servers, APIs, and backend applications.

**2. Is Node.js single-threaded?**
JavaScript execution is primarily single-threaded, but Node.js uses the event loop, OS facilities, and a libuv thread pool to handle asynchronous operations efficiently.

**3. What is the event loop?**
The event loop allows Node.js to perform non-blocking operations by scheduling callbacks when asynchronous operations complete, even though JavaScript itself runs on a single thread.

**4. What is non-blocking I/O?**
Instead of waiting for an I/O operation such as reading a file or querying a database, Node.js can continue executing other work and process the result later via a callback, promise, or event.

**5. What is npm?**
npm is Node.js's package ecosystem and package manager. It is commonly used to install dependencies, publish packages, and run project scripts.

**6. What is `package.json`?**
It stores project metadata, scripts, dependencies, version information, and configuration for a Node.js project.

**7. Difference between `dependencies` and `devDependencies`?**
`dependencies` are required for the application to run in production, while `devDependencies` are generally needed only during development, testing, or building (e.g., linters, test frameworks, bundlers).

**8. What are CommonJS and ES Modules?**
CommonJS is Node's original module system, using `require()` and `module.exports`. ES Modules (ESM) are the standard JavaScript module system, using `import` and `export`.

```js
// CommonJS
const fs = require("fs");
module.exports = something;

// ES Modules
import fs from "fs";
export default something;
```

---

## Asynchronous JavaScript

**9. What is a callback?**
A function passed to another function to be executed later, often after an asynchronous operation finishes.

**10. What is callback hell?**
Deeply nested callbacks that make code difficult to read and maintain, typically arising from chaining multiple asynchronous operations. Promises and `async/await` help avoid it by flattening the structure.

**11. What is a Promise?**
An object representing the eventual completion or failure of an asynchronous operation. It has three states: pending, fulfilled, and rejected.

**12. What is `async/await`?**
Syntax built on top of Promises that lets asynchronous code be written in a synchronous-looking style, improving readability.

```js
async function getUser() {
  const user = await fetchUser();
  return user;
}
```

**13. Difference between `Promise.all()` and `Promise.allSettled()`?**
`Promise.all()` resolves when all promises resolve, but rejects immediately if any one input promise rejects. `Promise.allSettled()` waits for every promise to complete and returns the outcome (fulfilled or rejected) of each, without short-circuiting.

**14. What happens if you forget `await`?**
You usually get the Promise object itself instead of its resolved value, which can cause subtle bugs like trying to use a Promise where a value was expected, or code proceeding before the async operation completes.

---

## Event Loop — Very Important

**15. Explain the Node.js event loop.**
The event loop is the mechanism that allows Node.js to perform non-blocking, asynchronous operations despite JavaScript being single-threaded. It continuously checks a queue of callbacks (from timers, I/O, promises, etc.) and executes them once the current call stack is empty, cycling through defined phases.

**16. What are the phases of the event loop?**
The main phases, in order, are:
- **Timers** – executes callbacks scheduled by `setTimeout`/`setInterval`
- **Pending callbacks** – executes some system-level callbacks (e.g., certain TCP errors)
- **Idle, prepare** – internal use
- **Poll** – retrieves new I/O events and executes their callbacks
- **Check** – executes `setImmediate()` callbacks
- **Close callbacks** – executes callbacks like `socket.on('close')`

Microtasks (Promises, `process.nextTick`) are drained between each phase, not as a separate phase.

**17. Difference between `setTimeout()` and `setImmediate()`?**
`setTimeout(fn, 0)` schedules a callback to run after a minimum delay in the timers phase. `setImmediate(fn)` schedules a callback to run in the check phase, after the current poll phase completes. Inside an I/O callback, `setImmediate()` will always run before `setTimeout(fn, 0)`; outside I/O, the order can vary based on timing.

**18. What is `process.nextTick()`?**
A function that queues a callback to run immediately after the current operation completes, before the event loop continues to the next phase — it runs even before Promise microtasks in Node's queue ordering. It has higher priority than any event loop phase.

**19. What's the difference between microtasks and macrotasks?**
Microtasks (Promise callbacks, `process.nextTick`) are executed immediately after the current synchronous code finishes and before the event loop moves to the next phase. Macrotasks (`setTimeout`, `setImmediate`, I/O callbacks) are executed in their respective event loop phases, after all pending microtasks have run.

**20. What happens when CPU-intensive code runs in Node.js?**
Long synchronous computations can block the main JavaScript thread and prevent the event loop from processing other requests, timers, or I/O callbacks — causing the entire application to become unresponsive until the computation finishes.

**Classic interview trace question:**
```js
console.log("A");

setTimeout(() => console.log("B"), 0);

Promise.resolve().then(() => console.log("C"));

console.log("D");
```

**Output:**
```text
A
D
C
B
```

*Why:* Synchronous code (`A`, `D`) runs first. Then the microtask queue (Promise `.then`, `C`) is drained before the event loop proceeds to the timers phase, where the `setTimeout` callback (`B`) finally executes.

---

## Backend / API Questions

**21. What is middleware in Express.js?**
A function with access to the request, response, and `next()` function, used to execute code, modify request/response objects, end the request-response cycle, or call the next middleware in the stack.

**22. Difference between `app.use()` and `app.get()`?**
`app.use()` mounts middleware for all HTTP methods (and optionally a specific path), while `app.get()` registers a route handler specifically for GET requests on a given path.

**23. How do you implement centralized error handling?**
By defining an Express error-handling middleware (a function with four parameters: `(err, req, res, next)`) placed after all other routes/middleware, so any error passed via `next(err)` is caught and handled consistently in one place.

**24. How do you handle authentication in a Node.js API?**
Common approaches include session-based authentication (cookies + server-side session store), token-based authentication (JWT sent via headers), or OAuth for third-party login, often combined with middleware that verifies credentials before allowing access to protected routes.

**25. Authentication vs authorization?**
Authentication verifies *who* a user is (e.g., login credentials). Authorization determines *what* an authenticated user is allowed to do (e.g., role- or permission-based access control).

**26. How would you implement JWT authentication?**
On login, verify credentials and issue a signed JWT containing user claims. The client sends this token (typically in an `Authorization: Bearer` header) on subsequent requests. Middleware verifies the token's signature and expiry before granting access to protected routes. Refresh tokens are often used to issue new access tokens without re-authenticating.

**27. How should passwords be stored?**
Passwords should be hashed using an appropriate password-hashing algorithm such as Argon2 or bcrypt (which include salting and are designed to be slow to resist brute-force attacks), rather than stored as plaintext or with fast general-purpose hashes like MD5/SHA-256 alone.

**28. How do you validate API input?**
By using schema-validation libraries (e.g., Joi, Zod, express-validator) to check types, required fields, formats, and ranges before processing a request, rejecting invalid input early with clear error messages.

**29. How do you implement pagination?**
Common strategies include offset-based pagination (`LIMIT`/`OFFSET` with `page` and `pageSize` query params) and cursor-based pagination (using a unique, sortable field like an ID or timestamp as a cursor), the latter being more efficient and stable for large or frequently changing datasets.

**30. How would you implement rate limiting?**
By tracking request counts per client (e.g., by IP or API key) over a time window using an in-memory store or, for distributed systems, a shared store like Redis, and rejecting requests that exceed the configured threshold (often with libraries like `express-rate-limit`).

---

## Intermediate / Advanced Node.js

**31. What are streams?**
Streams process data incrementally rather than loading an entire dataset into memory, making them efficient for handling large files or data transfers.

**32. What are the different types of streams?**
- **Readable** – source of data (e.g., reading a file)
- **Writable** – destination for data (e.g., writing to a file)
- **Duplex** – both readable and writable (e.g., a TCP socket)
- **Transform** – a duplex stream that modifies data as it passes through (e.g., compression)

**33. What is a Buffer?**
A Buffer is a fixed-size chunk of raw binary data allocated outside the V8 heap, used to handle binary data such as file contents or network packets.

**34. What is stream backpressure?**
Backpressure occurs when a writable stream can't process incoming data as fast as a readable stream is producing it. Node.js signals this so the reader can pause until the writer catches up, preventing excessive memory buildup.

**35. What is the purpose of `EventEmitter`?**
It provides a pattern for objects to emit named events and register listener functions that respond to those events, forming the backbone of Node's event-driven architecture (used by streams, HTTP servers, etc.).

**36. What is libuv?**
A C library that provides Node.js with an event loop, asynchronous I/O, and a thread pool, abstracting platform differences (Windows, Linux, macOS) for non-blocking operations.

**37. What is the Node.js thread pool?**
A pool of worker threads (managed by libuv, default size 4) used to offload certain blocking operations — like file system calls, DNS lookups, and some crypto functions — so they don't block the main event loop thread.

**38. What operations use the libuv thread pool?**
File system operations (`fs` module), DNS lookups (`dns.lookup`), some crypto functions (like `pbkdf2`, `scrypt`), and compression (`zlib`) typically use the thread pool.

**39. What are Worker Threads?**
A Node.js module that allows running JavaScript in parallel on separate threads within the same process, useful for CPU-intensive tasks, with each worker having its own V8 instance and event loop, communicating via message passing.

**40. Worker Threads vs Child Processes?**
Worker Threads share memory (via `SharedArrayBuffer`) within the same process and are lighter-weight, ideal for CPU-bound JavaScript tasks. Child Processes run as fully separate OS processes (potentially different programs), each with its own memory space, useful for running external commands or isolating crashes.

**41. How would you handle CPU-intensive operations without blocking the event loop?**
Offload the work to Worker Threads, a child process, or an external service/queue, or break the work into smaller asynchronous chunks (e.g., using `setImmediate` between chunks) so the event loop can continue processing other requests.

**42. How does Node.js handle thousands of concurrent requests?**
Through its non-blocking, event-driven I/O model — a single thread handles many connections by delegating I/O work to the OS/libuv and processing results via callbacks/events, avoiding the overhead of one thread per connection.

---

## Real-World Scenario Questions

**43. Your Node.js API suddenly becomes slow in production. How would you debug it?**
Check application logs and metrics (latency, throughput, error rates) first, then use profiling tools (`clinic.js`, `node --prof`, or APM tools like New Relic/Datadog) to identify slow endpoints, inspect database query performance, check for blocking synchronous code, and review recent deployments or dependency changes.

**44. Your application is consuming 90% CPU. How would you investigate?**
Use a CPU profiler (`node --prof` + `node --prof-process`, or `clinic flame`) to capture a flame graph and identify hot functions, check for inefficient loops, synchronous blocking calls, unbounded recursion, or a busy event loop, and correlate spikes with specific request patterns or recent code changes.

**45. Memory usage continuously increases. How would you identify a memory leak?**
Take heap snapshots at intervals (using Chrome DevTools or `node --inspect`) and compare them to spot objects that keep growing, check for common leak sources like uncleared timers/intervals, global variable accumulation, unclosed event listeners, or caches without eviction, and use tools like `clinic heap` or `memwatch` to narrow down the cause.

**46. An API is receiving 10,000 requests per second. How would you design it?**
Use horizontal scaling (multiple Node.js instances behind a load balancer, or the built-in `cluster` module), add caching layers (Redis/CDN) to reduce backend load, optimize database access (indexing, connection pooling, read replicas), implement rate limiting, and keep handlers non-blocking and efficient.

**47. How would you prevent duplicate API requests from creating duplicate database records?**
Use idempotency keys (a unique client-generated ID per logical request) to detect and reject repeat submissions, enforce unique constraints at the database level, and/or use atomic operations like "upsert" instead of separate check-then-insert logic.

**48. How would you implement graceful shutdown?**
Listen for termination signals (`SIGTERM`, `SIGINT`), stop accepting new connections (`server.close()`), let in-flight requests finish within a timeout, close database/queue connections cleanly, and then exit the process.

**49. How do you handle uncaught exceptions and unhandled Promise rejections?**
Attach listeners for `process.on('uncaughtException', ...)` and `process.on('unhandledRejection', ...)` primarily for logging and safe shutdown — since the process is in an undefined state after such errors, best practice is to log the error and gracefully restart the process (e.g., via a process manager like PM2) rather than trying to keep running.

**50. How would you structure a production Node.js application?**
Organize by layers/features (routes, controllers, services, models, middleware, config), separate concerns clearly, use environment-based configuration, centralize error handling and logging, include automated tests, and follow consistent naming and folder conventions to keep the codebase maintainable as it grows.

**51. How would you improve Node.js API performance?**
Use caching (in-memory or Redis), optimize database queries and indexing, use connection pooling, enable compression (gzip), avoid blocking synchronous code, use clustering/load balancing to use multiple CPU cores, and profile to find and fix actual bottlenecks rather than guessing.

**52. How would you implement caching with Redis?**
Store frequently accessed or expensive-to-compute data in Redis with an appropriate expiration (TTL), check the cache before hitting the database ("cache-aside" pattern), and invalidate or update the cache when the underlying data changes.

**53. How would you process long-running background jobs?**
Offload jobs to a queue (e.g., BullMQ, RabbitMQ, or AWS SQS) processed by separate worker processes, so the main API can respond quickly while workers handle the job asynchronously, with retry logic and monitoring for failures.

**54. How would you secure a public Node.js REST API?**
Use HTTPS, validate and sanitize all input, implement authentication/authorization, apply rate limiting, set secure HTTP headers (e.g., via `helmet`), avoid exposing stack traces or sensitive errors, keep dependencies updated, and follow the principle of least privilege for database/service access.

**55. How would you implement logging and monitoring in production?**
Use structured logging (e.g., with `pino` or `winston`) with consistent log levels, centralize logs (e.g., ELK stack, Datadog), track key metrics (latency, error rate, throughput) with an APM tool, and set up alerts for anomalies or threshold breaches.

---

## Priority Areas for a 3–5 Years Experience Interview

For a mid-to-senior level Node.js interview, prioritize:

- Event loop internals
- Promises / async-await
- Streams
- Express middleware
- REST API design
- Authentication / JWT
- Databases
- Redis / caching
- Error handling
- Security
- Performance optimization
- Worker Threads
- Production debugging
