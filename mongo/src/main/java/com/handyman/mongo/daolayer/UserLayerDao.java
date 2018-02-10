package com.handyman.mongo.daolayer;

import com.handyman.models.interfaces.users.User;
import com.handyman.mongo.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class UserLayerDao {
   @Resource
   UserRepository userRepository;

   public String addUser(User user) {
      userRepository.save(user);
      return user.getUserId();
   }

   public List<String> addUser(List<User> users) {
      List<String> responses = new ArrayList<>();
      for (User u : users) {
         responses.add(addUser(u));
      }
      return responses;
   }

   public User find(String query) {
      return null;
   }

   public String delete(String query) {
      return null;
   }

   public String update(User user) {
      return null;
   }
}
