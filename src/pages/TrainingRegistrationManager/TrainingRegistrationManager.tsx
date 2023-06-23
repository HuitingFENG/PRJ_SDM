import { Text, Flex } from "@chakra-ui/react";
import Appfooter from "../../components/Appfooter";
import Training from "../../components/Training";
import Evaluation from "../../components/Evaluation";
import Registration from "../../components/Registration";

const TrainingRegistrationManager = () => {

    return (
        
        <>
            <Text>
                TrainingRegistrationManager Page            
            </Text>
            <Flex direction={"row"} justifyContent={"space-around"} p={10}>
                <Flex>
                    <Registration />
                </Flex>
                <Flex>
                    <Training />
                </Flex>
                
                <Flex>
                    <Evaluation />
                </Flex>
            </Flex>
            <Appfooter />
        </>
        
    );

};

export default TrainingRegistrationManager;