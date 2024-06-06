package com.la.springboot.webapp.services;

import java.util.List;

import com.la.springboot.webapp.models.domain.Pais;

public interface PaisService {
	
	public List<Pais> listar();
	public Pais obtenerPorId(Integer id);

}
