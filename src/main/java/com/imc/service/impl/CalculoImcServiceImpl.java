package com.imc.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imc.entities.Imc;
import com.imc.entities.ResultadoImc;
import com.imc.repositories.ResultadoRepository;
import com.imc.service.CalculoImcService;

@Service
public class CalculoImcServiceImpl implements CalculoImcService{
	
	@Autowired private ResultadoRepository repo;

	@Override
	public ResultadoImc calcularImc(Imc param) {
		Double alturaAoQuadrado = param.getAltura() * param.getAltura();
		Double imc = param.getPeso() / alturaAoQuadrado;
		
		ResultadoImc resultado = new ResultadoImc();
		resultado.setImc(imc);
		
		return repo.save(resultado);
	}
	

}
