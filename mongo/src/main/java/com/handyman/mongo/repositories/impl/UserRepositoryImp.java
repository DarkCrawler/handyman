package com.handyman.mongo.repositories.impl;

import com.handyman.models.interfaces.users.User;
import com.handyman.mongo.repositories.UserRepository;
import org.springframework.data.mongodb.repository.support.SimpleMongoRepository;

import java.util.Optional;

public class UserRepositoryImp extends SimpleMongoRepository implements UserRepository {

   public UserRepositoryImp(){

   }

   @Override public User getUserByFilter(String filter) {
      return null;
   }
}
