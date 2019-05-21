package com.bolsadeideas.springboot.di.app.model.domain;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Component
//@RequestScope
@SessionScope
public class Factura implements Serializable {

	private static final long serialVersionUID = 6292207956952960004L;
	@Value("${factura.descripcion}")
	private String descripcion;
	@Autowired
	private cliente cliente;
	@Autowired
	private List<itemFactura> items;
	@PostConstruct
	public void inicializar() {
		cliente.setNombre(cliente.getNombre().concat(" jose"));
			
	}
	@PreDestroy
	public void destruir() {
		System.out.println("Factura Destruida".concat(descripcion));
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public cliente getCliente() {
		return cliente;
	}

	public void setCliente(cliente cliente) {
		this.cliente = cliente;
	}

	public List<itemFactura> getItems() {
		return items;
	}

	public void setItems(List<itemFactura> items) {
		this.items = items;
	}

}
