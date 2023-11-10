package br.edu.infnet.appvenda.model.service;

import org.springframework.data.repository.CrudRepository;

public interface ICountable<T> extends CrudRepository<T, Integer>{
	default public long obterQtde() {
		return count();
	}

}
