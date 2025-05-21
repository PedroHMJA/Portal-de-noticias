package com.example.portalNoticiasBackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.portalNoticiasBackend.modelo.Autor;
import com.example.portalNoticiasBackend.modelo.Categoria;
import com.example.portalNoticiasBackend.modelo.Noticia;
import com.example.portalNoticiasBackend.modelo.Pessoa;
import com.example.portalNoticiasBackend.modelo.Usuario;
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
        Usuario usuario = new Usuario();
        Usuario usuario2 = new Usuario();
        Autor autor = new Autor();
        Noticia noticia = new Noticia();
        Categoria categoria = new Categoria();


        autor.setNome("autor1");
        autor.setBiografia("escrevo noticias esportivas");
        autor.setEmail("autor1@email.com");
        autorRepository.save(autor);

        categoria.setnome("Esportes");
        categoriaRepository.save(categoria);


        noticia.setAutor(autor);
        noticia.setCategoria(categoria);
        noticia.setConteudo("Time A vence Time B");
        noticia.setTitulo("Campeonato Futsal");
        noticia.setStatus("publicada");
        noticiaRepository.save(noticia);

        usuario.setEmail("usuario@email.com");
        usuario.setLogin("usuario123");
        usuario.setSenha("usr123");
        usuario.setNome("João");
        usuarioRepository.save(usuario);

        usuario2.setEmail("usuario2@email.com");
        usuario2.setLogin("usuario456");
        usuario2.setSenha("usr456");
        usuario2.setNome("Jose");
        usuarioRepository.save(usuario2);

    }

    
}