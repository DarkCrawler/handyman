package com.handyman.mongo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "com.handyman.mongo")
@Configuration
public class MongoMain {
}
