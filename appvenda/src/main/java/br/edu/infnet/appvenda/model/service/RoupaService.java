package br.edu.infnet.appvenda.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appvenda.model.domain.Roupa;

@Service
public class RoupaService {
	private Map<Integer, Roupa> mapaRoupa = new HashMap<Integer, Roupa>();
	
	public void incluirRoupa(Roupa roupa) {
		mapaRoupa.put(roupa.getCodigo(), roupa);
	}
	public Collection<Roupa> obterRoupas(){
		return mapaRoupa.values();
	}
	public void printarRoupas() {
		for(Roupa roupa : obterRoupas()) {
			System.out.println(roupa);
		}
	}
}
