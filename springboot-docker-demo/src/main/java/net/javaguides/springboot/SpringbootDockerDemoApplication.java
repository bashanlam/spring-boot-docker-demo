package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerDemoApplication {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "SpringBoot Docker demo";
		
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerDemoApplication.class, args);
	}

}
