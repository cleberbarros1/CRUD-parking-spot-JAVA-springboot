package com.parking.parkingproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//CRUD DE SPOTS PARA VEÍCULOS DE UM PRÉDIO OU CONDOMÍNIO FEITO POR CLEBER BARROS
// BASEADO NA AULA DA PROFESSORA MICHELLI BRITO - SPRING BOOT / CURSO COMPLETO 2022
//https://www.youtube.com/watch?v=LXRU-Z36GEU&t=1532s

@SpringBootApplication
@RestController
public class ParkingProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingProjectApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "Olá Mundo!";
	}

}
