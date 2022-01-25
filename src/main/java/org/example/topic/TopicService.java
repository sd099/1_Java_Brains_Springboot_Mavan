package org.example.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    //Get all topics
    public List<Topic> getAllTopics() {

        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    //get one topic
    public Optional<Topic> getTopic(String id){
        Optional<Topic> topic= topicRepository.findById(id);
        return topic;
    }

    //add a topic
    public void addTopic(Topic topic){

        topicRepository.save(topic);
    }

    //update a topic
    public void updateTopic(String id,Topic topic){
        topicRepository.save(topic);
    }

    //delete a topic
    public void deleteTopic(String id){
        topicRepository.deleteById(id);
    }

}
