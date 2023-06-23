import React from 'react';
import { Box, Flex, Link, Text, Image, Button, Stack, Center } from '@chakra-ui/react';
import { Link as RouterLink, BrowserRouter as Router, Routes, Route } from "react-router-dom";
import { motion } from 'framer-motion'; 


const Appheader = () => {
    return (
        <Flex p={4} align="center" justify="space-between">
            <Flex justify="space-between" gap={10}>  
                <Flex align="center" justify="center">
                    <Text fontWeight="bold" fontSize="xl" color='#4D77FF'>
                        IT Training Information System
                    </Text>
                </Flex>
            </Flex>

            <Flex p={3} gap={10} align="center" justify="space-between">
                <Stack direction='column' spacing={4} borderRight="1px solid black" paddingRight="40px">
                    <Text textAlign="center">CatalogManager</Text>
                    <Stack direction='row' spacing={4}>
                        <Link as={RouterLink} to="/CatalogManager" textDecoration="none" _hover={{ textDecoration: 'none' }}>
                            <Button bg='#4D77FF' colorScheme='white' variant='solid'>
                            <motion.span
                                whileHover={{ scale: 1.1 }}
                                whileTap={{ scale: 0.9 }}
                            >
                                Se Connecter
                            </motion.span>
                            </Button>
                        </Link>
                    </Stack>
                </Stack>
                <Stack direction='column' spacing={4} borderRight="1px solid black" paddingRight="40px">
                    <Text textAlign="center">TrainingRegistrationManager</Text>
                    <Stack direction='row' spacing={4}>
                        <Link as={RouterLink} to="/TrainingRegistrationManager" textDecoration="none" _hover={{ textDecoration: 'none' }}>
                            <Button bg='#4D77FF' colorScheme='white' variant='solid'>
                            <motion.span
                                whileHover={{ scale: 1.1 }}
                                whileTap={{ scale: 0.9 }}
                            >
                                Se Connecter
                            </motion.span>
                            </Button>
                        </Link>
                    </Stack>
                </Stack>
                <Stack direction='column' spacing={4} borderRight="1px solid black" paddingRight="40px">
                    <Text textAlign="center">Client</Text>
                    <Stack direction='row' spacing={4}>
                        <Link as={RouterLink} to="/Client" textDecoration="none" _hover={{ textDecoration: 'none' }}>
                            <Button bg='#4D77FF' colorScheme='white' variant='solid'>
                            <motion.span
                                whileHover={{ scale: 1.1 }}
                                whileTap={{ scale: 0.9 }}
                            >
                                Se Connecter
                            </motion.span>
                            </Button>
                        </Link>
                    </Stack>
                </Stack>
                <Stack direction='column' spacing={4}>
                    <Text textAlign="center">Trainer</Text>
                    <Stack direction='row' spacing={4}>
                        <Link as={RouterLink} to="/Trainer" textDecoration="none" _hover={{ textDecoration: 'none' }}>
                            <Button bg='#4D77FF' colorScheme='white' variant='solid'>
                            <motion.span
                                whileHover={{ scale: 1.1 }}
                                whileTap={{ scale: 0.9 }}
                            >
                                Se Connecter
                            </motion.span>
                            </Button>
                        </Link>
                    </Stack>
                </Stack>
            </Flex>
        </Flex>
    );

};

export default Appheader;