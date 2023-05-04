package com.hc.gvet.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hc.gvet.model.entity.Usuario;
import com.hc.gvet.model.service.UsuarioService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UsuarioRestController{
		
	@Autowired
	private UsuarioService userserve;
	
	@GetMapping("/usuarios")
	public List<Usuario> index(){
		return userserve.findAll();
	}
}