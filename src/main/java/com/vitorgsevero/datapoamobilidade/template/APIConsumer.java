package com.vitorgsevero.datapoamobilidade.template;

import com.vitorgsevero.datapoamobilidade.model.LinhaOnibus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;

public class APIConsumer {

    public ResponseEntity<LinhaOnibus> connectAPI(){

        RestTemplate restTemplate = new RestTemplate();

        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON, MediaType.APPLICATION_OCTET_STREAM, MediaType.TEXT_HTML, MediaType.APPLICATION_PDF));
        restTemplate.getMessageConverters().add(mappingJackson2HttpMessageConverter);

        String url = "http://www.poatransporte.com.br/php/facades/process.php?a=nc&p=%&t=o";
        ResponseEntity<LinhaOnibus> response = restTemplate.getForEntity(url, LinhaOnibus.class);

        System.out.println(response.getBody());

        return response;

    }




}
