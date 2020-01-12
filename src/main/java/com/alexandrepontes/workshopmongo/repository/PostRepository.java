package com.alexandrepontes.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.alexandrepontes.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
		
}