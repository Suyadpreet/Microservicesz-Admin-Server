package com.suyad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class MicroserviceszAdminServerApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(MicroserviceszAdminServerApplication.class, args);
		System.out.println("Admin Server has been Started Successfully......");
	}

}
