package br.edu.infnet.appvenda.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appvenda.clients.IVendasClient;

@Service
public class VendasService {

	@Autowired
	private IVendasClient vendasClient;

	public List<String> obterInformacao(){
		return vendasClient.obterInformacao();
	}
}
