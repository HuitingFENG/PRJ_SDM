// src/pages/Home.tsx
import React from 'react';
import Appheader from '../../components/Appheader';
import CoursesCatalog from '../../components/CoursesCatalog';
import Appfooter from '../../components/Appfooter';

const Home: React.FC = () => {
  return (
    <>
    <main>
        <Appheader />
        <CoursesCatalog />
        <Appfooter />
    </main>
    </>
  );
};

export default Home;
