package com.imc.service;

import com.imc.entities.ParametroImc;
import com.imc.entities.ResultadoImc;

public interface IImcService {

	public ResultadoImc calcularImc(ParametroImc param);

}
