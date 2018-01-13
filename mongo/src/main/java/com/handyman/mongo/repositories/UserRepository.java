package com.handyman.mongo.repositories;

import com.handyman.models.interfaces.users.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
   //type: User && id :: String
   User getUserByFilter(String filter);
}
