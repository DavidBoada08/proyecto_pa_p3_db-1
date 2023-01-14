package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Cuenta;
import com.example.demo.modelo.Tranferencia;
import com.example.demo.service.ICuentaService;
import com.example.demo.service.ITranferenciaService;

@SpringBootApplication
public class ProyectoPaU2Sc1Application implements CommandLineRunner  {
	
	@Autowired
	private ICuentaService cuentaService;
	
	@Autowired
	private ITranferenciaService TranferenciaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2Sc1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Cuenta cuenta = new Cuenta();
		
		Tranferencia tranferencia = new Tranferencia();
		
		//cuenta.setNumero("100100100");
		//cuenta.setNumero("100100101");
		cuenta.setCedula("1720030723");
		cuenta.setTipo("AHORROS");
		//cuenta.setSaldo(new BigDecimal(100));
		
		//this.cuentaService.crear(cuenta);
		
		//this.TranferenciaService.generar("100100100","100100101",new BigDecimal(16));
		
		cuenta.setNumero("100100100");
		cuenta.setSaldo(new BigDecimal(200));
		this.cuentaService.modificar(cuenta);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
