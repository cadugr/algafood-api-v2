package com.algaworks.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.NivelUrgencia;
import com.algaworks.algafood.di.notificacao.Notificador;
import com.algaworks.algafood.di.notificacao.TipoDoNotificador;

//@Component
public class AtivacaoClienteService 
	//implements InitializingBean, DisposableBean 
{
	
	@Autowired(required = false)
	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	private Notificador notificador; 
	
	//@PostConstruct
	public void init() {
		System.out.println("INIT " + notificador);
	}
	
	//@PreDestroy
	public void destroy() {
		System.out.println("DESTROY");
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro está ativo no sistema!");
		
	}
	
}
