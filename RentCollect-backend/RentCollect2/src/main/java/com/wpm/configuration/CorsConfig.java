package com.wpm.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig  implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/RentCollect/**")
			.allowedOrigins("http://localhost:4200")
			.allowedMethods("PUT", "DELETE", "GET", "POST", "PATCH", "OPTIONS", "HEAD")
			.allowedHeaders("X-Auth-Token", "Content-Type")
			.exposedHeaders("header1", "header2")
			.allowCredentials(false).maxAge(4800);
	}
}
