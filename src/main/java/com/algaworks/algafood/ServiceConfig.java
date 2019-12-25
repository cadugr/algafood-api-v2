package com.algaworks.algafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.algaworks.algafood.di.notificacao.Notificador;
import com.algaworks.algafood.di.service.AtivacaoClienteService;

@Configuration
public class ServiceConfig {

	@Bean
	//Desta forma conseguimos utilizar um bean definido em outra classe de configuração, ou seja, 
	//passando apenas a interface como parâmetro para este bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		return new AtivacaoClienteService(notificador);
	}
	
}
