package com.handyman.api;

import com.handyman.api.springconfig.ApiSpring;
import org.springframework.boot.SpringApplication;

public class ApiMain {
   public static void main(String[] args) {
      SpringApplication.run(ApiSpring.class, args);
   }
}
