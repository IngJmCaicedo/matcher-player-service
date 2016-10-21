package ingjmcaicedo.matcher.player.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ingjmcaicedo.matcher.model.Team;

//@FeignClient(name="matcher-team-service", fallback=TeamServiceClientImpl.class)
@FeignClient(name="matcher-team-service")
public interface TeamServiceClient {
	
	@RequestMapping(method = RequestMethod.GET, value="/team/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	Team getTeamByName(@PathVariable("name") String name);

	@RequestMapping(method = RequestMethod.POST, value="/team/create", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	Team create(@RequestParam("name") String name);

}
