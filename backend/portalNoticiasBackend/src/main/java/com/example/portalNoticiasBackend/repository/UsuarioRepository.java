package com.example.portalNoticiasBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.portalNoticiasBackend.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
