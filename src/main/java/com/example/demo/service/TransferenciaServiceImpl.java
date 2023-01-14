package com.example.demo.service;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Cuenta;
import com.example.demo.modelo.Tranferencia;
import com.example.demo.repository.ITransferenciaRepo;

@Service
public class TransferenciaServiceImpl implements ITranferenciaService  {
	
	@Autowired
	private ITransferenciaRepo TransferenciaRepo;
	
	@Autowired
	private ICuentaService cuentaService;

	@Override
	public void agregar(Tranferencia Tranferencia) {
		// TODO Auto-generated method stub
		
		this.TransferenciaRepo.insertar(Tranferencia);
		
	}

	@Override
	public Tranferencia buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.TransferenciaRepo.buscar(id);
	}

	@Override
	public void generar(String origen, String destino, BigDecimal monto) {
		// TODO Auto-generated method stub
		
		Cuenta cuentaOrigen = this.cuentaService.buscar(origen);
		Cuenta cuentaDestino = this.cuentaService.buscar(destino);
		
		
		if (cuentaOrigen == null || cuentaOrigen == null) {
			System.err.println("\nSus cuentas son incorrectas reviselas");
		}else if(cuentaOrigen.getSaldo().compareTo(monto)>=0) {
			//transaccion
			BigDecimal comision = monto.multiply(new BigDecimal(0.05));
			BigDecimal resta = cuentaOrigen.getSaldo().subtract(comision);
			resta = resta.subtract(monto);
			cuentaOrigen.setSaldo(resta);
			this.cuentaService.modificar(cuentaOrigen);
			
			resta =cuentaDestino.getSaldo().add(monto);
			
			cuentaDestino.setSaldo(resta);
			this.cuentaService.modificar(cuentaDestino);
			
			//tranferencia
			Tranferencia tranferencia = new Tranferencia();
		
			tranferencia.setComision(comision);
			tranferencia.setFecha(LocalDateTime.now());
			tranferencia.setMonto(monto);
			tranferencia.setCuentaOrigen(origen);
			tranferencia.setCuentaDestino(destino);
			
			this.TransferenciaRepo.insertar(tranferencia);
			
			System.err.println("\nLA TRANSFERENCIA SE REALIZO CON EXITO\n");

			
		}else {

			System.err.println("\nLA TRANSACCION NO PUDO SER REALIZADA\nRevise el monto e intente de nuevo\n");

		}
		
		System.out.println("\n"+cuentaOrigen.toString()+"\n");
		System.out.println("\n"+cuentaDestino.toString()+"\n");
		
		
		
		
	}

	

}
