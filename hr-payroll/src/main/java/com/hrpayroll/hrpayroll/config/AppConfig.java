package com.hrpayroll.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

	@Bean /*Pelo Bean o spring sabe que vai gerenciar essa classe de uma biblioteca externa*/
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
