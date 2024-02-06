package com.ipartek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.model.Categoria;
import com.ipartek.repository.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements ICategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepo;

	@Override
	public List<Categoria> obtenerTodasCategorias() {
		List<Categoria> listaCategorias= categoriaRepo.findAll();
		return listaCategorias;
	}

	@Override
	public void guardarCategoria(Categoria categ) {
		categoriaRepo.save(categ);
		
	}

	
	
}
