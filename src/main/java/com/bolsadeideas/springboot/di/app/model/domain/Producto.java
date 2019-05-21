package com.bolsadeideas.springboot.di.app.model.domain;

public class Producto {

	private String nombre;
	private Integer presio;

	public Producto(String nombre, Integer presio) {
		this.nombre = nombre;
		this.presio = presio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPresio() {
		return presio;
	}

	public void setPresio(Integer presio) {
		this.presio = presio;
	}

}
