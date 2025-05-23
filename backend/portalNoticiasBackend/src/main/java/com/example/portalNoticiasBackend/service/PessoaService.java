package com.example.portalNoticiasBackend.service;


import org.springframework.stereotype.Service;

import com.example.portalNoticiasBackend.modelo.Pessoa;
import com.example.portalNoticiasBackend.repository.PessoaRepository;

@Service
public class PessoaService {
    
    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }

    public void salvarPessoa(Pessoa pessoa){
        this.pessoaRepository.save(pessoa);
    }

    public Pessoa buscarPessoaId(Long id){
        return this.pessoaRepository.findById(id).get();
    }

    public Pessoa atualizarPessoaId(Pessoa pessoa){
        return this.pessoaRepository.save(pessoa);
    }

    public void deletarPessoaId(Long id){
        this.pessoaRepository.deleteById(id);
    }
}
