package br.edu.infnet.appvenda.repository;

import org.springframework.stereotype.Repository;

import br.edu.infnet.appvenda.model.domain.Roupa;
import br.edu.infnet.appvenda.model.service.ICountable;

@Repository
public interface RoupaRepository extends ICountable<Roupa> {

}
