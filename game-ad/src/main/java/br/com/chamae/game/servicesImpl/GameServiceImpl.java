package br.com.chamae.game.servicesImpl;

import org.springframework.stereotype.Service;

import br.com.chamae.game.services.GameService;

@Service
public class GameServiceImpl implements GameService{

	@Override
	public String getGame() {
		return "Boiza peita";
	}

}
