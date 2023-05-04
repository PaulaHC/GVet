package com.hc.gvet.model.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="historial")
public class Historial implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long code;
	
	//Forean Keys
    @ManyToOne(fetch = FetchType.LAZY)
    private Mascota mascota;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}