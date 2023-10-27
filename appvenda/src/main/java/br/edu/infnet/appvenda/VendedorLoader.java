package br.edu.infnet.appvenda;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appvenda.model.domain.Vendedor;
import br.edu.infnet.appvenda.model.service.VendedorService;

@Order(1)
@Component
public class VendedorLoader implements ApplicationRunner{

	@Autowired
	private VendedorService vendedorService;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		FileReader file = new FileReader("vendedores.txt");
		BufferedReader buffer = new BufferedReader(file);
		
		String line = buffer.readLine();
		
		System.out.println("Processamento de vendedores iniciado");
		while(line != null) {
			String[] data = line.split(";");

			Vendedor vendedor = new Vendedor();
			
			vendedor.setNome(data[0]);
			vendedor.setCpf(data[1]);
			vendedor.setEmail(data[2]);
			
			vendedorService.incluirVendedor(vendedor);	
			
			line = buffer.readLine();
		}
		System.out.println("Processamento de vendedores finalizado");
		buffer.close();
		
		for(Vendedor vendedor: vendedorService.obterVendedores()) {
			System.out.println(vendedor);
		}
	}
	
}
