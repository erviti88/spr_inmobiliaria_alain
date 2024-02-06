package com.ipartek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.model.Dificultad;
import com.ipartek.model.Receta;
import com.ipartek.repository.DificultadRepository;
import com.ipartek.repository.RecetaRepository;

import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;

@Service
public class InicializarDatos {

	@Autowired
	private RecetaRepository recetaRepo;
	
	@Autowired
	private DificultadRepository dificultadRepo;
	
	// Este método se ejecutará después de la inicialización de la instancia de la clase
	@PostConstruct
	@Transactional
	public void cargarDatosBD() { 
		// Crear instancias de dificultades y guardarlas en el repositorio
		Dificultad facil = dificultadRepo.save(new Dificultad(1, "Fácil")); 
		Dificultad normal = dificultadRepo.save(new Dificultad(2, "Normal"));
		Dificultad dificil = dificultadRepo.save(new Dificultad(3, "Difícil"));
		 
		// Añadir recetas con las dificultades obtenidas 
		recetaRepo.save(new Receta(1, "Sopa de Tomate", 200, facil));
		recetaRepo.save(new Receta(2, "Paella de Mariscos", 600, normal));
		recetaRepo.save(new Receta(3, "Tarta de Chocolate", 400, dificil));
		recetaRepo.save(new Receta(4, "Ensalada César", 150, facil));
		recetaRepo.save(new Receta(5, "Risotto de Champiñones", 450, normal));
	}
}
