package com.example.portalNoticiasBackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.portalNoticiasBackend.modelo.Pessoa;
import com.example.portalNoticiasBackend.repository.AutorRepository;
import com.example.portalNoticiasBackend.repository.CategoriaRepository;
import com.example.portalNoticiasBackend.repository.NoticiaRepository;
import com.example.portalNoticiasBackend.repository.PessoaRepository;
import com.example.portalNoticiasBackend.repository.UsuarioRepository;


@Component
public class DataFixture implements CommandLineRunner {

    @Autowired
    private AutorRepository autorRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private NoticiaRepository noticiaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PessoaRepository pessoaRepository;



    @Override
    public void run(String... args) throws Exception {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Teste");
        pessoa.setEmail("teste@email");
        pessoaRepository.save(pessoa);
    }

    
}