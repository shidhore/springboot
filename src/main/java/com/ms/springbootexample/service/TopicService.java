package com.ms.springbootexample.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.springbootexample.model.Topic;
import com.ms.springbootexample.repository.TopicRepository;

// @Service marks a class as Spring application service
@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("math", "math", "math topic"),
			new Topic("science", "science", "science topic"), new Topic("history", "history", "history topic")));

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public Topic getTopic(String id) {
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic, String id) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.delete(id);
	}

	// below methods have implementations before introducing JPA
	/*
	 * public List<Topic> getAllTopics() { return topics; }
	 * 
	 * public Topic getTopic(String id) { return topics.stream().filter(topic ->
	 * topic.getId().equals(id)).findFirst().get(); }
	 * 
	 * public void addTopic(Topic topic) { topics.add(topic); }
	 * 
	 * public void updateTopic(Topic topic, String id) { Topic topicToUpdate =
	 * getTopic(id); topicToUpdate.setDescription(topic.getDescription());
	 * topicToUpdate.setId(topic.getId()); topicToUpdate.setName(topic.getName()); }
	 * 
	 * public void deleteTopic(String id) { topics.removeIf(t ->
	 * t.getId().equals(id)); }
	 */

}
