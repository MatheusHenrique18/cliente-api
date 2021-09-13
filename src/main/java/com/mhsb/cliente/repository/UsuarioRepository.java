package com.mhsb.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mhsb.cliente.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
