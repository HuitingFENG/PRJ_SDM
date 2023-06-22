import { Flex, Box, Link } from "@chakra-ui/react";
import { Link as RouterLink, BrowserRouter as Router, Routes, Route } from "react-router-dom";
import { ArrowBackIcon } from '@chakra-ui/icons';

const Appfooter = () => {
    return (
        <Box position="fixed" bottom={5} left={5} width="100%">
            <Flex direction="row" position="absolute" bottom={0} color="#4D77FF" justify="center" align="center">
                <Link  as={RouterLink} to="/">
                    <Box w="12" h="6">
                    <ArrowBackIcon boxSize="100%" />
                    </Box>
                </Link>
                <Link as={RouterLink} to="/">
                    Return to home page
                </Link>
            </Flex>  
        </Box>
        
    );
};

export default Appfooter;