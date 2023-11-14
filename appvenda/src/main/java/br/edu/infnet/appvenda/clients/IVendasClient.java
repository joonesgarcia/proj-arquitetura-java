package br.edu.infnet.appvenda.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "http://localhost:8081/api/vendas", name = "vendasClient")
public interface IVendasClient {

	@GetMapping(value = "/informacoes")
	public List<String> obterInformacao();	
}