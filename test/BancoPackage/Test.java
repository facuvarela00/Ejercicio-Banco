package BancoPackage;

import static org.junit.Assert.*;


public class Test {

	@org.junit.Test
	public void queSeCreeUnBanco() {
		String nombreBanco="xD";
		Banco nuevoBanco=new Banco(nombreBanco);
	}
	
	@org.junit.Test
	public void queSeCreeUnCliente() {
		String nombreCliente="Pedro", apellidoCliente="Pascal";
		Integer dniCliente=42952902;
		
		Cliente nuevoCliente=new Cliente(nombreCliente,apellidoCliente,dniCliente);
	}
	
	@org.junit.Test
	public void queSeAgregueCuentaABanco() {
		//Inicializacion
		String nombreBanco="xD";
		String nombreCliente="Pedro", apellidoCliente="Pascal";
		Integer dniCliente=42952902;
		
		//Instanciación
		Banco nuevoBanco=new Banco(nombreBanco);
		Cliente nuevoCliente=new Cliente(nombreCliente,apellidoCliente,dniCliente);
		Cuenta nuevaCuenta=new Cuenta(nuevoCliente);
		
		//Verificacion
		nuevoBanco.agregarCuentaAlBanco(nuevaCuenta);
		
		assertEquals(1,nuevoBanco.getCuentasSueldo().size());	
	}
	
	@org.junit.Test
	public void queSeAgregueCuentaSaldoABanco() {
		//Inicializacion
		String nombreBanco="xD";
		String nombreCliente="Pedro", apellidoCliente="Pascal";
		Integer dniCliente=42952902;
		
		//Instanciación
		Banco nuevoBanco=new Banco(nombreBanco);
		Cliente nuevoCliente=new Cliente(nombreCliente,apellidoCliente,dniCliente);
		Cuenta nuevaCuenta=new Cuenta(nuevoCliente);
		
		//Verificacion
		nuevoBanco.agregarCuentaAlBanco(nuevaCuenta);
		
		assertEquals(1,nuevoBanco.getCuentasSueldo().size());	
	}
	
	
	
	
	@org.junit.Test
	public void queSeDepositeDineroDeCuentaSueldo() {
		//Inicializacion
		String nombreBanco="xD";
		String nombreCliente="Pedro", apellidoCliente="Pascal";
		Integer dniCliente=42952902;
		
		
		//Instanciación
		Banco nuevoBanco=new Banco(nombreBanco);
		Cliente nuevoCliente=new Cliente(nombreCliente,apellidoCliente,dniCliente);
		Cuenta nuevaCuenta=new Cuenta(nuevoCliente);
		nuevoBanco.agregarCuentaAlBanco(nuevaCuenta);
				
		//Verificacion
		Double saldoQueSeAgrega=100.0;
		Double ve=100.0;
		
		
		nuevaCuenta.agregarSaldo(saldoQueSeAgrega);
		
	
		assertEquals(ve,nuevaCuenta.getSaldo());
	}
	
	@org.junit.Test
	public void queSeExtraigaDineroDeCuentaSueldo() {
		//Inicializacion
		String nombreBanco="xD";
		String nombreCliente="Pedro", apellidoCliente="Pascal";
		Integer dniCliente=42952902;
				
				
		//Instanciación
		Banco nuevoBanco=new Banco(nombreBanco);
		Cliente nuevoCliente=new Cliente(nombreCliente,apellidoCliente,dniCliente);
		Cuenta nuevaCuenta=new Cuenta(nuevoCliente);
		nuevoBanco.agregarCuentaAlBanco(nuevaCuenta);
			
		//Verificacion
	    Double saldoQueSeExtrae=100.0;
	    Double ve=400.00;
	    
	    nuevaCuenta.agregarSaldo(500.0);
	    nuevaCuenta.extraerSaldo(saldoQueSeExtrae);
		
	    assertEquals(ve,nuevaCuenta.getSaldo());
	}
	
	@org.junit.Test
	public void queSeCreeCuentaCajaDeAhorro() {
		//Inicializacion
		String nombreBanco="xD";
		String nombreCliente="Pedro", apellidoCliente="Pascal";
		Integer dniCliente=42952902;
				
				
		//Instanciación
		Banco nuevoBanco=new Banco(nombreBanco);
		Cliente nuevoCliente=new Cliente(nombreCliente,apellidoCliente,dniCliente);
		CajaDeAhorro nuevaCuentaDeCajaDeAhorro=new CajaDeAhorro(nuevoCliente);
		nuevoBanco.agregarCuentaDeAhorroAlBanco(nuevaCuentaDeCajaDeAhorro);
			
		//Verificacion
		assertEquals(0,nuevoBanco.getCuentasSueldo().size());
		assertEquals(1,nuevoBanco.getCuentasDeCajaDeAhorro().size());	
	}
	
