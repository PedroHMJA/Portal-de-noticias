package com.example.portalNoticiasBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.portalNoticiasBackend.modelo.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
