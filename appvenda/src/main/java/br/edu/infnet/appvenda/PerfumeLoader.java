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
import br.edu.infnet.appvenda.model.service.PerfumeService;

@Order(3)
@Component
public class PerfumeLoader implements ApplicationRunner{

	@Autowired
	private PerfumeService perfumeService;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		FileReader file = new FileReader("perfumes.txt");
		BufferedReader buffer = new BufferedReader(file);	
		
		String line = buffer.readLine();
		System.out.println("Processamento de perfumes iniciado");

		while(line != null) {
			String[] data = line.split(";");

			Perfume perfume = new Perfume();
			
			perfume.setCodigo(Integer.parseInt(data[1]));
			perfume.setDescricao(data[2]);
			perfume.setPreco(Float.parseFloat(data[3]));
			perfume.setEstoque(Boolean.getBoolean(data[4]));
			
			perfume.setMililitros(Integer.parseInt(data[5]));
			perfume.setTipo(PType.valueOf(data[6]));
			
			perfumeService.incluirPerfume(perfume);
			line = buffer.readLine();
		}
		System.out.println("Processamento de perfumes finalizado");
		buffer.close();
		
		perfumeService.printarPerfumes();
	}
}
