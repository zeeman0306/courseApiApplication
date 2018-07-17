package com.zamir.Courses;

import org.springframework.data.repository.CrudRepository;

//CrudRepository is a generic type, which is why it uses the angle brackets
public interface TopicRepository extends CrudRepository<Topic, String>{

    //getAllTopics()
    //getTopic(String id)
    //updateTopic(Topic t)
    //deleteTopic(String id)

}
