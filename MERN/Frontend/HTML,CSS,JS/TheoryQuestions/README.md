---

# 🌐 Core Web & HTML Theory Questions

### 1. How does HTML represent a website in the browser?

**Answer:**
HTML provides the structure of a webpage. The browser parses HTML, builds a **DOM (Document Object Model)** tree, and renders elements visually using CSS and layout rules.

---

### 2. What is the DOM?

**Answer:**
The DOM is a tree-like representation of HTML elements created by the browser, allowing JavaScript to access and manipulate content dynamically.

---

### 3. What happens when you enter a URL in the browser?

**Answer:**

1. DNS resolves domain → IP
2. Browser sends HTTP request
3. Server responds with HTML
4. Browser parses HTML → DOM
5. Fetches CSS/JS
6. Renders page

---

### 4. Difference between HTML and HTML5?

**Answer:**
HTML5 introduced semantic tags (`header`, `footer`), APIs (Canvas, Geolocation), audio/video support, and better form controls.

---

### 5. What are semantic elements and why are they important?

**Answer:**
Semantic elements describe meaning (e.g., `article`, `section`). They improve SEO, accessibility, and code readability.

---

### 6. What is the difference between inline and block elements?

**Answer:**
Inline: takes only needed width (e.g., span)
Block: takes full width (e.g., div)

---

### 7. What is the difference between id and class?

**Answer:**

* id → unique
* class → reusable

---

### 8. What is accessibility in web development?

**Answer:**
Designing websites usable by people with disabilities using proper semantics, ARIA labels, etc.

---

# 🎨 CSS Theory Questions

### 9. How does CSS work with HTML?

**Answer:**
CSS styles HTML elements. The browser combines DOM + CSSOM → Render Tree → Layout → Paint.

---

### 10. What is CSS specificity?

**Answer:**
Rules determine which style applies:
Inline > ID > Class > Element

---

### 11. What is the box model?

**Answer:**
Content + Padding + Border + Margin = Total space of an element

---

### 12. Difference between margin and padding?

**Answer:**

* Margin → outside spacing
* Padding → inside spacing

---

### 13. What is Flexbox?

**Answer:**
A 1D layout system for aligning items in rows or columns.

---

### 14. What is CSS Grid?

**Answer:**
A 2D layout system for rows and columns.

---

### 15. What is responsive design?

**Answer:**
Designing websites to adapt to different screen sizes using media queries, flexible layouts.

---

### 16. What are media queries?

**Answer:**
Used to apply styles based on screen size/device.

---

### 17. What is z-index?

**Answer:**
Controls vertical stacking of elements.

---

### 18. What is display property?

**Answer:**
Defines how elements behave (block, inline, flex, grid, none).

---

# ⚡ JavaScript Theory Questions

### 19. What is JavaScript used for?

**Answer:**
Adds interactivity, handles logic, communicates with servers, and manipulates DOM.

---

### 20. Difference between var, let, const?

**Answer:**

* var → function scoped
* let → block scoped
* const → constant value

---

### 21. What is closure?

**Answer:**
A function remembering variables from its outer scope.

---

### 22. What is hoisting?

**Answer:**
Variables/functions are moved to the top during execution.

---

### 23. What is event bubbling?

**Answer:**
Event propagates from child → parent elements.

---

### 24. What is event delegation?

**Answer:**
Handling events at parent level instead of multiple children.

---

### 25. What is asynchronous JavaScript?

**Answer:**
Allows non-blocking execution (e.g., API calls).

---

### 26. What is Promise?

**Answer:**
Handles async operations (pending, resolved, rejected).

---

### 27. What is async/await?

**Answer:**
Cleaner syntax for handling promises.

---

### 28. What is JSON?

**Answer:**
Lightweight data format used in APIs.

---

### 29. What is localStorage vs sessionStorage?

**Answer:**

* localStorage → permanent
* sessionStorage → cleared on tab close

---

# 🔗 Frontend + Backend Integration

### 30. How to connect frontend with backend?

**Answer:**
Using APIs:

* Frontend sends HTTP request (fetch/AJAX)
* Backend processes request
* Sends response (JSON)
* Frontend updates UI

---

### 31. What is REST API?

**Answer:**
A standard way for communication using HTTP methods (GET, POST, PUT, DELETE).

---

### 32. What is HTTP request/response?

**Answer:**
Client sends request → server responds with data/status.

---

### 33. What is CORS?

**Answer:**
Security mechanism controlling cross-origin requests.

---

### 34. What is AJAX?

**Answer:**
Allows updating parts of a page without reload.

---

### 35. What is fetch API?

**Answer:**
Modern way to make HTTP requests in JavaScript.

---

# 🧠 Advanced Concepts

### 36. What is rendering pipeline?

**Answer:**
DOM + CSSOM → Render Tree → Layout → Paint → Composite

---

### 37. What is reflow and repaint?

**Answer:**

* Reflow → layout recalculation
* Repaint → visual update

---

### 38. What is SEO?

**Answer:**
Optimizing site visibility in search engines.

---

### 39. What is SPA (Single Page Application)?

**Answer:**
Loads one HTML page and dynamically updates content (e.g., React apps).

---

### 40. What is hydration?

**Answer:**
Attaching JavaScript to server-rendered HTML.

---

### 41. What is CDN?

**Answer:**
Content Delivery Network to load assets faster globally.

---

### 42. What is browser cache?

**Answer:**
Stores files locally to improve performance.

---

### 43. What is web security basics?

**Answer:**
Includes protection from XSS, CSRF, HTTPS usage.

---

### 44. What is HTTPS?

**Answer:**
Secure HTTP using encryption (SSL/TLS).

---

## ✅ Summary

These questions test:

* Real understanding of **how web works**
* Not just syntax, but **architecture + flow**
* Very useful for **interviews (especially MNCs & startups)**

---
