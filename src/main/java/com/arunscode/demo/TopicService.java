package com.arunscode.demo;

import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Arrays;

@Service
public class TopicService {
    private  List<Topic> topics = Arrays.asList(
        new Topic("Spring","spring framework", "spring frame description"),
        new Topic("java","core java","java Description"),
        new Topic("javascript","javascript", "javascript description")
    );
    public List<Topic> getAllTopics() {
        return topics;
    }
}
