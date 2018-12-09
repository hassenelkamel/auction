package org.sid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("org.model")
@EnableJpaRepositories("org.repositories")
public class AuctionProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuctionProjectApplication.class, args);
	}
}
