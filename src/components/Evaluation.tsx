import { Text, Flex, Box, UnorderedList, ListItem  } from "@chakra-ui/react";
import { useEffect, useState } from "react";

interface EvaluationItem {
    evaluationID: number;
    evaluationCourseID: number;
    evaluationGrade: number;
}

const Evaluation = () => {
    const [Evaluation, setEvaluation] = useState<EvaluationItem[]>([]);
    useEffect(()=>{
        fetch("http://localhost:8080/evaluation/getAll")
        .then(res => res.json())
        .then((result)=>{
            setEvaluation(result);
        })
        .catch((error) => {
            console.error("Error fetching Evaluations:", error);
        });
    }, []);

    return (
        <>
        <Flex direction = "column" gap={4} alignItems={"center"}>
            <Text>Evaluation(s) :</Text>
            <UnorderedList>
                {Evaluation.map((item) => (
                    <ListItem key={item.evaluationID}>
                        ID: {item.evaluationID}<br />
                        CourseID: {item.evaluationCourseID}<br />
                        Grade: {item.evaluationGrade}<br />
                    </ListItem>
                ))}
            </UnorderedList>
        </Flex>
        </>
    )
}

export default Evaluation;


