package br.edu.infnet.appvenda.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appvenda.model.domain.Vendedor;
import br.edu.infnet.appvenda.repository.VendedorRepository;

@Service
public class VendedorService {
	@Autowired
	private VendedorRepository vendedorRepository;
	
	public void incluirVendedor(Vendedor vendedor) {
		vendedorRepository.save(vendedor);
	}
	public Collection<Vendedor> obterVendedores(){
		return (Collection<Vendedor>) vendedorRepository.findAll();
	}
	
	public long obterQtde() {
		return vendedorRepository.count();
	}
}
