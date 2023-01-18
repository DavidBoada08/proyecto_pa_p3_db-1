package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.correccion.modelo.Cuenta;
import com.example.demo.correccion.modelo.Tranferencia;
import com.example.demo.correccion.service.ICuentaService;
import com.example.demo.correccion.service.ITranferenciaService;

@SpringBootApplication
public class ProyectoPaU2Sc1Application implements CommandLineRunner {

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

		Cuenta cuentaOrigen = new Cuenta();

		Cuenta cuentaDestino = new Cuenta();

		Tranferencia tranferencia = new Tranferencia();

		cuentaOrigen.setNumero("100100100");
		cuentaOrigen.setCedula("1720030723");
		cuentaOrigen.setTipo("AHORROS");
		cuentaOrigen.setSaldo(new BigDecimal(100));

		this.cuentaService.crear(cuentaOrigen);

		cuentaDestino.setNumero("100100101");
		cuentaDestino.setCedula("1720030723");
		cuentaDestino.setTipo("AHORROS");
		cuentaDestino.setSaldo(new BigDecimal(100));

		this.cuentaService.crear(cuentaDestino);

		this.TranferenciaService.generar("100100100","100100101",new BigDecimal(16));

		// cuenta.setNumero("100100100");
		// cuenta.setSaldo(new BigDecimal(200));
		// this.cuentaService.modificar(cuenta);
		
		System.out.println("El Saldo Actual es: ");
		System.out.println(this.cuentaService.buscar("100100100").getSaldo());

	}

}
