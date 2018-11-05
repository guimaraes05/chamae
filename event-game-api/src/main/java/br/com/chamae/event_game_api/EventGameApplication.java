package br.com.chamae.event_game_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EventGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventGameApplication.class, args);
	}
}
