package core.ics.token;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;

@Slf4j
@SpringBootApplication
public class GenerateTokenApplication {

	public static void main(String[] args) {
		SpringApplication.run(GenerateTokenApplication.class, args);
		log.info("Application Token UP ["+ HttpStatus.OK+"]");
	}

}
