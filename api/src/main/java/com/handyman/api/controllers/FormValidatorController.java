package com.handyman.api.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class FormValidatorController {
   @RequestMapping(method = RequestMethod.GET, value = "/doesEmailExists", produces = "application/json")
   public Boolean doesEmailExists() {
      return false;
   }

   @RequestMapping(method = RequestMethod.GET, value = "/doesPrimaryNumberExists", produces = "application/json")
   public Boolean doesPrimaryNumberExists() {
      return false;
   }
}
