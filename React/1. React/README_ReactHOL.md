# React Hands-On Lab: Setting Up a React Environment

## Objectives

- Define SPA and its benefits
- Define React and identify its working
- Identify the differences between SPA and MPA
- Explain Pros & Cons of Single-Page Application
- Explain about React
- Define virtual DOM
- Explain Features of React

In this hands-on lab, you will learn how to:
- Set up a React environment
- Use `create-react-app`

## Prerequisites

- Node.js
- NPM
- Visual Studio Code

**Estimated time to complete this lab:** 30 minutes.

## Task

Create a new React application named **"myfirstreact"**. Run the application to print **"welcome to the first session of React"** as the heading of the page.

---

## Steps

### 1. Install Node.js and NPM
Download and install from: https://nodejs.org/en/download/

Verify installation:
```bash
node -v
npm -v
```

### 2. Install `create-react-app`
```bash
npm install -g create-react-app
```

### 3. Create the React application
```bash
npx create-react-app myfirstreact
```

### 4. Navigate into the project folder
```bash
cd myfirstreact
```

### 5. Open the folder in Visual Studio Code
```bash
code .
```

### 6. Open `App.js`
Located at: `myfirstreact/src/App.js`

### 7. Replace the contents of `App.js`
Remove the existing boilerplate and replace it with:

```jsx
import React from 'react';

function App() {
  return (
    <div>
      <h1>welcome to the first session of React</h1>
    </div>
  );
}

export default App;
```

### 8. Run the application
```bash
npm start
```

### 9. View the result
Open a browser window and go to:
```
http://localhost:3000
```

You should see **"welcome to the first session of React"** displayed as the page heading.

---

## Files

| File | Role |
|---|---|
| `App.js` | The replacement content for `myfirstreact/src/App.js`, rendering the required heading |

## Key Concepts (for the objectives above)

| Concept | Explanation |
|---|---|
| **SPA (Single-Page Application)** | A web app that loads a single HTML page and dynamically updates content via JavaScript, without full page reloads on navigation. |
| **MPA (Multi-Page Application)** | A traditional web app where each navigation loads a new HTML page from the server. |
| **SPA Pros** | Faster subsequent navigation (no full reloads), smoother UX, feels like a native app. |
| **SPA Cons** | Larger initial JS bundle, SEO can be harder without extra tooling, more complex client-side state management. |
| **React** | A JavaScript library (not a full framework) for building user interfaces using reusable, composable components. |
| **Virtual DOM** | An in-memory representation of the real DOM that React uses to calculate the minimal set of changes needed, then applies only those changes to the actual browser DOM — improving performance over direct DOM manipulation. |
| **Key Features of React** | Component-based architecture, Virtual DOM, JSX syntax, one-way data binding, reusable UI components, large ecosystem. |

## Expected Output

Browser at `http://localhost:3000` displays:

```
welcome to the first session of React
```
