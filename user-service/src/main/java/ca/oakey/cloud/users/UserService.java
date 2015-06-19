package ca.oakey.cloud.users;


import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SpringCloudApplication
@RestController
public class UserService {

	public static void main(String[] args) {
		SpringApplication.run(UserService.class, args);
	}

	@RequestMapping("/users")
	public List<User> getUsers() {
		return Arrays.asList(new User("sdoakey", "Stephen Oakey"), new User("akoakey", "Ash Oakey"));
	}

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public static class User {
		private String id;
		private String name;
	}
}
