package com.handyman.mongo.spring;

import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import static java.util.Collections.singletonList;

@Configuration
public class MongoConfiguration extends AbstractMongoConfiguration {
   @Override
   @Bean
   public MongoClient mongoClient() {
      return new MongoClient(singletonList(new ServerAddress("127.0.0.1", 27017)));
   }

   @Override protected String getDatabaseName() {
      return "handyman";
   }

   public @Bean MongoDbFactory mongoDbFactory() {
      return new SimpleMongoDbFactory(mongoClient(), getDatabaseName());
   }

   public @Bean MongoTemplate mongoTemplate() {
      return new MongoTemplate(mongoClient(), getDatabaseName());
   }
}
