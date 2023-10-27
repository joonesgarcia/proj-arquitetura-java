package br.edu.infnet.appvenda.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appvenda.model.domain.Perfume;
import br.edu.infnet.appvenda.repository.PerfumeRepository;

@Service
public class PerfumeService {
	@Autowired
	private PerfumeRepository perfumeRepository;
	
	public void incluirPerfume(Perfume perfume) {
		perfumeRepository.save(perfume);
	}
	public Collection<Perfume> obterPerfumes(){
		return (Collection<Perfume>) perfumeRepository.findAll();
	}
	public void printarPerfumes() {
		for(Perfume perfume : obterPerfumes()) {
			System.out.println(perfume);
		}
	}
}
