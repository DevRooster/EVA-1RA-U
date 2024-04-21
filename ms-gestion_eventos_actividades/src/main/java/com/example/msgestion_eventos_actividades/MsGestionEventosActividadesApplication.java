package com.example.msgestion_eventos_actividades;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MsGestionEventosActividadesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsGestionEventosActividadesApplication.class, args);
	}
	@Bean
	public OpenAPI custumOpenAPI(){
		return new OpenAPI().info (new Info()
				.title("OPEN API MICROSERVICIO GESTION DE EVENTOS Y ACTIVIDADES")
				.version("0.0.1")
				.description("servicio web gestion_eventos_actividades")
				.termsOfService("http://swagger.io/terms")
				.license (new License().name("Apache 2.0").url("http://springdoc.org"))
		);
	}
}
