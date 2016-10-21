package ingjmcaicedo.matcher.player.service;

import ingjmcaicedo.matcher.model.Player;
import ingjmcaicedo.matcher.player.dto.PlayerDTO;

public interface PlayerService {

	Player create(PlayerDTO playerDTO);
	
}
