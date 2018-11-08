package br.com.chamae.gameEvent.servicesImpl;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.chamae.gameEvent.models.GameEvent;
import br.com.chamae.gameEvent.repositories.GameEventRepository;
import br.com.chamae.gameEvent.services.GameEventService;

@Service
public class GameEventServiceImpl implements GameEventService {

	@Autowired
	private GameEventRepository repository;

	@Override
	public List<GameEvent> getAllGameEvents() {
		List<GameEvent> result = repository.findAll();
		return result;
	}

	@Override
	public GameEvent getGameEventById(ObjectId id) {
		GameEvent result = repository.findBy_id(id);
		return result;
	}

	@Override
	public void modifyGameEventById(ObjectId id, GameEvent gameEvent) {
		gameEvent.set_id(id);
		repository.save(gameEvent);
	}

	@Override
	public GameEvent createGameEvent(GameEvent gameEvent) {
		gameEvent.set_id(ObjectId.get());
		GameEvent response = repository.save(gameEvent);
		return response;
	}

	@Override
	public void deleteGameEvent(ObjectId id) {
		repository.delete(repository.findBy_id(id));
	}

}
