package com.hc.gvet.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hc.gvet.model.dao.UsuarioDao;
import com.hc.gvet.model.entity.Usuario;

@Service
public class UsuarioService implements IUsuarioService{

	@Autowired
	private UsuarioDao userdao;
	
	@Override
	public List<Usuario> findAll() {
		return userdao.findAll();
	}
	
}
