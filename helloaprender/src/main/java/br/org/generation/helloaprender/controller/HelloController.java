package br.org.generation.helloaprender.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloaprender")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Essa semana eu desejo começar aprender um pouco mais sobre SpringBoot, e também consolidar meus conhecimentos sobre MySQL.";
	}

}
