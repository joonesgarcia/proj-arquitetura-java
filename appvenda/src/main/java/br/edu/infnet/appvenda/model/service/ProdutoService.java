package br.edu.infnet.appvenda.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appvenda.model.domain.Produto;
import br.edu.infnet.appvenda.repository.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public void incluirProduto(Produto produto) {
		produtoRepository.save(produto);
	}
	public Collection<Produto> obterProdutos(){
		return (Collection<Produto>) produtoRepository.findAll();
	}
	public void printarProdutos() {
		for(Produto produto : obterProdutos()) {
			System.out.println(produto);
		}
	}
	public long obterQtde() {
		return produtoRepository.count();
	}
}
