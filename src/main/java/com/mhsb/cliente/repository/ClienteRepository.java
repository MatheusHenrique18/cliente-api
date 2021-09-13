package com.mhsb.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mhsb.cliente.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
