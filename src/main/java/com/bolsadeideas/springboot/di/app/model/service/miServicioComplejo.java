package com.bolsadeideas.springboot.di.app.model.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
//primary hace que se ejecute en lugar de la otra
@Component("miServicioComplejo")
@Primary
public class miServicioComplejo implements IServicio {
	
	@Override
	public String operacion() {
		return "Ejecutando algun proceso importante Complicado...";
	}
	
	
}
