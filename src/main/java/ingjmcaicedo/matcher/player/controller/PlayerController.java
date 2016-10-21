package ingjmcaicedo.matcher.player.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ingjmcaicedo.matcher.model.Player;
import ingjmcaicedo.matcher.player.dto.PlayerDTO;
import ingjmcaicedo.matcher.player.service.PlayerService;

@RestController
@RequestMapping("player")
public class PlayerController {
	
	@Autowired
	private PlayerService playerService;
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public Resource<Player> create(@RequestBody PlayerDTO playerDTO){
		return new Resource<>(playerService.create(playerDTO));
	}

}
