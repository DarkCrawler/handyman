package com.handyman.api.services;

import com.handyman.api.components.UserIdGenerator;
import com.handyman.models.implementation.users.UserImpl;
import com.handyman.mongo.daolayer.UserLayerDao;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Slf4j
public class UserRelatedServices {

   @Resource
   UserIdGenerator idGenerator;

   @Resource UserLayerDao userLayerDao;

   public String createAndPersistNewUser(UserImpl newUser) {
      newUser.setUserCreationDateTime(DateTime.now());
      idGenerator.generateUserid(newUser);
      return userLayerDao.addUser(newUser);
   }
}
