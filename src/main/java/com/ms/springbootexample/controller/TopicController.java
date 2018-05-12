package com.ms.springbootexample.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.springbootexample.model.Topic;

@RestController
public class TopicController {

	@RequestMapping(value = "/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(new Topic("1", "math", "math topic"), new Topic("2", "science", "science topic"));
	}
}
