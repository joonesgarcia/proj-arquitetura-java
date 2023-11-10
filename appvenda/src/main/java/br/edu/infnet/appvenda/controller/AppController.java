package br.edu.infnet.appvenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appvenda.model.service.PerfumeService;
import br.edu.infnet.appvenda.model.service.RoupaService;
import br.edu.infnet.appvenda.model.service.ProdutoService;
import br.edu.infnet.appvenda.model.service.VendedorService;

@Controller
public class AppController {
	
	@Autowired
	private VendedorService vendedorService;
	@Autowired
	private ProdutoService produtoService;
	@Autowired
	private PerfumeService perfumeService;
	@Autowired
	private RoupaService roupaService;

	@GetMapping(value = "/")
	public String showHome(Model model) {
		
		model.addAttribute("qtdeVendedor", vendedorService.OBT);
		model.addAttribute("qtdeProduto", produtoService.obterProdutos().size());
		model.addAttribute("qtdePerfume", perfumeService.obterPerfumes().size());
		model.addAttribute("qtdeRoupa", roupaService.obterRoupas().size());

		return "home";
	}
	
	@GetMapping(value = "/produto/lista")
	public String obterListaProduto(Model model) {
		
		model.addAttribute("titulo", "Produtos:");
		model.addAttribute("listagem", produtoService.obterProdutos());

		return showHome(model);
	}

	@GetMapping(value = "/roupa/lista")
	public String obterListaRoupa(Model model) {
		
		model.addAttribute("titulo", "Roupas:");
		model.addAttribute("listagem", roupaService.obterRoupas());

		return showHome(model);
	}

	@GetMapping(value = "/perfume/lista")
	public String obterListaPerfume(Model model) {
		
		model.addAttribute("titulo", "Perfumes:");
		model.addAttribute("listagem", perfumeService.obterPerfumes());

		return showHome(model);
	}
}