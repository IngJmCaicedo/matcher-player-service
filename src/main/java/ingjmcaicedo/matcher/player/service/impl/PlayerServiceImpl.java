package ingjmcaicedo.matcher.player.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ingjmcaicedo.matcher.dto.PlayerDTO;
import ingjmcaicedo.matcher.model.Player;
import ingjmcaicedo.matcher.model.Team;
import ingjmcaicedo.matcher.player.client.fallback.FallbackTeamClient;
import ingjmcaicedo.matcher.player.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService{

	@Autowired
	private FallbackTeamClient fallbackTeamClient;
	
	public Player create(PlayerDTO playerDTO) {
		
//		boolean playerExists = mongoOperations.exists(Query.query(Criteria.where("document").is(playerDTO.getDocument())), Player.class);
		
//		if (playerExists) {
//			throw new IllegalArgumentException("Player already exists with document: "+playerDTO.getDocument());
//		}
		
		Player player = new Player();
		player.setName(playerDTO.getName());
		player.setDocument(playerDTO.getDocument());
		
		Team team = fallbackTeamClient.getTeamByName(playerDTO.getTeamName());
		
		List<Team> teams = new ArrayList<Team>();
		teams.add(team);
		
		player.setTeams(teams);
		
//		mongoOperations.save(player);
		
		return player;
	}

	@Override
	public Player update(PlayerDTO playerDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player find(String document) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(String document) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Player> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
