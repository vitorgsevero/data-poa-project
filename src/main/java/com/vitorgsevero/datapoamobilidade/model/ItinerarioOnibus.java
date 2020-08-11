package com.vitorgsevero.datapoamobilidade.model;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import java.util.Date;

@Data
@Entity
@ApiModel(description = "Todos os detalhes sobre o model de Itinerario.")
public class ItinerarioOnibus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Linha do Ônibus")
    private String linha;

    @NotBlank(message = "Data de Extração")
    private Date data_extracao;

    @NotBlank(message = "Sentido da Viagem")
    private String sentido;

    @NotBlank(message = "Número")
    private int numero;

    @NotBlank(message = "Tipo")
    private String tipo;

    @NotBlank(message = "Nome")
    private String nome;

    @NotBlank(message = "Endereço Logradouro")
    private String endereco_logradouro;


}
