package com.ipartek.service;

import java.util.List;

import com.ipartek.model.Categoria;

public interface ICategoriaService {
	
	public List<Categoria> obtenerTodasCategorias(); 
	public void guardarCategoria(Categoria categ);
	
	
}
