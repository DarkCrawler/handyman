package com.handyman.api.springconfig;

import com.handyman.mongo.spring.MongoConfiguration;
import com.handyman.mongo.spring.MongoSpring;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@ComponentScan(basePackages = {"com.handyman.api", "com.handyman.mongo"})
@Import({MongoSpring.class, MongoConfiguration.class})
@Configuration
@EnableAutoConfiguration

public class ApiSpring extends WebMvcConfigurerAdapter {

   @Override
   public void addCorsMappings(CorsRegistry registry) {
      registry.addMapping("/**");
   }
}
