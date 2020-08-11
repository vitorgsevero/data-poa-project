package com.vitorgsevero.datapoamobilidade;

//import com.vitorgsevero.datapoamobilidade.template.APIConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class DatapoaMobilidadeApplication {

	@PostConstruct
	void started() {
		TimeZone.setDefault(TimeZone.getTimeZone("TimeZone"));
	}

	public static void main(String[] args) {
		SpringApplication.run(DatapoaMobilidadeApplication.class, args);
	}

}
