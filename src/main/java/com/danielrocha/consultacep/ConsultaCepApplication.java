package com.danielrocha.consultacep;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConsultaCepApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsultaCepApplication.class, args);
	}
	
	@Bean
    public CommandLineRunner run(ViaCEPClient client){
        return args -> {
            if (args.length > 0) {
                String cep = args[0];
                
                Endereco endereco = client
                                     .buscaEnderecoPor(cep);
 
                System.out.println(endereco);
            }
        };
    }

}
