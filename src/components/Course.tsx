import React, { useState, useEffect } from "react";
import { FormControl,FormLabel, Input, Button, Box, Flex } from "@chakra-ui/react";
import { ReactNode } from "react";

const AddCourse = () => {
    const [courseName, setName] = useState("");
    const [coursePrice, setPrice] = useState("");
    const [courseDates, setDates] = useState("");
    const [courseLocations, setLocations] = useState("");
    const [courseContent, setContent] = useState("");
    const [courses, setCourses] = useState([]);

    const handleSubmit = (e: React.FormEvent) => {
        e.preventDefault();
        console.log({courseName}, {coursePrice})
    };

    const handleAddCourse = (e: React.FormEvent) => {
        e.preventDefault();
        const course = {courseName, coursePrice, courseDates, courseLocations, courseContent}
        console.log(course)
        fetch("http://localhost:8080/course/add", {
            method:"POST",
            headers:{"Content-Type":"application/json"},
            body:JSON.stringify(course)
        }).then(()=>{
            console.log("New course is added.")
        })
        .catch((error) => {
            console.error("Error adding course:", error);
        });
    };
  
    useEffect(()=>{
        fetch("http://localhost:8080/course/getAll")
        .then(res => res.json())
        .then((result)=>{
            setCourses(result);
        })
        .catch((error) => {
            console.error("Error fetching courses:", error);
        });
    }, []);

    return (
      <Box maxW="md" mx="auto" my="10">
        <form onSubmit={handleSubmit}>
          <FormControl id="courseName" isRequired>
            <FormLabel>Course Name</FormLabel>
            <Input
              value={courseName}
              onChange={(e) => setName(e.target.value)}
              placeholder="Enter course name"
            />
          </FormControl>
          <FormControl mt="4" id="coursePrice" isRequired>
            <FormLabel>Course Price</FormLabel>
            <Input
              value={coursePrice}
              onChange={(e) => setPrice(e.target.value)}
              placeholder="Enter course price"
            />
          </FormControl>
          <FormControl mt="4" id="courseDates" isRequired>
            <FormLabel>Course Dates</FormLabel>
            <Input
              value={courseDates}
              onChange={(e) => setDates(e.target.value)}
              placeholder="Enter course dates"
            />
          </FormControl>
          <FormControl mt="4" id="courseLocations" isRequired>
            <FormLabel>Course locations</FormLabel>
            <Input
              value={courseLocations}
              onChange={(e) => setLocations(e.target.value)}
              placeholder="Enter course locations"
            />
          </FormControl>
          <FormControl mt="4" id="courseContent" isRequired>
            <FormLabel>Course Content</FormLabel>
            <Input
              value={courseContent}
              onChange={(e) => setContent(e.target.value)}
              placeholder="Enter course content"
            />
          </FormControl>
          <Button colorScheme="blue" mt="6" type="submit" onClick={handleAddCourse}>
            Add Course
          </Button>
        </form>

        {courseName}
        <br />
        {coursePrice}
        <br />
        {courseDates}
        <br />
        {courseLocations}
        <br />
        {courseContent}

        {<Flex bg="lightblue" direction={"column"}>
            {courses.map((course, index) => (
                <Flex key={index} justifyContent="flex-start" direction="column">
                     {Object.entries(course).map(([key, value]) => (
                        <p key={key}>
                        {key}: {value as ReactNode}<br />
                        </p>
                    ))}

                </Flex>
            ))}
        </Flex>}

      </Box>
    );
  };
  
  export default AddCourse;
  