package com.handyman.api.controllers;

import com.handyman.api.services.StatesAndCityRepoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Set;

@RestController
@Slf4j
public class StatesAndCitiesController {
   @Resource StatesAndCityRepoService statesAndCityRepoService;

   @RequestMapping(method = RequestMethod.GET, value = "/getListOfStates", produces = "application/json")
   public Set getStates() {
      Set states = statesAndCityRepoService.getSetOfStates();
      log.info("REST API call : getstates : results length:" + states.size());
      return states;
   }

   @RequestMapping(method = RequestMethod.GET, value = "/getOpsCity", produces = "application/json")
   public Set getOperationCities(@RequestParam("state") String state) {
      Set operationCities = statesAndCityRepoService.getListOfoperationCitiesForState(state);
      log.info("REST API call: get operationcities : results length:" + operationCities.size());
      return operationCities;
   }
}
