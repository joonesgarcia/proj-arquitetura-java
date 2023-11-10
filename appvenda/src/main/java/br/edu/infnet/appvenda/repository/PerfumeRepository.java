package br.edu.infnet.appvenda.repository;

import org.springframework.stereotype.Repository;

import br.edu.infnet.appvenda.model.domain.Perfume;
import br.edu.infnet.appvenda.model.service.ICountable;

@Repository
public interface PerfumeRepository extends ICountable<Perfume> {

}
