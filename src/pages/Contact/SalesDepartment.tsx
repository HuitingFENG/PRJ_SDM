
import { Text, Button, Flex, Box } from "@chakra-ui/react";
import Appfooter from "../../components/Appfooter";

const SalesDepartment = () => {
    return (
        <>
        <Flex direction="column" alignItems="flex-start">
            <Text>SalesDepartment</Text>
            <Text>Contact us for more registration information by:</Text>
            <Box color="teal"><Text>Email: sales.department@efrei.fr</Text></Box>
            <Box color="teal"><Text>Phone: 01 23 45 67 89</Text></Box>
        </Flex>
        <Appfooter />
        </>
        
    );
};

export default SalesDepartment;