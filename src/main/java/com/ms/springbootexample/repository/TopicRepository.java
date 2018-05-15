package com.ms.springbootexample.repository;

import org.springframework.data.repository.CrudRepository;

import com.ms.springbootexample.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
