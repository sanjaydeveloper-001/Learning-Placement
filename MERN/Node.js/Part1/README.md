# Node.js Interview Questions for Freshers (Basic Level)

A beginner-friendly question set focused on fundamentals — ideal for freshers or entry-level Node.js interviews.

---

**1. What is Node.js?**
Node.js is a JavaScript runtime built on Chrome's V8 engine that allows JavaScript to run outside the browser, commonly used for building servers and backend applications.

**2. Why is Node.js used for backend development?**
Because it's fast (thanks to V8), uses non-blocking I/O for handling many requests efficiently, uses JavaScript on both frontend and backend, and has a huge package ecosystem via npm.

**3. Is Node.js a programming language or a framework?**
Neither — it's a **runtime environment** that lets JavaScript code run outside a web browser.

**4. What is the difference between Node.js and JavaScript in the browser?**
Browser JavaScript can access the DOM, window object, and browser APIs. Node.js runs outside the browser, so it has no DOM, but instead provides modules for file systems, networking, and OS-level operations.

**5. Is Node.js single-threaded?**
Yes, the main JavaScript execution thread is single-threaded, but Node.js can still handle multiple operations concurrently using the event loop and background threads (via libuv) for tasks like file I/O.

**6. What is npm?**
npm (Node Package Manager) is used to install, manage, and share reusable packages/libraries for Node.js projects. It also lets you run project scripts.

**7. What is `package.json`?**
A configuration file in every Node.js project that stores metadata like the project name, version, dependencies, and scripts.

**8. How do you install a package using npm?**
```bash
npm install package-name
```
Add `-D` or `--save-dev` if it's only needed during development:
```bash
npm install package-name -D
```

**9. What is the difference between `dependencies` and `devDependencies`?**
`dependencies` are needed for the app to run (e.g., express). `devDependencies` are only needed during development (e.g., nodemon, testing tools).

**10. What is a module in Node.js?**
A module is a reusable block of code (a file) that can be exported from one file and imported/used in another.

**11. What is `require()` used for?**
`require()` is used to import a module (built-in, third-party, or custom) into a file.
```js
const fs = require("fs");
```

**12. What is `module.exports`?**
It's used to export functions, objects, or values from a file so they can be used in other files via `require()`.
```js
// math.js
module.exports = function add(a, b) {
  return a + b;
};
```

**13. What are the different types of modules in Node.js?**
- **Core/Built-in modules** – come with Node.js (e.g., `fs`, `http`, `path`)
- **Local/Custom modules** – files you create in your project
- **Third-party modules** – installed via npm (e.g., `express`)

**14. What is the `fs` module used for?**
The `fs` (File System) module lets you read, write, update, delete, and manage files and directories.

**15. What is the `http` module used for?**
It allows you to create a basic web server without any external framework.
```js
const http = require("http");
http.createServer((req, res) => {
  res.end("Hello World");
}).listen(3000);
```

**16. What is the `path` module used for?**
It provides utilities for working with file and directory paths, such as joining paths or getting file extensions.

**17. What is a callback function?**
A function passed as an argument to another function, meant to be executed after some operation completes (often asynchronous).

**18. What is synchronous vs asynchronous code?**
Synchronous code runs line by line, blocking further execution until the current task finishes. Asynchronous code allows the program to continue running while waiting for a task (like a file read or API call) to complete.

**19. What is a Promise (in simple terms)?**
An object that represents a value that may be available now, later, or never — used to handle asynchronous operations more cleanly than callbacks.

**20. What is `async/await`?**
A simpler, more readable way to work with Promises, letting asynchronous code look like regular synchronous code.
```js
async function getData() {
  const result = await fetchData();
  console.log(result);
}
```

**21. What is the event loop (in simple terms)?**
It's the mechanism that lets Node.js handle multiple operations without waiting for each one to finish one at a time, by managing a queue of tasks and executing them when the main thread is free.

**22. What is an event-driven architecture?**
A design where actions ("events") trigger specific functions ("listeners"), commonly used in Node.js via the `EventEmitter` class.

**23. What is `EventEmitter`?**
A built-in Node.js class that allows objects to emit named events and lets other parts of the code listen and react to those events.

**24. What is Express.js?**
A lightweight and popular web framework for Node.js that simplifies building web servers and APIs by providing routing, middleware support, and other utilities.

**25. How do you create a simple server using Express.js?**
```js
const express = require("express");
const app = express();

app.get("/", (req, res) => {
  res.send("Hello World");
});

app.listen(3000, () => console.log("Server running on port 3000"));
```

**26. What is middleware in Express.js (basic explanation)?**
A function that runs between receiving a request and sending a response — used for tasks like logging, authentication, or parsing data.

**27. What is REST API?**
An architectural style for building web services where resources (like users or products) are accessed and manipulated using standard HTTP methods (GET, POST, PUT, DELETE).

**28. What are the common HTTP methods used in APIs?**
- **GET** – retrieve data
- **POST** – create new data
- **PUT/PATCH** – update existing data
- **DELETE** – remove data

**29. What is JSON and why is it used in Node.js APIs?**
JSON (JavaScript Object Notation) is a lightweight data format used to exchange data between a client and server, because it's easy for both humans and machines to read and matches JavaScript's object syntax closely.

**30. What is the difference between `let`, `const`, and `var`?**
- `var` – function-scoped, can be redeclared and updated (older syntax)
- `let` – block-scoped, can be updated but not redeclared in the same scope
- `const` – block-scoped, cannot be reassigned after declaration

**31. What is a global object in Node.js?**
In Node.js, `global` is the equivalent of `window` in browsers — it provides globally accessible variables and functions like `setTimeout`, `console`, and `process`.

**32. What is `process` in Node.js?**
A global object that provides information about, and control over, the current Node.js process — such as `process.argv` (command-line arguments), `process.env` (environment variables), and `process.exit()`.

**33. How do you read environment variables in Node.js?**
```js
console.log(process.env.PORT);
```
Environment variables are often stored in a `.env` file and loaded using a package like `dotenv`.

**34. What is the difference between `console.log()` and `throw`?**
`console.log()` simply prints output to the console for debugging. `throw` raises an error that stops normal execution unless it's caught with a `try...catch` block.

**35. How do you handle errors in Node.js?**
Using `try...catch` for synchronous code, `.catch()` for Promises, or passing errors to callback functions (`callback(err, data)`), and centralized error-handling middleware in frameworks like Express.

**36. What is NPM's `package-lock.json` file for?**
It locks the exact versions of installed dependencies (including nested ones) to ensure consistent installs across different machines and environments.

**37. How do you run a Node.js file?**
```bash
node filename.js
```

**38. What is nodemon and why is it used?**
A development tool that automatically restarts the Node.js server whenever it detects file changes, saving you from manually restarting the server during development.

**39. What is the difference between a Node.js application and a browser-based JavaScript application?**
Node.js apps run on a server (no DOM, has file system/network access), while browser apps run on the client and can manipulate the DOM but have restricted access to the underlying operating system for security reasons.

**40. What are some real-world use cases of Node.js?**
Building REST APIs, real-time applications (chat apps, live notifications), streaming services, microservices, command-line tools, and backend servers for web/mobile applications.

---

## Tips for Freshers

- Be comfortable explaining Node.js basics **in your own words**, not just definitions.
- Practice writing a simple Express server and a basic file read/write example — interviewers often ask you to code these live.
- Understand the difference between **synchronous vs asynchronous** code deeply; it's one of the most commonly probed basics.
- Know how to use `npm install`, `package.json`, and basic Git commands — practical workflow questions are common for freshers.
