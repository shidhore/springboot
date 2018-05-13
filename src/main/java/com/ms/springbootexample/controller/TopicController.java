package com.ms.springbootexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ms.springbootexample.model.Topic;
import com.ms.springbootexample.service.TopicService;

@RestController
public class TopicController {

	// @Autowired marks this class for DI
	@Autowired
	private TopicService topicService;

	@RequestMapping(value = "/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}

	@RequestMapping(value = "/topics/{identifier}")
	public Topic getTopic(@PathVariable("identifier") String id) {
		// if the path parameter name is same as argument,
		// we would not need to specify any argument
		// ("identifier" in this case) for @PathVariable
		return topicService.getTopic(id);
	}

	@RequestMapping(value = "/topics", method = RequestMethod.POST)
	public void addTopic(@RequestBody Topic topic) {
		// @RequestBody tells Spring MVC that it needs to convert json
		// representation of a Topic object into a Java Topic instance.
		topicService.addTopic(topic);
	}

	@RequestMapping(value = "/topics/{id}", method = RequestMethod.PUT)
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicService.updateTopic(topic, id);
	}
	
	@RequestMapping(value = "/topics/{id}", method = RequestMethod.DELETE)
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}

}