	@org.junit.Test
	public void queSeCreeExtraigaEnCuentaCajaDeAhorro() {
		//Inicializacion
		String nombreBanco="xD";
		String nombreCliente="Pedro", apellidoCliente="Pascal";
		Integer dniCliente=42952902;
				
				
		//Instanciación
		Banco nuevoBanco=new Banco(nombreBanco);
		Cliente nuevoCliente=new Cliente(nombreCliente,apellidoCliente,dniCliente);
		CajaDeAhorro nuevaCuentaDeCajaDeAhorro=new CajaDeAhorro(nuevoCliente);
		nuevoBanco.agregarCuentaDeAhorroAlBanco(nuevaCuentaDeCajaDeAhorro);
			
		//Verificacion
		Double ve=188.0;
		Double saldoAExtraer=50.0;
		
		nuevaCuentaDeCajaDeAhorro.agregarSaldo(500.0);
		nuevaCuentaDeCajaDeAhorro.extraerSaldo(saldoAExtraer);
		nuevaCuentaDeCajaDeAhorro.extraerSaldo(saldoAExtraer);
		nuevaCuentaDeCajaDeAhorro.extraerSaldo(saldoAExtraer);
		nuevaCuentaDeCajaDeAhorro.extraerSaldo(saldoAExtraer);
		nuevaCuentaDeCajaDeAhorro.extraerSaldo(saldoAExtraer);
		nuevaCuentaDeCajaDeAhorro.extraerSaldo(saldoAExtraer);
		
		assertEquals(ve,nuevaCuentaDeCajaDeAhorro.getSaldo());
}
	@org.junit.Test
	public void queSeCreeCuentaCorriente() {
		//Inicializacion
		String nombreBanco="xD";
		String nombreCliente="Pedro", apellidoCliente="Pascal";
		Integer dniCliente=42952902;
				
				
		//Instanciación
		Banco nuevoBanco=new Banco(nombreBanco);
		Cliente nuevoCliente=new Cliente(nombreCliente,apellidoCliente,dniCliente);
		CuentaCorriente nuevaCuentaCorriente=new CuentaCorriente(nuevoCliente);
		nuevoBanco.agregarCuentaCorrienteAlBanco(nuevaCuentaCorriente);
			
		//Verificacion
		assertEquals(1,nuevoBanco.getListaDeCuentaCorriente().size());	
	}
	
	@org.junit.Test
	public void queSeApliqueDescubierto() {
		//Inicializacion
		String nombreBanco="xD";
		String nombreCliente="Pedro", apellidoCliente="Pascal";
		Integer dniCliente=42952902;
		Double descubierto = 400.00;
				
				
		//Instanciación
		Banco nuevoBanco=new Banco(nombreBanco);
		Cliente nuevoCliente=new Cliente(nombreCliente,apellidoCliente,dniCliente);
		CuentaCorriente nuevaCuentaCorriente=new CuentaCorriente(nuevoCliente);
		nuevoBanco.agregarCuentaCorrienteAlBanco(nuevaCuentaCorriente);
		nuevaCuentaCorriente.setDescubierto(descubierto);	
		
		//Verificacion Que se cree descubierto
		Double ve= 400.0;
		assertEquals(ve,nuevaCuentaCorriente.getDescubierto());	
		
		//Verificacion Que se extraiga del descubierto
		Double es= 1100.0;
		nuevaCuentaCorriente.agregarSaldo(1000.0);
		nuevaCuentaCorriente.extraerSaldo(es);
		
		ve= 300.0;
		assertEquals(ve,nuevaCuentaCorriente.getDescubierto());	
		
		//Verificacion Que no extraiga
		es= 500.0;
		nuevaCuentaCorriente.extraerSaldo(es);
				
		ve= 300.0;
		assertEquals(ve,nuevaCuentaCorriente.getDescubierto());	
	}
	
	@org.junit.Test
	public void queSeSumeDeuda() {
		//Inicializacion
		String nombreBanco="xD";
		String nombreCliente="Pedro", apellidoCliente="Pascal";
		Integer dniCliente=42952902;
		Double descubierto = 400.00;
				
				
		//Instanciación
		Banco nuevoBanco=new Banco(nombreBanco);
		Cliente nuevoCliente=new Cliente(nombreCliente,apellidoCliente,dniCliente);
		CuentaCorriente nuevaCuentaCorriente=new CuentaCorriente(nuevoCliente);
		nuevoBanco.agregarCuentaCorrienteAlBanco(nuevaCuentaCorriente);
		nuevaCuentaCorriente.setDescubierto(descubierto);	
		
		//Verificacion Que se cree descubierto
		Double ve= 400.0;
		assertEquals(ve,nuevaCuentaCorriente.getDescubierto());	
		
		//Verificacion Que se sume deuda
		Double es= 1100.0;
		nuevaCuentaCorriente.agregarSaldo(1000.0);
		nuevaCuentaCorriente.extraerSaldo(es);
		
		ve= 105.0;
		assertEquals(ve,nuevaCuentaCorriente.getDeuda());	
	}
	
	@org.junit.Test
	public void ordenarCliente() {
		//Inicializacion
		String nombreBanco="xD";
		String nombreCliente="Pedro", apellidoCliente="Pascal";
		Integer dniCliente=42952902;
		
		String nombreCliente1="Pedra", apellidoCliente1="Pascala";
		Integer dniCliente1=42952903;
				
		String nombreCliente2="Pedre", apellidoCliente2="Pascale";
		Integer dniCliente2=42952901;
				
		//Instanciación
		Banco nuevoBanco=new Banco(nombreBanco);
		Cliente nuevoCliente=new Cliente(nombreCliente,apellidoCliente,dniCliente);
		CuentaCorriente nuevaCuentaCorriente=new CuentaCorriente(nuevoCliente);
		nuevoBanco.agregarCuentaCorrienteAlBanco(nuevaCuentaCorriente);
		
		Cliente nuevoCliente1=new Cliente(nombreCliente1,apellidoCliente1,dniCliente1);
		CuentaCorriente nuevaCuentaCorriente1=new CuentaCorriente(nuevoCliente1);
		nuevoBanco.agregarCuentaCorrienteAlBanco(nuevaCuentaCorriente1);
		
		Cliente nuevoCliente2=new Cliente(nombreCliente2,apellidoCliente2,dniCliente2);
		CuentaCorriente nuevaCuentaCorriente2=new CuentaCorriente(nuevoCliente2);
		nuevoBanco.agregarCuentaCorrienteAlBanco(nuevaCuentaCorriente2);
		
		//Verificacion Que se cree descubierto
		assertEquals(3,nuevoBanco.getListaDeCuentaCorriente().size());
		
		
	}
	
	
}