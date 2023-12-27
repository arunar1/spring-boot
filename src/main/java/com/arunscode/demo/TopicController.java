package com.arunscode.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TopicController {
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topic")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
        
    }
    @RequestMapping("/topic/{id}")
    public Topic geTopic(@PathVariable String id){
        return topicService.geTopic(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/topic")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }
     
}
