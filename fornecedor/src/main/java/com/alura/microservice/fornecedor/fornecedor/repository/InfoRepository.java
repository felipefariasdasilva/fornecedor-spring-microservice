package com.alura.microservice.fornecedor.fornecedor.repository;

import com.alura.microservice.fornecedor.fornecedor.model.InfoForncedor;

import org.springframework.data.repository.CrudRepository;

public interface InfoRepository extends CrudRepository<InfoForncedor, Long>{

    InfoForncedor findByEstado(String estado);

}