package com.algaworks.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
	
	//Pontos de injeção possíveis: No atributo, no construtor ou no método set
	
	@Autowired
	private Notificador notificador; 
	
	//Este é um ponto de injeção, ou seja, aonde injetamos um componente do Spring
	//@Autowired
	//public AtivacaoClienteService(Notificador notificador) {
	//	this.notificador = notificador;
	//}
	
	//public AtivacaoClienteService (String qualquer) {
		
	//}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}

	//Outro tipo de ponto de injeção
	//@Autowired
	//public void setNotificador(Notificador notificador) {
	//	this.notificador = notificador;
	//}
	
}
