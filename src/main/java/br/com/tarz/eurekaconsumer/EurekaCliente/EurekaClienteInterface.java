package br.com.tarz.eurekaconsumer.EurekaCliente;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("greeting-service")
public interface EurekaClienteInterface {
	
	@RequestMapping(method = RequestMethod.GET, value = "/greeting")
	String getTeste() ;
		

}
