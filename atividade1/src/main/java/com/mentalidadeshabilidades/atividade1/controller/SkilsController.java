package com.mentalidadeshabilidades.atividade1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skins")
public class SkilsController 
{
	@GetMapping
	public String mentalidadesHabilidades() 
	{
		return "Atenção ao Detalhe e Persistencia.";
	}
		
}
