package com.danielrocha.consultacep;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url="https://viacep.com.br/ws/", name = "viacep")
public interface ViaCEPClient {

	@GetMapping("{cep}/json")
	public Endereco buscaEnderecoPor(@PathVariable("cep") String cep);        
	
}
