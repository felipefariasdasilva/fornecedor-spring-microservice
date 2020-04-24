package com.alura.microservice.fornecedor.fornecedor.controller;

import com.alura.microservice.fornecedor.fornecedor.model.InfoForncedor;
import com.alura.microservice.fornecedor.fornecedor.service.InfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoService infoService;

    @RequestMapping("/{estado}")
    public InfoForncedor getInfoPorEstado(String estado){
       return infoService.getInfoPorEstado(estado);
    }
}