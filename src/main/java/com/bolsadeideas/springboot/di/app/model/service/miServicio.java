package com.bolsadeideas.springboot.di.app.model.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("miServicioSimple")
//@Primary
public class miServicio implements IServicio {
	
	@Override
	public String operacion() {
		return "Ejecutando algun proceso importante Simple...";
	}
	
	
}
