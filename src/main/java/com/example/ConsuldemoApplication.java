package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class ConsuldemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConsuldemoApplication.class, args);
	}
	

	@Value("${neo4j.uri}")
	private String url;
	
	@Value("${neo4j.username}")
	private String username;
	
	@RequestMapping("/uri")
    public String home() {
        return ">>>>>>>"+this.url+"   Username:"+username;
    }
	
//	
//	@Value("${hello}")
//	private String hello;
//	
//	@RequestMapping("/hello")
//    public String home() {
//        return ">>>>>>>"+this.hello;
//    }
	/*
	@Value("${bye}")
	private String bye;
	
	 
	 @RequestMapping("/bye")
	    public String bye() {
	        return ">>>>>>>"+this.bye;
	    }
	    */

}
