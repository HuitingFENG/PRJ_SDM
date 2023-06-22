import React, { useState } from 'react';
import { useParams } from 'react-router-dom';
import Appfooter from '../../components/Appfooter';
import axios from 'axios';
import { Box, Flex, Link, Text, Image, Button, Stack, Center } from '@chakra-ui/react';
import { Link as RouterLink, BrowserRouter as Router, Routes, Route } from "react-router-dom";
import { useNavigate } from 'react-router-dom';

type TestProps = {
    courseName: string;
};

const Test: React.FC<TestProps> = ({ courseName }) => {
    const [score, setScore] = useState<number | null>(null);
    const [level, setLevel] = useState<string>("");
    const [errorMsg, setErrorMsg] = useState<string>("");
    const navigate = useNavigate();

    const handleRegistration = () => {
        navigate('/register', { state: { courseName } });
    };

    function getRandomNumber(min: number, max: number) {
        return Math.floor(Math.random() * (max - min + 1)) + min;
    }

    const handleClick = () => {
        const newScore = getRandomNumber(0, 20);
        setScore(newScore);

        if(newScore <= 5) {
            setLevel("Low");
            setErrorMsg("Sorry, you level is too weak, so you cannot register for this course.");
        } else if(newScore <= 15) {
            setLevel("Medium");
            setErrorMsg("");
        } else {
            setLevel("High");
            setErrorMsg("Sorry, you level is too high, so you cannot register for this course.");
        }
    }


    return (
        <>
            <p>Course Name : {courseName}</p>
            <Text>Click on here <Button colorScheme='teal' onClick={handleClick}> TEST </Button></Text>
            {score !== null && (
            <>
                <Text>Your score is: {score}</Text>
                <Text>Your level is: {level}</Text>
                {level === "Medium" && (
                    <Flex direction="row" gap= {5} justifyContent="flex-start" alignItems="center">
                        <Text>Great, you can register for this course. Please click on one of two buttons:</Text>
                        <Button colorScheme='teal'><RouterLink to="/contact/salesDepartment">Contact sales department agent</RouterLink></Button>
                        <Button colorScheme='teal' onClick={handleRegistration}>Register online by myself</Button>
                    </Flex>
                )}
                {errorMsg && <Text color="red">{errorMsg}</Text>}
            </>
        )}
            <Appfooter />

        </>
    ); 
};

export default Test;
