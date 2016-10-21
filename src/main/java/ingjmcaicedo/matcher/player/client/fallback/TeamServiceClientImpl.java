package ingjmcaicedo.matcher.player.client.fallback;

import org.springframework.stereotype.Component;

import ingjmcaicedo.matcher.model.Team;
import ingjmcaicedo.matcher.player.client.TeamServiceClient;

@Component
public class TeamServiceClientImpl implements TeamServiceClient{

	@Override
	public Team getTeamByName(String name) {
		Team team = new Team();
		team.setName(name);
		return team;
	}

	@Override
	public Team create(String name) {
		return null;
	}

}
