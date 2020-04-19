package com.algaworks.algafood.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

//Com isso, estamos dizendo para o SDJ que não queremos que ele crie uma implementação do JpaRepository pra nós 
@NoRepositoryBean
public interface CustomJpaRepository<T, ID> extends JpaRepository<T, ID> {
	
	Optional<T> buscarPrimeiro();
	void detach(T entity);

}
