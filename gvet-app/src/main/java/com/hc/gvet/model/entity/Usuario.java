package com.hc.gvet.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable{
	
	@Id
	@NotEmpty(message ="No puede estar vacio")
	@Column(name="dni")
	private String dni;
	
	@NotEmpty(message ="No puede estar vacio")
	@Column(name="nombre")
	private String Nombre;
	
	@NotEmpty(message ="No puede estar vacio")
	@Column(name="apellido")
	private String apellido;
	
	@NotEmpty(message ="No puede estar vacio")
	@Column(name="alojamiento")
	private String alojamiento;
	
	@NotEmpty(message ="No puede estar vacio")
	@Column(name="email")
	private String email;
	
	@NotEmpty(message ="No puede estar vacio")
	@Column(name="telefono")
	private String telefono;
	
	
	private String foto;
	
	//Foreny keys
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "usuario",cascade = CascadeType.ALL)
	private List<Mascota> mascotas;

	
	
	
	public Usuario() {
		this.mascotas=new ArrayList<>();
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public String getNombre() {
		return Nombre;
	}



	public void setNombre(String nombre) {
		Nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getAlojamiento() {
		return alojamiento;
	}



	public void setAlojamiento(String alojamiento) {
		this.alojamiento = alojamiento;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String gettelefono() {
		return telefono;
	}



	public void settelefono(String telefono) {
		this.telefono = telefono;
	}



	public String getFoto() {
		return foto;
	}



	public void setFoto(String foto) {
		this.foto = foto;
	}

	

	public List<Mascota> getMascotas() {
		return mascotas;
	}



	public void setMascotas(List<Mascota> mascotas) {
		this.mascotas = mascotas;
	}



	private static final long serialVersionUID = 1L;
}