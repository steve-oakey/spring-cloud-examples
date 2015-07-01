package ca.oakey.cloud.gateway;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ca.oakey.cloud.users.UserServiceApplication.User;

@SpringCloudApplication
@EnableFeignClients
@RestController
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

	@Autowired
	private UserClient userClient;

	@RequestMapping(method = RequestMethod.GET, value = "/users")
	public List<User> getUsers() {
		return this.userClient.getUsers();
	}

}
