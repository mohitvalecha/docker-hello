package com.docker.test.dockerhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/docker")
public class DockerHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerHelloApplication.class, args);
	}

	@GetMapping("/hello")
	public String printHello(){
		return "hello world";
	}

}
