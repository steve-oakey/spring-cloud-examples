package ca.oakey.cloud.edge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
@EnableZuulProxy
public class EdgeServer {

	public static void main(String[] args) {
		SpringApplication.run(EdgeServer.class, args);
	}
}
