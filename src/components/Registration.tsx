import { Text, Flex, Box, UnorderedList, ListItem  } from "@chakra-ui/react";
import { useEffect, useState } from "react";

interface RegistrationItem {
    registrationID: number;
    registrationType: string;
    registrationDate: Date;
    registrationLocation: string;
    registrationContact: string;
    registrationName: string;
    registrationCompany: string;
    registrationCourseID: number;
    registrationComments: string;
}

const Registration = () => {
    const [Registration, setRegistration] = useState<RegistrationItem[]>([]);

    useEffect(()=>{
        fetch("http://localhost:8080/registration/getAll")
        .then(res => res.json())
        .then((result)=>{
            setRegistration(result);
        })
        .catch((error) => {
            console.error("Error fetching Registrations:", error);
        });
    }, []);

    return (
        <>
        
        <Flex direction = "column" gap={4} alignItems={"center"}>
            <Text>Registration(s) :</Text>
            <UnorderedList>
                {Registration.map((item) => (
                    <ListItem key={item.registrationID}>
                        ID: {item.registrationID}<br />
                        Type: {item.registrationType}<br />
                        Date: {item.registrationDate.toLocaleString().slice(0,10)}<br />
                        Location: {item.registrationLocation}<br />
                        Contact: {item.registrationContact}<br />
                         Name: {item.registrationName}<br />
                         Company: {item.registrationCompany}<br />
                         CourseID: {item.registrationCourseID}<br />
                          Comments: {item.registrationComments}<br />
                    </ListItem>
                ))}
            </UnorderedList>
        </Flex>
        </>
    )
}

export default Registration;