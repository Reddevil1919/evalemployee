package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import repository.TaskRepository;
import restservices.TaskRestService;

@SpringBootApplication
@ComponentScan(basePackages={"repository","restservices"})
@EnableJpaRepositories("repository")
@EntityScan("model")
public class SpringBootRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApplication.class, args);
	}

}
