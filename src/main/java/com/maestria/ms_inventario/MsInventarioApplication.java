package com.maestria.ms_inventario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication


public class MsInventarioApplication {

	@GetMapping("/inventario")
	public String inventario() {
		return "inventario java service";
	}

	public static void main(String[] args) {
		SpringApplication.run(MsInventarioApplication.class, args);
	}

}
