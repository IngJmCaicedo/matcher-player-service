package ingjmcaicedo.matcher.player.client.fallback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import ingjmcaicedo.matcher.model.Team;
import ingjmcaicedo.matcher.player.client.TeamServiceClient;

@Service
public class FallbackTeamClient {

	@Autowired
	private TeamServiceClient teamServiceClient;
	
	@HystrixCommand(fallbackMethod = "getTeamCreated")
	public Team getTeamByName(String name){
		return teamServiceClient.getTeamByName(name);
	}
	
	public Team getTeamCreated(String name){
		return teamServiceClient.create(name);
	}
	
}
