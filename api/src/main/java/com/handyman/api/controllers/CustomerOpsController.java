package com.handyman.api.controllers;

import com.handyman.models.implementation.users.UserImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Slf4j
public class CustomerOpsController {
   @RequestMapping(method = RequestMethod.POST, value = "/user/insert", produces = "application/json")
   public String insertNewUser(@RequestBody @Valid UserImpl newUser) {
      log.info("Recieved new user creation request");
      return "user created";
   }
}
