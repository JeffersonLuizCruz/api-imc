package com.imc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imc.entities.ResultadoImc;

@Repository
public interface ResultadoRepository extends JpaRepository<ResultadoImc, Long>{

}
