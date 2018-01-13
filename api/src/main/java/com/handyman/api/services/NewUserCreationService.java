package com.handyman.api.services;

import com.handyman.api.components.UserIdGenerator;
import com.handyman.models.implementation.users.UserImpl;
import org.joda.time.DateTime;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class NewUserCreationService {

   @Resource
   UserIdGenerator idGenerator;

   public String createAndPersistNewUser(UserImpl newUser) {
      newUser.setUserCreationDateTime(DateTime.now());
      idGenerator.generateUserid(newUser);
      return null;
   }
}
