package br.com.tarz.eurekaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tarz.eurekaconsumer.EurekaCliente.EurekaClienteInterface;

@RestController
@RequestMapping("/greeting")
public class EurekaController {

	@Autowired
	EurekaClienteInterface consumer;
	
	@GetMapping
	public String greetingConsumer() {
		return consumer.getTeste();
	}
}
