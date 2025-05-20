package com.example.portalNoticiasBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.portalNoticiasBackend.modelo.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    
}
