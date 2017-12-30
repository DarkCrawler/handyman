package com.handyman.api.springconfig;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@ComponentScan(basePackages = "com.handyman.api")
@Configuration
@EnableAutoConfiguration
public class ApiSpring extends WebMvcConfigurerAdapter {

}
