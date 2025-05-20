package com.example.portalNoticiasBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.portalNoticiasBackend.modelo.Noticia;

public interface NoticiaRepository extends JpaRepository<Noticia, Long> {
    
}
