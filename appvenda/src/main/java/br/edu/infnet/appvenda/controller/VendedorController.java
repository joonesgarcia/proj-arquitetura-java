package br.edu.infnet.appvenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appvenda.model.service.VendedorService;

@Controller
public class VendedorController {

	@Autowired
	private AppController appController;
	
	@Autowired
	private VendedorService vendedorService;


	@GetMapping(value = "/vendedor/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		vendedorService.excluir(id);
		
		return "redirect:/vendedor/lista";
	}
	
	@GetMapping(value = "/vendedor/lista")
	public String obterLista(Model model) {
		
		model.addAttribute("rota", "vendedor");
		model.addAttribute("titulo", "Vendedores:");
		model.addAttribute("listagem", vendedorService.obterVendedores());

		return appController.showHome(model);
	}
}