package com.example.hellobruna.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidades")
public class HabilidadeController {

	
	@GetMapping
	public String hello() {
		return "Meus objetivos de aprendizagem para essa semana são: "
				+ "<br /> Trabalhar em equipe com eficiência"
				+ "<br /> Persistência para atingir os resultados"
				+ "<br /> Resiliência para enfrentar os desafios"
				+ "<br /> Aprender e absorver o conteúdo ensinado";
		
		
	}
}
