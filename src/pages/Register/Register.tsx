import { Text } from "@chakra-ui/react";
import Appfooter from "../../components/Appfooter";
import RegisterInterCourse from "../../components/RegisterInterCourse";
import { useLocation } from 'react-router-dom';

const Register = () => {
    const location = useLocation();
    const courseName = location.state.courseName;
    console.log(location.state.courseName); 

    return (
        <>
        <Text>Register</Text>
        <RegisterInterCourse courseName={courseName}/>
        <Appfooter />
        </>
    );
};

export default Register;