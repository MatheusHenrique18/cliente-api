package com.mhsb.cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.mhsb.cliente.model.Cliente;
import com.mhsb.cliente.repository.ClienteRepository;

@RestController
@RequestMapping("api/cliente")
@CrossOrigin(origins = "*")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;
	
	
	@PostMapping
	public Cliente salvar(@RequestBody Cliente cliente) {
		
		return clienteRepository.save(cliente);
	}
	
	@GetMapping("/{id}")
	public Cliente getById(@PathVariable Long id) {
		
		return clienteRepository.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
	@GetMapping
	public List<Cliente> findAll(){
		return clienteRepository.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		clienteRepository.deleteById(id);
	}
}
