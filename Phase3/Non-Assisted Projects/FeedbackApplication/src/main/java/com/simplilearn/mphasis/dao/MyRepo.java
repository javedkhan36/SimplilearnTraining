package com.simplilearn.mphasis.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.mphasis.entity.Feedback;

@Repository
public interface MyRepo extends CrudRepository<Feedback, Integer> {

}
