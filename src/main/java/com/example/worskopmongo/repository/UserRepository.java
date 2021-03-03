package com.example.worskopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.worskopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
