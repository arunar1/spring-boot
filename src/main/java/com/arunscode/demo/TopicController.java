package com.arunscode.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TopicController {
    @RequestMapping("/topic")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
            new Topic("Spring","spring framework", "spring frame description"),
            new Topic("java","core java","java Description"),
            new Topic("javascript","javascript", "javascript description")
        );
    }
     
}
