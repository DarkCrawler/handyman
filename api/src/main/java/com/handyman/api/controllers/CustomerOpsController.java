package com.handyman.api.controllers;

import com.handyman.api.services.UserRelatedServices;
import com.handyman.models.implementation.users.UserImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@Slf4j
public class CustomerOpsController {

   @Resource UserRelatedServices userRelatedService;

   @RequestMapping(method = RequestMethod.POST, value = "/user/insert", produces = "application/json")
   public String insertNewUser(@RequestBody @Valid UserImpl newUser) {
      log.info("Recieved new user creation request");
      return userRelatedService.createAndPersistNewUser(newUser);
   }
}
