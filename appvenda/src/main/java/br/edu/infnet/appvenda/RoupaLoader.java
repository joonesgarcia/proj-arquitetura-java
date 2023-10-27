package br.edu.infnet.appvenda;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import br.edu.infnet.appvenda.model.domain.Roupa;
import br.edu.infnet.appvenda.model.domain.Vendedor;
import br.edu.infnet.appvenda.model.service.RoupaService;

@Order(2)
@Component
public class RoupaLoader implements ApplicationRunner{

	@Autowired
	private RoupaService roupaService;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		FileReader file = new FileReader("roupas.txt");
		BufferedReader buffer = new BufferedReader(file);
		
		String line = buffer.readLine();
		System.out.println("Processamento de roupas iniciado");

		while(line != null) {
			String[] data = line.split(";");

			Roupa roupa = new Roupa();
			
			roupa.setCodigo(Integer.parseInt(data[1]));
			roupa.setDescricao(data[2]);
			roupa.setPreco(Float.parseFloat(data[3]));
			roupa.setEstoque(Boolean.getBoolean(data[4]));
			
			roupa.setTecido(data[5]);
			roupa.setTamanho(data[6]);
			roupa.setPossuiEstampa(Boolean.getBoolean(data[7]));
			
			Vendedor vendedor = new Vendedor();
			vendedor.setId(Integer.parseInt(data[8]));
			
			roupa.setVendedor(vendedor);
			
			roupaService.incluirRoupa(roupa);
			line = buffer.readLine();
		}
		System.out.println("Processamento de roupas finalizado");
		buffer.close();
		
		roupaService.printarRoupas();
	}
	
}
