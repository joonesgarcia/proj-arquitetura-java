package br.edu.infnet.appvenda.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appvenda.model.domain.Roupa;
import br.edu.infnet.appvenda.repository.RoupaRepository;

@Service
public class RoupaService {
	@Autowired
	private RoupaRepository roupaRepository;
	
	public void incluirRoupa(Roupa roupa) {
		roupaRepository.save(roupa);
	}
	public Collection<Roupa> obterRoupas(){
		return (Collection<Roupa>) roupaRepository.findAll();
	}
	public void printarRoupas() {
		for(Roupa roupa : obterRoupas()) {
			System.out.println(roupa);
		}
	}
	public long obterQtde() {
		return roupaRepository.count();
	}
}
