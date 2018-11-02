package br.com.chamae.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GameAdApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameAdApplication.class, args);
	}
}
