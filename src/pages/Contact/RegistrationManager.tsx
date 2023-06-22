
import { Text } from "@chakra-ui/react";
import Appfooter from "../../components/Appfooter";
import RegisterIntraCourse from "../../components/RegisterIntraCourse";
import { useLocation } from 'react-router-dom';

const RegistrationManager = () => {
    const location = useLocation();
    const courseName = location.state.courseName;
    /* const courseName = location.state.courseName;
    console.log(location.state.courseName);  */

    return (
        <>
        <Text>RegistrationManager</Text>
        <Text>Registration Course Name : {courseName}</Text>
        <RegisterIntraCourse courseName={courseName}/>
        <Appfooter />
        </>
        
    );
};

export default RegistrationManager;