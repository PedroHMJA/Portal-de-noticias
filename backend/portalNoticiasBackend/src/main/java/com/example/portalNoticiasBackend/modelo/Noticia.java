package com.example.portalNoticiasBackend.modelo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Noticia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name="subtitulo")
    private String subtitulo;

    @Column(name = "conteudo")
    private String conteudo;

    @Column(name = "dataPublicacao")
    private LocalDate dataPublicacao;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
    
    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;

    @Column( name = "status")
    private String status;
    

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getConteudo() {
        return conteudo;
    }

 
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }


    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }


    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }


    public Categoria getCategoria() {
        return categoria;
    }


    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

}
