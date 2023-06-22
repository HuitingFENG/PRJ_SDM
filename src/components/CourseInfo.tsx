import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { Box, Flex, Link, Text, Image, Button, Stack, Center } from '@chakra-ui/react';
import { Link as RouterLink, BrowserRouter as Router, Routes, Route } from "react-router-dom";
import { useNavigate } from 'react-router-dom';

interface Course {
    courseName: string;
    coursePrice: number;
    courseDates: Date;
    courseLocations: string;
    courseContent: string;
  }

const CourseInfo = ({ courseName }: { courseName: string }) => {
    const [course, setCourse] = useState<Course | null>(null);
    const [courseData, setCourseData] = useState<Course[]>([]);
    const navigate = useNavigate();

    const handleRegistration = () => {
        navigate('/contact/registrationManager', { state: { courseName } });
    };


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
            } catch (error) {
                console.error("Failed to fetch course", error);
            }
        };

        fetchCourse();
    }, [courseName]);

    if (!course) {
        return <p>Loading...</p>;
    }




    return (
        <div>
            <h2>{course.courseName}</h2>
            <p>{course.coursePrice}</p>
            <p>{course.courseDates.toString()}</p>
            <p>{course.courseLocations}</p>
            <p>{course.courseContent}</p>
            <br />
            <Flex direction="row" gap={5}>
                <Button colorScheme='teal'>
                    <RouterLink to={`/${course.courseName}/test`}>
                        Click here for inter-company training course
                    </RouterLink>
                </Button>
{/*                 <Button colorScheme='teal'>
                    <RouterLink to={`/contact/registrationManager`}>
                        Click here for intra-company training course
                    </RouterLink>
                </Button> */}
                <Button colorScheme='teal' onClick={handleRegistration}>Click here for intra-company training course</Button>
            </Flex>
        </div>
    );
};

export default CourseInfo;
