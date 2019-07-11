package com.mitocode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Signos;
import com.mitocode.service.ISignosService;

@RestController
@RequestMapping("/signos")
public class SignosController {

	@Autowired
	private ISignosService service;
	
	@GetMapping
	public List<Signos> listar() {
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Signos listarPorId(@PathVariable("id") Integer idSignos) {
		return service.leer(idSignos);
	}
	
	@PostMapping
	public Signos registrar(@RequestBody Signos per) {
		return service.registrar(per);
	}
	
	@PutMapping
	public Signos modificar(@RequestBody Signos per) {
		return service.modificar(per);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer idSignos) {
		service.eliminar(idSignos);
	}
}
