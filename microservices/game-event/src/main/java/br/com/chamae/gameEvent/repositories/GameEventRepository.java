package br.com.chamae.gameEvent.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.chamae.gameEvent.models.GameEvent;

public interface GameEventRepository extends MongoRepository<GameEvent, String> {
	GameEvent findBy_id(ObjectId _id);
}