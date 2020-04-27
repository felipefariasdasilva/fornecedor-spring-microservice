package com.alura.microservice.fornecedor.fornecedor.service;

import com.alura.microservice.fornecedor.fornecedor.model.InfoForncedor;
import com.alura.microservice.fornecedor.fornecedor.repository.InfoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    @Autowired
    private InfoRepository InfoRepository;

    public InfoForncedor getInfoPorEstado(String estado){
        return InfoRepository.findByEstado(estado);
    }
}