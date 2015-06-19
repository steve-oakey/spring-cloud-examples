package ca.oakey.cloud.gateway;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;

@Component
public class LoadBalancer {

	@Autowired
	private LoadBalancerClient loadBalancer;
	
	public URI getUri(String serviceId) {
		ServiceInstance instance = loadBalancer.choose(serviceId);
		return instance.getUri();
	}
}
