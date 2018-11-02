package br.com.chamae.game.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.chamae.game.services.GameService;

@RestController
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/game", method = RequestMethod.GET)
	public String teste() {
		
		String game = gameService.getGame();
		return game;
	}
}
