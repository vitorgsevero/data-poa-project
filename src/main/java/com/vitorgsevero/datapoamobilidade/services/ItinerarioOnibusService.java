package com.vitorgsevero.datapoamobilidade.services;

import com.vitorgsevero.datapoamobilidade.exceptions.ItinerarioIdException;
import com.vitorgsevero.datapoamobilidade.model.ItinerarioOnibus;
import com.vitorgsevero.datapoamobilidade.repository.ItinerarioOnibusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItinerarioOnibusService {


  @Autowired
  private ItinerarioOnibusRepository itinerarioOnibusRepository;


  public ItinerarioOnibus saveOne(ItinerarioOnibus itinerarioOnibus) {
      try {
          return itinerarioOnibusRepository.save(itinerarioOnibus);

      }catch (Exception e){
          throw new ItinerarioIdException("Itinenário '" +itinerarioOnibus.getId()+ "' já existe.");
      }
  }




}
