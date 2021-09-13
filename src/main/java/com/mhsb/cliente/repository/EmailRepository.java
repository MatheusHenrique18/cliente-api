package com.mhsb.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mhsb.cliente.model.Email;

public interface EmailRepository extends JpaRepository<Email, Long> {

}
