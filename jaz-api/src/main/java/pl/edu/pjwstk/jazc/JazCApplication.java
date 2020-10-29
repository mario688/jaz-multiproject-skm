package pl.edu.pjwstk.jazc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class JazCApplication {

	public static void main(String[] args) {
		SpringApplication.run(JazCApplication.class, args);
	}
}