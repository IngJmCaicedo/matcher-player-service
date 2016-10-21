package ingjmcaicedo.matcher.player.service;

import java.util.List;

import ingjmcaicedo.matcher.dto.PlayerDTO;
import ingjmcaicedo.matcher.model.Player;

public interface PlayerService {

	Player create(PlayerDTO playerDTO);
	
	Player update(PlayerDTO playerDTO);
	
	Player find(String document);

	void remove(String document);
	
	List<Player> findAll();
	
}
