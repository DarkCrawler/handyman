package com.handyman.mongo.spring;

import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.convert.CustomConversions;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Collections;

import static java.util.Collections.singletonList;

@Configuration
@EnableMongoRepositories(basePackages = "com.handyman.mongo")
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, WebMvcAutoConfiguration.class})
@Slf4j
public class MongoSpring extends AbstractMongoConfiguration {
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

   @Bean
   public CustomConversions mongoCustomConversions() {
      return new CustomConversions(Collections.emptyList());
   }
}
