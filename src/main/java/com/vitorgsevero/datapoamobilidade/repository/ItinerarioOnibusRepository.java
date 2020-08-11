package com.vitorgsevero.datapoamobilidade.repository;

import com.vitorgsevero.datapoamobilidade.model.ItinerarioOnibus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItinerarioOnibusRepository extends CrudRepository<ItinerarioOnibus, Long> {

    List<ItinerarioOnibus> findByLinha(String linha);

    List<ItinerarioOnibus> findByNome(String nome);

//    ItinerarioOnibus getById(Long id);

}
