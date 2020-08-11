package com.vitorgsevero.datapoamobilidade.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ItinerarioIdException extends RuntimeException{

    public ItinerarioIdException(String message){
        super(message);
    }

}
