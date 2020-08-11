package com.vitorgsevero.datapoamobilidade.endpoints;

import com.vitorgsevero.datapoamobilidade.model.ItinerarioOnibus;
import com.vitorgsevero.datapoamobilidade.repository.ItinerarioOnibusRepository;
import com.vitorgsevero.datapoamobilidade.services.ItinerarioOnibusService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Api(tags = "Itinerário Ônibus Controller")
public class ItinerarioOnibusEndpoint {

    @Autowired
    private ItinerarioOnibusRepository itinerarioOnibusRepository;

    @Autowired
    private ItinerarioOnibusService itinerarioOnibusService;

    @PostMapping("itinerario/onibus")
    @ApiOperation(value = "Salva um novo itinerário", response = ItinerarioOnibus[].class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Itinerário criado"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar esse recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado"),
            @ApiResponse(code = 500, message = "Ocorreu uma exceção")
    })
    public ResponseEntity<?> addItinerarioOnibus(@RequestBody ItinerarioOnibus itinerarioOnibus) throws Exception {
        ItinerarioOnibus novoItinerario = itinerarioOnibusService.saveOne(itinerarioOnibus);
        return new ResponseEntity<ItinerarioOnibus>(novoItinerario, HttpStatus.CREATED);
    }


}
