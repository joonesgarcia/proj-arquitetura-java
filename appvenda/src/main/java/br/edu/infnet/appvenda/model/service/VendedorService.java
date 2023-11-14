package br.edu.infnet.appvenda.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.appvenda.clients.IEnderecoClient;
import br.edu.infnet.appvenda.model.domain.Endereco;
import br.edu.infnet.appvenda.model.domain.Vendedor;
import br.edu.infnet.appvenda.repository.VendedorRepository;

@Service
public class VendedorService {
	@Autowired
	private VendedorRepository vendedorRepository;
	
	@Autowired
	private IEnderecoClient enderecoClient;
	
	public void incluirVendedor(Vendedor vendedor) {
		Endereco endereco = enderecoClient.buscarCep(vendedor.getEndereco().getCep());

		vendedor.setEndereco(endereco);
		vendedorRepository.save(vendedor);
	}
	public void excluir(Integer id) {
		vendedorRepository.deleteById(id);
	}
	public Collection<Vendedor> obterVendedores(){
		return (Collection<Vendedor>) vendedorRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
	}
	public long obterQtde() {
		return vendedorRepository.count();
	}
	public Vendedor pesquisar(String cpf) {
		return vendedorRepository.findByCpf(cpf);
	}
}
