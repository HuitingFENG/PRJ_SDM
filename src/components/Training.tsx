import { Text, Flex, Box, UnorderedList, ListItem  } from "@chakra-ui/react";
import { useEffect, useState } from "react";

interface TrainingItem {
    trainingID: number;
    trainingType: string;
    trainingLocation: string;
}

const Training = () => {
    const [training, setTraining] = useState<TrainingItem[]>([]);

    useEffect(()=>{
        fetch("http://localhost:8080/training/getAll")
        .then(res => res.json())
        .then((result)=>{
            setTraining(result);
        })
        .catch((error) => {
            console.error("Error fetching trainings:", error);
        });
    }, []);

    return (
        <>
        
        <Flex direction = "column" gap={4} alignItems={"center"}>
            <Text>Training(s) :</Text>
            <UnorderedList>
                {training.map((item) => (
                    <ListItem key={item.trainingID}>
                        ID: {item.trainingID}<br />
                        Type: {item.trainingType}<br />
                        Location: {item.trainingLocation}<br />
                    </ListItem>
                ))}
            </UnorderedList>
        </Flex>
        </>
    )
}

export default Training;