package com.ipartek.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ipartek.model.Vivienda;

public interface ViviendaRepository  extends JpaRepository<Vivienda, Integer>{

	@Query(value = "SELECT * FROM viviendas where categoria_id=:valor", nativeQuery = true)
	List<Vivienda> obtenerViviendasPorCateg(@Param("valor") int valor);
}
