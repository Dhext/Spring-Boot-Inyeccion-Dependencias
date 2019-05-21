package com.bolsadeideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsadeideas.springboot.di.app.model.domain.Producto;
import com.bolsadeideas.springboot.di.app.model.domain.itemFactura;
import com.bolsadeideas.springboot.di.app.model.service.IServicio;
import com.bolsadeideas.springboot.di.app.model.service.miServicio;
import com.bolsadeideas.springboot.di.app.model.service.miServicioComplejo;

@Configuration
public class AppConfig {
	@Bean("miServicioSimple")
	public IServicio registrarMiServicio() {
		return new miServicio();
	}
	@Bean("miServicioComplejo")
	@Primary
	public IServicio registrarMiServicioComplejo() {
		return new miServicioComplejo();
	}
	@Bean("itemsFactura")
	@Primary
	public List<itemFactura> registrarItems(){
		Producto p1 = new Producto("Camara", 100);
		Producto p2 = new Producto("Bisicleta", 1100);
		Producto p3 = new Producto("Cell", 1000);
		Producto p4 = new Producto("shoss", 200);
		itemFactura linea1 = new itemFactura(p1, 1);
		itemFactura linea2 = new itemFactura(p2, 2);
		itemFactura linea3 = new itemFactura(p3, 3);
		itemFactura linea4 = new itemFactura(p4, 4);
		return Arrays.asList(linea1,linea2,linea3,linea4);
	}
	
	@Bean("itemsFacturaOficina")
	public List<itemFactura> registrarItemsOficina(){
		Producto p1 = new Producto("monitor", 100);
		Producto p2 = new Producto("teclado", 1800);
		Producto p3 = new Producto("engrapadora", 2000);
		Producto p4 = new Producto("cilla", 500);
		itemFactura linea1 = new itemFactura(p1, 1);
		itemFactura linea2 = new itemFactura(p2, 2);
		itemFactura linea3 = new itemFactura(p3, 3);
		itemFactura linea4 = new itemFactura(p4, 4);
		return Arrays.asList(linea1,linea2,linea3,linea4);
	}
}
