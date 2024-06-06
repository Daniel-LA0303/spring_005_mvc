package com.la.springboot.webapp.services;

import java.util.List;

import com.la.springboot.webapp.models.domain.Role;

public interface RoleService {
	
	public List<Role> listar();
	public Role obtenerPorId(Integer id);

}
