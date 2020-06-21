package com.vincedgy.micros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MicrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrosApplication.class, args);
	}

}

@RestController
class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello world";
	}
}
