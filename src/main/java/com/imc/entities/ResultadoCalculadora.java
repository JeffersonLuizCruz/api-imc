package com.imc.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter @Setter
public class ResultadoCalculadora implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	private String type;
	private Double firstValue;
	private Double secondValue;
	private Double result;

}
