package br.com.chamae.gameEvent.controllers;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.chamae.gameEvent.models.GameEvent;
import br.com.chamae.gameEvent.servicesImpl.GameEventServiceImpl;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/game-event")
public class GameEventController {
	@Autowired
	private GameEventServiceImpl service;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<GameEvent> getAllGameEvents() {
		List<GameEvent> response = service.getAllGameEvents();
		return response;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public GameEvent getGameEventById(@PathVariable("id") ObjectId id) {
		GameEvent response = service.getGameEventById(id);
		return response;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void modifyGameEventById(@PathVariable("id") ObjectId id, @Valid @RequestBody GameEvent gameEvent) {
		service.modifyGameEventById(id, gameEvent);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public GameEvent createGameEvent(@Valid @RequestBody GameEvent gameEvent) {
		GameEvent response = service.createGameEvent(gameEvent);
		return response;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteGameEvent(@PathVariable ObjectId id) {
		service.deleteGameEvent(id);
	}
}