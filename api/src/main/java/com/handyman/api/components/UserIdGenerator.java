package com.handyman.api.components;

import com.handyman.models.implementation.users.UserImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserIdGenerator {
   public String generateUserid(UserImpl user) {
      String generatedUserId = generateUserIdFromUserAttributes(user);
      log.info("Computed user id ::: ", generatedUserId);
      return generatedUserId;
   }

   private String generateUserIdFromUserAttributes(UserImpl user) {
      StringBuilder prefixFromNameBuilder = new StringBuilder().append(user.getPersonalInfo().getFirstName().substring(0, 1))
         .append(user.getPersonalInfo().getLastName().substring(0, 1))
         .append(user.getPersonalInfo().getRegisteredEmailId().substring(0, user.getPersonalInfo().getRegisteredEmailId().indexOf('@')))
         .append(user.getUserCreationDateTime().toString());
      return prefixFromNameBuilder.toString();
   }
}
