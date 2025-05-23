package com.example.portalNoticiasBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.portalNoticiasBackend.modelo.Pessoa;
import com.example.portalNoticiasBackend.service.PessoaService;





@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    PessoaService pessoaService;

    @GetMapping("/buscar/{id}")
    public Pessoa buscarPessoa(@PathVariable Long id){
        return this.pessoaService.buscarPessoaId(id);
    }
    
}
