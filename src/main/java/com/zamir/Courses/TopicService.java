package com.zamir.Courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//Needs this annotation to identify as a service
//Stereotype annotation
@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;


    public List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<Topic>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id){
        return topicRepository.findOne(id);
//         Optional<Topic> t = topicRepository.findById(id);
//        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
//        for (int i = 0; 1 < topics.size(); i++){
//            Topic t = topics.get(i);
//            if(t.getId().equals(id)){
//                topics.set(i, com.zamir.topic);
//                return;
//            }
//        }
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
//        topics.removeIf(t -> t.getId().equals(id));
        topicRepository.delete(id);
    }
}
