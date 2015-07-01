package ca.oakey.cloud.gateway;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ca.oakey.cloud.users.UserServiceApplication.User;

@FeignClient("user-service")
public interface UserClient {
	@RequestMapping(method = RequestMethod.GET, value = "/users")
	List<User> getUsers();
}
