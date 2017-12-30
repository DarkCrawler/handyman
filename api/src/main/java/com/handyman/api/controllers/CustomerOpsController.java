package com.handyman.api.controllers;

import com.handyman.models.interfaces.users.User;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class CustomerOpsController {
   @RequestMapping(method = RequestMethod.POST, value = "/user/insert", produces = "application/json")
   public String insertNewUser(@RequestBody @Valid User newUser) {
      System.out.println("Recieved user request");
      return "user created";
   }
}
