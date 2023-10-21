package br.edu.infnet.appvenda.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appvenda.model.domain.Produto;

@Service
public class ProdutoService {
	private Map<Integer, Produto> mapaProduto = new HashMap<Integer, Produto>();
	
	public void incluirProduto(Produto produto) {
		mapaProduto.put(produto.getCodigo(), produto);
	}
	public Collection<Produto> obterProdutos(){
		return mapaProduto.values();
	}
	public void printarProdutos() {
		for(Produto produto : obterProdutos()) {
			System.out.println(produto);
		}
	}
}
