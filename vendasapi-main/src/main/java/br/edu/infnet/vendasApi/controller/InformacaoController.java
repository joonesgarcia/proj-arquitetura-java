package br.edu.infnet.vendasApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.vendasApi.model.domain.Informacao;
import br.edu.infnet.vendasApi.model.service.InformacaoService;

@RestController
@RequestMapping("/api/informacao")
public class InformacaoController {

	@Autowired
	private InformacaoService informacaoService;

	@GetMapping(value = "/lista")
	public List<Informacao> obterLista(){
		return informacaoService.obterLista();
	}

	@PostMapping(value = "/incluir")
	public Informacao incluir(@RequestBody Informacao informacao) {
		return informacaoService.incluir(informacao);
	}
}