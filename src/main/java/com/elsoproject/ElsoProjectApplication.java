package com.elsoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;





@EnableConfigurationProperties
@PropertySources({
    @PropertySource(value = "file:${appConf}", ignoreResourceNotFound = true)
})
@SpringBootApplication
public class ElsoProjectApplication extends org.springframework.boot.web.servlet.support.SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ElsoProjectApplication.class, args);
	}
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	  return application.sources(ElsoProjectApplication.class);
    }

	
}