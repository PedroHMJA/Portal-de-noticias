package com.example.portalNoticiasBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.portalNoticiasBackend.modelo.Autor;



public interface AutorRepository extends  JpaRepository<Autor, Long>{

}