package com.mhsb.cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mhsb.cliente.model.Usuario;
import com.mhsb.cliente.repository.UsuarioRepository;

@RestController
@RequestMapping("api/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping
	private List<Usuario> findAll(){
		return usuarioRepository.findAll();
	}
	
}
