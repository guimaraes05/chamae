package br.com.chamae.event_game_api.servicesImpl;

import org.springframework.stereotype.Service;

import br.com.chamae.event_game_api.services.EventGameService;

@Service
public class EventGameServiceImpl implements EventGameService{

	@Override
	public String getGame() {
		return "Boiza peita";
	}

}
