package com.simplilearn.SpringJpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.SpringJpa.entity.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer>{

}
