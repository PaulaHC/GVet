package com.hc.gvet.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name="mascota")
public class Mascota implements Serializable{

	@Id
	@Column(name="code")
	@NotEmpty(message ="No puede estar vacio")
	private String codigo;
	
	@Column(name="nombre")
	@NotEmpty(message ="No puede estar vacio")
	private String nombre;
	
	@Column(name="apellido")
	@NotEmpty(message ="No puede estar vacio")
	private int edad;
	
	@Column(name="especie")
	@NotEmpty(message ="No puede estar vacio")
	private String especie;
	
	@Column(name="raza")
	@NotEmpty(message ="No puede estar vacio")
	private String raza;
	
	//Foreyn keys
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "mascota",cascade = CascadeType.ALL)
	private List<Historial> historiales;
	
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuario;
    
    
    
	
	public Mascota() {
		this.historiales= new ArrayList<>();
				
	}




	public String getCodigo() {
		return codigo;
	}




	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public int getEdad() {
		return edad;
	}




	public void setEdad(int edad) {
		this.edad = edad;
	}




	public String getEspecie() {
		return especie;
	}




	public void setEspecie(String especie) {
		this.especie = especie;
	}




	public String getRaza() {
		return raza;
	}




	public void setRaza(String raza) {
		this.raza = raza;
	}




	public Usuario getusuario() {
		return usuario;
	}




	public void setusuario(Usuario usuario) {
		this.usuario = usuario;
	}




	private static final long serialVersionUID = 1L;
	
}