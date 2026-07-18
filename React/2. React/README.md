# React Hands-On Lab: React Components (StudentApp)

## Objectives

- Explain React components
- Identify the differences between components and JavaScript functions
- Identify the types of components
- Explain class component
- Explain function component
- Define component constructor
- Define `render()` function

In this hands-on lab, you will learn how to:
- Create a class component
- Create multiple components
- Render a component

## Prerequisites

- Node.js
- NPM
- Visual Studio Code

**Estimated time to complete this lab:** 30 minutes.

## Task

Create a React app for a Student Management Portal named **StudentApp** and create:
- A component named **Home** displaying "Welcome to the Home page of Student Management Portal"
- A component named **About** displaying "Welcome to the About page of the Student Management Portal"
- A component named **Contact** displaying "Welcome to the Contact page of the Student Management Portal"

Call all three components from `App.js`.

---

## Steps

### 1. Create the React project
```bash
npx create-react-app StudentApp
```

### 2. Navigate into the project
```bash
cd StudentApp
```

### 3. Create the Components folder
Inside `src/`, create a new folder named `components`.

### 4. Create `Home.js`
Add the file `src/components/Home.js` with the Home component code (see below).

### 5. Create `About.js`
Add the file `src/components/About.js` with the About component code.

### 6. Create `Contact.js`
Add the file `src/components/Contact.js` with the Contact component code.

### 7. Edit `App.js`
Import and render `Home`, `About`, and `Contact`.

### 8. Run the application
```bash
npm start
```

### 9. View the result
Open a browser and go to:
```
http://localhost:3000
```

---

## Project Structure

```
StudentApp/
└── src/
    ├── App.js
    └── components/
        ├── Home.js
        ├── About.js
        └── Contact.js
```

## Files

| File | Role |
|---|---|
| `src/components/Home.js` | Class component rendering the Home page message |
| `src/components/About.js` | Class component rendering the About page message |
| `src/components/Contact.js` | Class component rendering the Contact page message |
| `src/App.js` | Imports and renders all three components together |

## Key Concepts (for the objectives above)

| Concept | Explanation |
|---|---|
| **Component** | A reusable, self-contained piece of UI in React — unlike a plain JS function, a component returns JSX (markup) and can have its own state and lifecycle. |
| **Component vs. JS function** | A JS function just takes inputs and returns a value. A React component takes `props` as input and returns JSX describing what should appear on screen — React manages calling and re-rendering it. |
| **Types of components** | **Class components** (ES6 classes extending `React.Component`, with a `render()` method) and **Function components** (plain JS functions returning JSX, often using Hooks for state). |
| **Class component** | Defined with `class X extends Component`, requires a `render()` method, can use `this.state` and lifecycle methods (`componentDidMount`, etc.). Used for `Home`, `About`, `Contact` here. |
| **Function component** | A simpler alternative: `function X() { return <div>...</div>; }` — no `this`, uses Hooks (`useState`, `useEffect`) for state and side effects. `App` in this lab is written as a function component. |
| **Constructor** | The `constructor(props)` method in a class component, always calling `super(props)` first — used to initialize `this.state` and bind event handler methods. |
| **`render()`** | The required method in a class component that returns the JSX to display. React calls it whenever the component needs to re-render. |

## Expected Output

Browser at `http://localhost:3000` displays, stacked vertically:

```
Welcome to the Home page of Student Management Portal
Welcome to the About page of the Student Management Portal
Welcome to the Contact page of the Student Management Portal
```
