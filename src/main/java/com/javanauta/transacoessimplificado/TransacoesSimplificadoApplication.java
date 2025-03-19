package com.javanauta.transacoessimplificado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TransacoesSimplificadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransacoesSimplificadoApplication.class, args);
	}

}
