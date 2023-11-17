package br.edu.infnet.appvenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appvenda.model.domain.Informacao;
import br.edu.infnet.appvenda.model.service.InformacaoService;

@Controller
public class InformacaoController {

	@Autowired
	private InformacaoService informacaoService;

	@PostMapping(value = "/informacao/incluir")
	public String incluir(Informacao informacao) {

		Informacao result = informacaoService.incluir(informacao);

		System.out.println("RESULT: " + result);

		return "redirect:/";
	}
}