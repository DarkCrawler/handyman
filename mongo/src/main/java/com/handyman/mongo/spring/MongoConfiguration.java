package com.handyman.mongo.spring;

//@Configuration
public class MongoConfiguration {
   /*
   extends AbstractMongoConfiguration {
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
   }*/
}
