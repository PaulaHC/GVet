package com.hc.gvet.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hc.gvet.model.entity.Usuario;


public interface UsuarioDao extends CrudRepository<Usuario,Long>{


    public List<Usuario> findAll();
}