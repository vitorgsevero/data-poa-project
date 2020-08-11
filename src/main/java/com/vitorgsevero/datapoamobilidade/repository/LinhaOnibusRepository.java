package com.vitorgsevero.datapoamobilidade.repository;

import com.vitorgsevero.datapoamobilidade.model.ItinerarioOnibus;
import com.vitorgsevero.datapoamobilidade.model.LinhaOnibus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LinhaOnibusRepository extends CrudRepository<LinhaOnibus, Long> {

    List<LinhaOnibus> findByLinha(String linha);

    List<LinhaOnibus> findByCodigo(String codigo);

}
