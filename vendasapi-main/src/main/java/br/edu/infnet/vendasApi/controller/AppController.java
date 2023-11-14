package br.edu.infnet.vendasApi.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vendas")
public class AppController {

	@GetMapping(value = "/informacoes")
	public List<String> obterInformacao(){
		
		return new ArrayList<String>(
					Arrays.asList(
							"Professor: Elberth Moraes",
							"Disciplina: Arquitetura Java",
							"Instituição: Instituto Infnet"
						)
				);
	}
}