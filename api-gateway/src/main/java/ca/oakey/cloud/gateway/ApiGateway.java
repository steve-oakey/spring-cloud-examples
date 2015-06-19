package ca.oakey.cloud.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.oakey.cloud.users.UserService.User;

@SpringCloudApplication
public class ApiGateway {

	public static void main(String[] args) {
		SpringApplication.run(ApiGateway.class, args);
	}
	@RestController
	@RequestMapping("/")
	public static class ApiVersionOne {

		@Autowired
		private GatewayService gatewayService;
		
		@RequestMapping("/users")
		public ResponseEntity<User[]> getUsers() {
			return gatewayService.getUsers();
		}
	}
}
