import * as React from "react";
import { ChakraProvider } from "@chakra-ui/react";
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Home from "./pages/Home/Home";
import CatalogManager from "./pages/CatalogManager/CatalogManager";
import Client from "./pages/Client/Client";
import Trainer from "./pages/Trainer/Trainer";
import Php from "./pages/Course/Php";
import JavaScript from "./pages/Course/JavaScript";
import Ajax from "./pages/Course/Ajax";
import HtmlCss from "./pages/Course/HtmlCss";
import Test from "./pages/Course/Test";
import { useParams } from 'react-router-dom';
import { RouteParams as ImportedRouteParams } from './pages/Course/RouteParams';
import Contact from "./pages/Contact/SalesDepartment";
import Register from "./pages/Register/Register";
import SalesDepartment from "./pages/Contact/SalesDepartment";
import RegistrationManager from "./pages/Contact/RegistrationManager";

function App() {
  return (
    <Router>
        <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/catalogManager" element={<CatalogManager />} />
            <Route path="/client" element={<Client />} />
            <Route path="/trainer" element={<Trainer />} />
            <Route path="/php" element={<Php />} />
            <Route path="/javascript" element={<JavaScript />} />
            <Route path="/ajax" element={<Ajax />} />
            <Route path="/html/css" element={<HtmlCss />} />
            <Route path="/contact/salesDepartment" element={<SalesDepartment />} />
            <Route path="/contact/registrationManager" element={<RegistrationManager />} />
            <Route path="/register" element={<Register />} />
            <Route path="/:courseName/test" element={<TestComponent />} />
        </Routes>  
    </Router>
  );
}

const TestComponent = () => {
  const { courseName } = useParams<ImportedRouteParams>();

  if (!courseName) {
    return <p>Course name not found</p>;
  }

  return <Test courseName={courseName} />;
}

export default App;

