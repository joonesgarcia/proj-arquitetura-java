package br.edu.infnet.appvenda.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appvenda.model.domain.Perfume;

@Service
public class PerfumeService {
	private Map<Integer, Perfume> mapaPerfume = new HashMap<Integer, Perfume>();
	
	public void incluirPerfume(Perfume perfume) {
		mapaPerfume.put(perfume.getCodigo(), perfume);
	}
	public Collection<Perfume> obterPerfumes(){
		return mapaPerfume.values();
	}
	public void printarPerfumes() {
		for(Perfume perfume : obterPerfumes()) {
			System.out.println(perfume);
		}
	}
}
