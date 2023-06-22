import React from 'react';
import { useParams } from 'react-router-dom';

interface TestProps {
  courseName: string;
}

type RouteParams = {
  courseName?: string;
};

const Test: React.FC<TestProps> = ({ courseName }) => {
  return <p>Course Name: {courseName}</p>;
};

export default Test;
