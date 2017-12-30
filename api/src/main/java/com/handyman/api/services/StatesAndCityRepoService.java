package com.handyman.api.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Scope("singleton")
public class StatesAndCityRepoService {
   private Set<String> setOfStates = new LinkedHashSet<String>();
   private Map<String, Set<String>> mapOfStateAndSetOfOperationalCities = new HashMap<String, Set<String>>();

   public Set<String> getSetOfStates() {
      if (setOfStates.isEmpty()) {
         populateSetOfStates();
      }
      return setOfStates;
   }

   public Set<String> getListOfoperationCitiesForState(String stateName) {
      if (mapOfStateAndSetOfOperationalCities.isEmpty()) {
         populateStatesWithOperationCities();
      }
      return mapOfStateAndSetOfOperationalCities.getOrDefault(stateName, new HashSet<String>());
   }

   private void populateStatesWithOperationCities() {
      Set setOfCitiesOperationInUttarPradesh = new HashSet();
      setOfCitiesOperationInUttarPradesh.add("Lucknow");
      mapOfStateAndSetOfOperationalCities.put("Uttar Pradesh", setOfCitiesOperationInUttarPradesh);
   }

   private void populateSetOfStates() {
      setOfStates.add("Andhra Pradesh");
      setOfStates.add("Arunachal Pradesh");
      setOfStates.add("Assam");
      setOfStates.add("Bihar");
      setOfStates.add("Chhattisgarh");
      setOfStates.add("Goa");
      setOfStates.add("Gujarat");
      setOfStates.add("Haryana");
      setOfStates.add("Himachal Pradesh");
      setOfStates.add("Jammu & Kashmir");
      setOfStates.add("Jharkhand");
      setOfStates.add("Karnataka");
      setOfStates.add("Kerala");
      setOfStates.add("Madhya Pradesh");
      setOfStates.add("Maharashtra");
      setOfStates.add("Manipur");
      setOfStates.add("Meghalaya");
      setOfStates.add("Mizoram");
      setOfStates.add("Nagaland");
      setOfStates.add("Orissa");
      setOfStates.add("Punjab");
      setOfStates.add("Rajasthan");
      setOfStates.add("Sikkim");
      setOfStates.add("Tamil Nadu");
      setOfStates.add("Telangana");
      setOfStates.add("Tripura");
      setOfStates.add("Uttar Pradesh");
      setOfStates.add("Uttarakhand");
      setOfStates.add("West Bengal");
      setOfStates.add("Andaman and Nicobar Islands");
      setOfStates.add("Chandigarh");
      setOfStates.add("Dadra and Nagar Haveli");
      setOfStates.add("Daman and Diu");
      setOfStates.add("Lakshadweep");
      setOfStates.add("Puducherry");
   }
}


