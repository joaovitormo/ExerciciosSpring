package br.org.generation.hellohabilidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hellohabilidades")
public class helloController {
	
	@GetMapping
	public String hello() {
		return "Eu utilizei a mentalidade de persistência, e a habilidade de atenção ao detalhe, para realizar esse exercício!";
	}
}
