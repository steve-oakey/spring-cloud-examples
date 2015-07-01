package ca.oakey.cloud.users;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	@RequestMapping("/users")
	public List<User> getUsers() {
		return Arrays.asList(new User("sdoakey", "Steve Oakey"));
	}

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public static class User {
		private String id;
		private String name;
	}
}
