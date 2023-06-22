import { Text } from "@chakra-ui/react";
import React, { useState, useEffect } from "react";
import { FormControl,FormLabel, Input, Button, Box, Flex } from "@chakra-ui/react";
import { ReactNode } from "react";
import axios from 'axios';
import Course from "./Course";

type CourseProps = {
    courseName: string;
};

interface Course {
    courseName: string;
    coursePrice: number;
    courseDates: Date;
    courseLocations: string;
    courseContent: string;
}

const RegisterInterCourse : React.FC<CourseProps> = ({ courseName })=> {
    const [registrationType, setType] = useState("");
    const [registrationDate, setDate] = useState("");
    const [registrationLocation, setLocation] = useState("");
    const [registrationContact, setContact] = useState("");
    const [registrationName, setName] = useState("");
    const [registrationCompany, setCompany] = useState("");
    const [registrationCourseID, setCourseID] = useState("");
    const [registrationComments, setComments] = useState("");
    const [registrations, setRegistrations] = useState([]);
    const [course, setCourse] = useState<Course | null>(null);
    const [courseData, setCourseData] = useState<Course[]>([]);
    //const [Msg, setMsg] = useState("");
    const [Msg, setMsg] = useState<string[]>([]);


    useEffect(() => {
        const fetchCourse = async () => {
            try {
                const allCoursesResponse = await axios.get(`http://localhost:8080/course/getAll`);
                console.log("Result1 = ", allCoursesResponse)

                // Find the course with the given name
                const courseData = allCoursesResponse.data.find((course: { courseName: string; }) => course.courseName === courseName);
                console.log("Result2 = ", courseData)

                // Fetch the course details using the course ID
                const detailsResponse = await axios.get(`http://localhost:8080/course/${courseData.courseID}`);
                console.log("Result3 = ", detailsResponse)
                setCourse(detailsResponse.data);
                setCourseID(detailsResponse.data.courseID);
                setComments("")
                setType("inter")
                setLocation(detailsResponse.data.courseLocations)
                setDate(detailsResponse.data.courseDates)
            } catch (error) {
                console.error("Failed to fetch course", error);
            }
        };
        fetchCourse();
    }, [courseName]);



    const handleAddRegistration = (e: React.FormEvent) => {
        e.preventDefault();
        const registration = {registrationType, registrationDate, registrationLocation, registrationContact, registrationName, registrationCompany, registrationCourseID, registrationComments}
        console.log(registration)
        fetch("http://localhost:8080/registration/add", {
            method:"POST",
            headers:{"Content-Type":"application/json"},
            body:JSON.stringify(registration)
        }).then(()=>{
            console.log("New registration is added.")
            //setMsg("Your registration is successful. Course Contact: "+registration.registrationContact+", Course Name: "+registration.registrationName+", Course Company: "+registration.registrationCompany+".");
            setMsg([
                "Your registration is successful. Other infos are as below :",
                `Course Contact: ${registration.registrationContact}`,
                `Course Name: ${registration.registrationName}`,
                `Course Company: ${registration.registrationCompany}.`
            ]);            
        })
        .catch((error) => {
            console.error("Error adding registration:", error);
        });
        setContact("");
        setName("");
        setCompany("");
    };

    useEffect(()=>{
        fetch("http://localhost:8080/registration/getAll")
        .then(res => res.json())
        .then((result)=>{
            setRegistrations(result);
        })
        .catch((error) => {
            console.error("Error fetching registrations:", error);
        });
    }, []);

    return (
        <>
            <Text>Registration Course Type : {registrationType}-company</Text>
            <Text>Register Course : {courseName}</Text>
            <Text>Register Course ID : {registrationCourseID}</Text>
            <Text>Register Course Date : {new Date(registrationDate).toLocaleDateString("en-US", { year: 'numeric', month: 'long', day: 'numeric' })}</Text>
            <Text>Register Course Location : {registrationLocation}</Text>

            <Box maxW="md" mx="auto" my="10" justifyContent="center" alignItems="center">
                <form onSubmit={handleAddRegistration}>
                {/* <FormControl mt="4" id="registrationDate" isRequired>
                    <FormLabel>Registration Date</FormLabel>
                    <Input
                    value={registrationDate}
                    onChange={(e) => setDate(e.target.value)}
                    placeholder="Enter Registration Date"
                    />
                </FormControl> */}
                {/* <FormControl mt="4" id="registrationLocation" isRequired>
                    <FormLabel>Registration Location</FormLabel>
                    <Input
                    value={registrationLocation}
                    onChange={(e) => setLocation(e.target.value)}
                    placeholder="Enter Registration Location"
                    />
                </FormControl> */}
                <FormControl mt="4" id="registrationContact" isRequired>
                    <FormLabel>Registration Contact</FormLabel>
                    <Input
                    value={registrationContact}
                    onChange={(e) => setContact(e.target.value)}
                    placeholder="Enter Registration Contact"
                    />
                </FormControl>
                <FormControl mt="4" id="registrationName" isRequired>
                    <FormLabel>Registration Name</FormLabel>
                    <Input
                    value={registrationName}
                    onChange={(e) => setName(e.target.value)}
                    placeholder="Enter Registration Name"
                    />
                </FormControl>
                <FormControl mt="4" id="registrationCompany">
                    <FormLabel>Registration Company</FormLabel>
                    <Input
                    value={registrationCompany}
                    onChange={(e) => setCompany(e.target.value)}
                    placeholder="Enter Registration Company"
                    />
                </FormControl>
                <Button colorScheme="blue" mt="6" type="submit">
                    Add Registration
                </Button>
                </form>

                {/* {
                    Msg && 
                    <Flex bg="lightblue" direction={"column"} mt={5}>
                        <Text color="green">{Msg}</Text>
                        <Text>Register Course Contact: {registrationContact}</Text>
                        <Text>Register Course Name : {registrationName}</Text>
                        <Text>Register Course Company : {registrationCompany}</Text>
                    </Flex> 
                }  */}

                <Flex bg="lightblue" direction={"column"} mt={5}>
                    { Msg && Msg.map((line, i) => <Text key={i} color="green">{line}</Text>) }
                </Flex> 



                {/* {<Flex bg="lightblue" direction={"column"}>
                    
                    {registrations.map((registration, index) => (
                        
                        <Flex key={index} justifyContent="flex-start" direction="column" mt={3}>
                            
                            {Object.entries(registration).map(([key, value]) => (
                                <p key={key}>
                                {key}: {value as ReactNode}<br />
                                </p>
                            ))}
                        </Flex>
                    ))}
                </Flex>} */}
                
            </Box>


            
        </>
    );
};

export default RegisterInterCourse;