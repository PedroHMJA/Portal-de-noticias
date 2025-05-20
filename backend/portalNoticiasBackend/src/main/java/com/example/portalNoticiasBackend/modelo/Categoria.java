package com.example.portalNoticiasBackend.modelo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome", unique=true, nullable=false)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "categoria_pai")
    private Categoria categoriaPai;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoriaPai() {
        return categoriaPai;
    }

    public void setCategoria(Categoria categoriaPai) {
        this.categoriaPai = categoriaPai;
    }

}
