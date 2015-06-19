package ca.oakey.cloud.gateway;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import ca.oakey.cloud.users.UserService.User;

@Component
public class GatewayService {

	@Autowired
	private LoadBalancer loadBalancer;
	
	private RestTemplate restTemplate = new RestTemplate();
	
	public ResponseEntity<User[]> getUsers() {
		URI uri = loadBalancer.getUri("users");
		URI users = UriComponentsBuilder.fromUri(uri).path("users").build().toUri();
		return restTemplate.getForEntity(users, User[].class);	
	}
}
