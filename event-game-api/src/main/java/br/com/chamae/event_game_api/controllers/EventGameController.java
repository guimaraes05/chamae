package br.com.chamae.event_game_api.controllers;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.util.List;
import br.com.chamae.event_game_api.models.EventGame;
import br.com.chamae.event_game_api.repositories.EventGameRepository;

@RestController
@RequestMapping("/event-game")
public class EventGameController {
	@Autowired
	private EventGameRepository repository;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<EventGame> getAllEventGames() {
		return repository.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public EventGame getEventGameById(@PathVariable("id") ObjectId id) {
		return repository.findBy_id(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void modifyEventGameById(@PathVariable("id") ObjectId id, @Valid @RequestBody EventGame eventGame) {
		eventGame.set_id(id);
		repository.save(eventGame);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public EventGame createEventGame(@Valid @RequestBody EventGame eventGame) {
		eventGame.set_id(ObjectId.get());
		repository.save(eventGame);
		return eventGame;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteEventGame(@PathVariable ObjectId id) {
		repository.delete(repository.findBy_id(id));
	}
}