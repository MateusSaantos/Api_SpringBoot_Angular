package com.project.demo.api.repositorio;

import com.project.demo.api.modelo.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositorio extends CrudRepository<Cliente, Long> {
}
