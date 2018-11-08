package br.com.chamae.gameEvent.services;

import java.util.List;

import org.bson.types.ObjectId;
import br.com.chamae.gameEvent.models.GameEvent;

public interface GameEventService {

	List<GameEvent> getAllGameEvents();

	GameEvent getGameEventById(ObjectId id);

	void modifyGameEventById(ObjectId id, GameEvent gameEvent);

	GameEvent createGameEvent(GameEvent gameEvent);

	void deleteGameEvent(ObjectId id);
}
