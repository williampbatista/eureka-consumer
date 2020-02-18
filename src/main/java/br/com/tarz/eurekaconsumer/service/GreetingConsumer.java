package br.com.tarz.eurekaconsumer.service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class GreetingConsumer {

//	@Autowired
//	private RestTemplate restTemplate;
//
//	@Autowired
//	private EurekaService eurekaService;
//
//	private String greetingServiceId = "greeting-service";
//
//	public String getRandomGreeting() {
//		URI uri = eurekaService.getInstance(greetingServiceId);
//		String greeting = restTemplate.getForObject(uri.toString() + "/greeting", String.class);
//		return greeting;
//	}
}
