package com.imc.service;

import com.imc.entities.Imc;
import com.imc.entities.ResultadoImc;


public interface CalculoImcService {
	public ResultadoImc calcularImc(Imc param);
}