package com.ipartek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.model.Categoria;
import com.ipartek.model.Vivienda;

import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;

@Service
public class InicializarDatos {
	
	@Autowired
 	private IViviendaService viviendaServ;
	
	@Autowired
 	private ICategoriaService categoriaServ;
	
	@PostConstruct
	@Transactional
	public void cargarDatosBD(){
		
		
		Categoria venta=new Categoria(1, "Venta");
		categoriaServ.guardarCategoria(venta);
		
		Categoria alquiler=new Categoria(2, "Alquiler");
		categoriaServ.guardarCategoria(alquiler);
		
		
		viviendaServ.insertarVivienda(new Vivienda(1, "Calle Falsa 123", 123456, venta));
		viviendaServ.insertarVivienda(new Vivienda(2, "Elm Street", 666666, venta));
		viviendaServ.insertarVivienda(new Vivienda(3, "Sesame Street", 456789, alquiler));
		
	
	
	
	}
}
