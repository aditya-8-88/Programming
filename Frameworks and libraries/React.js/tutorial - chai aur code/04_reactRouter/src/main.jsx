import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import "./index.css";
import App1 from "./App1.jsx";
import App2 from "./App2.jsx";
import { RouterProvider, createBrowserRouter } from "react-router-dom";
import Home from "./components/Home.jsx";
import About from "./components/About.jsx";
import Contact from "./components/Contact.jsx";
import User from "./components/User.jsx";
import GitHub from "./components/GitHub.jsx";

const router = createBrowserRouter([
  {
    path: "/",
    element: <App1 />,
    children: [
      {
        path: "",
        element: <Home />,
      },
      {
        path: "about",
        element: <About />,
      },
      {
        path: "contact",
        element: <Contact />,
      },
    ],
  },
  {
    path: "/user",
    element: <App2 />,
    children:[
      {
        path:":id",
        element:<User/>
      },
      {
        path:"github",
        element:<GitHub/>
      },
      {
        path:"github/:username",
        element:<GitHub/>
      },
    ]
  }
]);

createRoot(document.getElementById("root")).render(
  <StrictMode>
    <RouterProvider router={router} />
  </StrictMode>
);
