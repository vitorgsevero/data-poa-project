package com.vitorgsevero.datapoamobilidade.endpoints;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LinhaOnibusEndpoint {

    @Id
    @GeneratedValue
    private Long id;

}
