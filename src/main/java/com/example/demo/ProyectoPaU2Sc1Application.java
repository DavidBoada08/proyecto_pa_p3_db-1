package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Cuenta;
import com.example.demo.service.ICuentaService;

@SpringBootApplication
public class ProyectoPaU2Sc1Application implements CommandLineRunner  {
	
	@Autowired
	private ICuentaService cuentaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2Sc1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Cuenta cuenta = new Cuenta();
		
		cuenta.setNumero("100100101");
		cuenta.setCedula("1720030723");
		cuenta.setTipo("AHORROS");
		cuenta.setSaldo(null);
		
		this.cuentaService.crear(cuenta);
		
		
		
		
		
		
		
		
		
		
		
	}

}
