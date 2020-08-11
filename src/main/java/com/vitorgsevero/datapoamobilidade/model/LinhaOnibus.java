package com.vitorgsevero.datapoamobilidade.model;

import io.swagger.annotations.ApiModel;
import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@ApiModel(description = "Todos os detalhes sobre o model de Linha.")
public class LinhaOnibus {

    @Id
    private String id;

    @NotBlank(message = "Código da linha")
    private String codigo;

    @NotBlank(message = "Nome da linha")
    private String nome;

}
