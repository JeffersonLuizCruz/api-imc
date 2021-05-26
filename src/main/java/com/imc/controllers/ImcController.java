package com.imc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imc.entities.Imc;
import com.imc.entities.ResultadoImc;
import com.imc.service.impl.CalculoImcServiceImpl;

@RestController
@RequestMapping("/api/v1/imc")
public class ImcController {
	
	@Autowired private CalculoImcServiceImpl calc;
	
	@PostMapping
	public ResultadoImc calcular(@RequestBody Imc imc) {
		ResultadoImc save = calc.calcularImc(imc);
		return save;
	}

}
