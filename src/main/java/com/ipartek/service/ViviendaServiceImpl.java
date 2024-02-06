package com.ipartek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.model.Vivienda;
import com.ipartek.repository.ViviendaRepository;

@Service
public class ViviendaServiceImpl implements IViviendaService {

	@Autowired
	private ViviendaRepository viviendaRepo;
	
	
	@Override
	public List<Vivienda> obtenerTodasViviendasPorCategoria(int categ) {
		
		List<Vivienda> listaViviendas = viviendaRepo.obtenerViviendasPorCateg(categ);
		return listaViviendas;
	}


	@Override
	public void insertarVivienda(Vivienda vivienda) {
		viviendaRepo.save(vivienda);	
	}

}
