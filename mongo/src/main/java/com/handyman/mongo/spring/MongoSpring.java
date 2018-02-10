package com.handyman.mongo.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.handyman.mongo")
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, WebMvcAutoConfiguration.class})
@Slf4j
public class MongoSpring {

}
