import { Text } from "@chakra-ui/react";
import React, { useEffect, useState } from 'react';
import { Link as RouterLink } from 'react-router-dom';



interface SubTopic {
    subTopicName: string;
}
  
interface Topic {
    topicName: string;
    subTopics: SubTopic[];
}
  
interface Theme {
    themeName: string;
    topics: Topic[];
}

const CoursesCatalog = () => {
    const [themes, setThemes] = useState<Theme[]>([]);

    useEffect(() => {
        const fetchedThemes: Theme[] = [
            { 
                themeName: 'Development Languages',
                topics: [
                  {
                    topicName: 'Web Languages',
                    subTopics: [
                      {subTopicName: 'PHP'},
                      {subTopicName: 'JavaScript'},
                      {subTopicName: 'Ajax'}
                    ]
                  },
                  {
                    topicName: 'Web Development Languages',
                    subTopics: [
                        {subTopicName: 'JavaScript'},
                        {subTopicName: 'HTML/CSS'},
                        {subTopicName: 'PHP'}
                    ]
                  },
                ]
            },
            { 
                themeName: 'Networks',
                topics: [
                  {
                    topicName: 'Network Protocols',
                    subTopics: [
                      {subTopicName: 'TCP/IP'},
                      {subTopicName: 'HTTP'},
                      {subTopicName: 'FTP'}
                    ]
                  },
                  {
                    topicName: 'Network Security',
                    subTopics: [
                      {subTopicName: 'Firewalls'},
                      {subTopicName: 'Intrusion Detection Systems'},
                      {subTopicName: 'Encryption'}
                    ]
                  },
                ]
            },
            { 
                themeName: 'Operating Systems',
                topics: [
                  {
                    topicName: 'Unix-Based Systems',
                    subTopics: [
                      {subTopicName: 'Linux'},
                      {subTopicName: 'Mac OS'},
                      {subTopicName: 'BSD'}
                    ]
                  },
                  {
                    topicName: 'Windows Systems',
                    subTopics: [
                      {subTopicName: 'Windows Server'},
                      {subTopicName: 'Windows 10'},
                      {subTopicName: 'Windows 11'}
                    ]
                  },
                ]
            },
            { 
                themeName: 'Project Management',
                topics: [
                  {
                    topicName: 'Methodologies',
                    subTopics: [
                      {subTopicName: 'Agile'},
                      {subTopicName: 'Scrum'},
                      {subTopicName: 'Kanban'}
                    ]
                  },
                  {
                    topicName: 'Project Tools',
                    subTopics: [
                      {subTopicName: 'JIRA'},
                      {subTopicName: 'Trello'},
                      {subTopicName: 'Asana'}
                    ]
                  },
                ]
            }
        ];
        setThemes(fetchedThemes);
    }, []);

    return (
        <div>
            {themes.map((theme, themeIndex) => (
                <div key={themeIndex}>
                    <br />
                    <Text fontWeight="bold" fontSize="2xl">{theme.themeName}</Text>
                    {theme.topics.map((topic, topicIndex) => (
                      <div key={topicIndex}>
                        <Text fontWeight="bold" fontSize="xl">{topic.topicName}</Text>
                        <ul>
                          {topic.subTopics.map((subTopic, subIndex) => (
                              <li key={subIndex}>
                                {/* {subTopic.subTopicName} */}
                                <RouterLink to={`/${subTopic.subTopicName}`}>
                                    {subTopic.subTopicName}
                                </RouterLink>
                              </li>
                          ))}
                        </ul>
                      </div>
                    ))}
                </div>
            ))}
        </div>
    );
};

export default CoursesCatalog;