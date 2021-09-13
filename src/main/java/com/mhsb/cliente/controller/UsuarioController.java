package com.mhsb.cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mhsb.cliente.model.Usuario;
import com.mhsb.cliente.repository.UsuarioRepository;

@RestController
@RequestMapping("api/usuario")
@CrossOrigin(origins = "*")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping
	private List<Usuario> findAll(){
		
		List<Usuario> usuariosCadastrados = usuarioRepository.findAll();
		
		if(usuariosCadastrados.size() == 0) {
			Usuario usuAdmin = new Usuario();
			usuAdmin.setNome("admin");
			usuAdmin.setSenha("123456");
			usuAdmin.setPerfil("ADMIN");
			Usuario usuComum = new Usuario();
			usuComum.setNome("comum");
			usuComum.setSenha("123456");
			usuComum.setPerfil("COMUM");
			
			usuarioRepository.save(usuAdmin);
			usuarioRepository.save(usuComum);
		}else {
			return usuariosCadastrados;
		}
		
		return usuarioRepository.findAll();
	}
	
}
