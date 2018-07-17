package com.zamir.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {


    @Autowired
    private TopicService topicService;

    //Returns a LIST of com.zamir.topic objects from the Topic class
    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    //Returns a SINGLE com.zamir.topic object assigned to the String variable titled id
    @RequestMapping("/topics/{id}")
    public Topic getTopic(/*it's a variable in the  method path*/@PathVariable String id){
        return topicService.getTopic(id);
    }

    //Adds a com.zamir.topic object to the List of topics, returns nothing
    @RequestMapping(value = "/topics", method = RequestMethod.POST)
    public void addTopic(
            /*pick this instance from the RequestBody*/
            @RequestBody Topic topic
    )
    {
        topicService.addTopic(topic);
    }

    //Overwrites a com.zamir.topic object in the list of topics, returns nothing
    @RequestMapping(value = "/topics/{id}", method = RequestMethod.PUT)
    public void updateTopic(
            /*pick this instance from the RequestBody*/
            @RequestBody Topic topic,
            /*is also needed to specify the PUT*/
            @PathVariable String id
    )
    {
        topicService.updateTopic(id, topic);
    }

    //Deletes a com.zamir.topic object in the List of topics, returns nothing
    @RequestMapping(value = "/topics/{id}", method = RequestMethod.DELETE)
    public void deleteTopic(
            /*is also needed to specify the PUT*/
            @PathVariable String id
    )
    {
        topicService.deleteTopic(id);
    }
}
