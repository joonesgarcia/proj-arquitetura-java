package br.edu.infnet.appvenda;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appvenda.model.domain.Perfume;
import br.edu.infnet.appvenda.model.domain.Perfume.PType;
import br.edu.infnet.appvenda.model.domain.Roupa;
import br.edu.infnet.appvenda.model.service.ProdutoService;

@Order(1)
@Component
public class ProdutoLoader implements ApplicationRunner{

	@Autowired
	private ProdutoService produtoService;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		FileReader file = new FileReader("produtos.txt");
		BufferedReader buffer = new BufferedReader(file);
		
		String line = buffer.readLine();
		System.out.println("Processamento de Produtos iniciado");

		while(line != null) {
			String[] data = line.split(";");
			
			switch(data[0]) {
			case "R":
				Roupa roupa = new Roupa();
				roupa.setCodigo(Integer.parseInt(data[1]));
				roupa.setDescricao(data[2]);
				roupa.setPreco(Float.parseFloat(data[3]));
				roupa.setEstoque(Boolean.getBoolean(data[4]));
				
				roupa.setTecido(data[5]);
				roupa.setTamanho(data[6]);
				roupa.setPossuiEstampa(Boolean.getBoolean(data[7]));
				
				produtoService.incluirProduto(roupa);
				break;
			case "P":
				Perfume perfume = new Perfume();
				perfume.setCodigo(Integer.parseInt(data[1]));
				perfume.setDescricao(data[2]);
				perfume.setPreco(Float.parseFloat(data[3]));
				perfume.setEstoque(Boolean.getBoolean(data[4]));

				perfume.setMililitros(Integer.parseInt(data[5]));
				perfume.setTipo(PType.valueOf(data[6]));
				
				produtoService.incluirProduto(perfume);
				break;
			}
						
			line = buffer.readLine();
		}
		System.out.println("Processamento de Produtos finalizado");
		buffer.close();
		
		produtoService.printarProdutos();
	}
	
}
