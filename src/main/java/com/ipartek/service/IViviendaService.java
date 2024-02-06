package com.ipartek.service;

import java.util.List;

import com.ipartek.model.Vivienda;

public interface IViviendaService {
	
	public List<Vivienda> obtenerTodasViviendasPorCategoria(int categ);
	public void insertarVivienda(Vivienda vivienda);

}
