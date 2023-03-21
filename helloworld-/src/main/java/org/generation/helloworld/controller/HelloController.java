package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//indica para o spring que essa é uma classe controladora
@RestController

//indica um endpoint para nossa aplicação
@RequestMapping("/hello")

public class HelloController {

	@GetMapping
	public String batata() {
		return "Alô mundão";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "Atenção aos detalhes";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "Ficar em dia com as entregas de exercícios";
}
}
