package br.com.chamae.event_game_api.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.chamae.event_game_api.models.EventGame;

public interface EventGameRepository extends MongoRepository<EventGame, String> {
	EventGame findBy_id(ObjectId _id);
}