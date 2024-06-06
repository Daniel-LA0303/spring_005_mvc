package com.la.springboot.webapp.models.dao;

import com.la.springboot.webapp.models.entity.Cliente;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long>{


}
