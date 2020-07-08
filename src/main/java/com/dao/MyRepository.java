package com.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootdemo.Feedback;

@Repository
public interface MyRepository extends CrudRepository<Feedback , Integer> {

}
