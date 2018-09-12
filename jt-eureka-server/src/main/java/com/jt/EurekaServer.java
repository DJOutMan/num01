package com.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer   //标识此服务是一个Eureka服务端，通过xxx.xml中配置url
@SpringBootApplication
public class EurekaServer {

	public static void main(String[] args) {
		
		SpringApplication.run(EurekaServer.class, args);
	}
}
