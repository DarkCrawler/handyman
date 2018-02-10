package com.handyman.mongo;

import com.handyman.mongo.spring.MongoSpring;
import org.springframework.boot.SpringApplication;

public class MongoMain {

   public static void main(String[] args) {
      SpringApplication.run(MongoSpring.class, args);
   }
}
