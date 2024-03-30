package com.iarley.bookstore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.iarley.bookstore.service.DBService;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	DBService dbService;

    @Bean
     int instanciaBaseDeDados() {

		this.dbService.instanciaBaseDeDados();
		return 0;
	}
}
