package br.edu.infnet.appvenda.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appvenda.model.domain.Perfume;

@Repository
public interface PerfumeRepository extends CrudRepository<Perfume, Integer> {

}
