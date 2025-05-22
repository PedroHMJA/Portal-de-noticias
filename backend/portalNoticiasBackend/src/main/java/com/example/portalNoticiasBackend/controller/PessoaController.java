package com.example.portalNoticiasBackend.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.portalNoticiasBackend.modelo.Pessoa;
import com.example.portalNoticiasBackend.repository.PessoaRepository;






@RestController
@RequestMapping("api/v1/pessoa")
public class PessoaController {
    @Autowired
    PessoaRepository pessoaRepository;

    @GetMapping("/buscarPessoa/{id}")
    public ResponseEntity<Pessoa> buscarPessoa(@PathVariable Long id) {
        Optional <Pessoa> pessoa = pessoaRepository.findById(id);
        return pessoa.map(ResponseEntity::ok).orElseGet(() ->ResponseEntity.notFound().build());
    }
    
}
