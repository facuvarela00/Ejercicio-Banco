package BancoPackage;

import java.util.HashSet;
/*import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;*/

public class Banco {
	private String nombreBanco="";
	private HashSet <Cuenta> cuentasSueldo;
	private HashSet <CajaDeAhorro> cuentasDeCajaDeAhorro;
	private HashSet <CuentaCorriente> listaDeCuentaCorriente;

	public Banco(String nombreBanco) {
		this.nombreBanco=nombreBanco;
		this.cuentasSueldo=new HashSet <Cuenta>();
		this.cuentasDeCajaDeAhorro=new HashSet <CajaDeAhorro>();
		this.listaDeCuentaCorriente=new HashSet <CuentaCorriente>();
	}

	public void agregarCuentaAlBanco(Cuenta nuevaCuenta) {
		cuentasSueldo.add(nuevaCuenta);
	}



	public String getNombreBanco() {
		return nombreBanco;
	}

	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}

	public void agregarCuentaDeAhorroAlBanco(CajaDeAhorro nuevaCuentaDeCajaDeAhorro) {
		cuentasDeCajaDeAhorro.add(nuevaCuentaDeCajaDeAhorro);	
	}

	public HashSet<Cuenta> getCuentasSueldo() {
		return cuentasSueldo;
	}

	public void setCuentasSueldo(HashSet<Cuenta> cuentasSueldo) {
		this.cuentasSueldo = cuentasSueldo;
	}

	public HashSet<CajaDeAhorro> getCuentasDeCajaDeAhorro() {
		return cuentasDeCajaDeAhorro;
	}

	public void setCuentasDeCajaDeAhorro(HashSet<CajaDeAhorro> cuentasDeCajaDeAhorro) {
		this.cuentasDeCajaDeAhorro = cuentasDeCajaDeAhorro;
	}

	public void agregarCuentaCorrienteAlBanco(CuentaCorriente nuevaCuentaCorriente) {
		this.listaDeCuentaCorriente.add(nuevaCuentaCorriente);

	}

	public HashSet<CuentaCorriente> getListaDeCuentaCorriente() {
		return listaDeCuentaCorriente;
	}

	public void setListaDeCuentaCorriente(HashSet<CuentaCorriente> listaDeCuentaCorriente) {
		this.listaDeCuentaCorriente = listaDeCuentaCorriente;
	}

	/*public void ordenarCuestasCorrientes() {
		List<Cliente> lista = new ArrayList<> (listaDeCuentaCorriente);
		Collections.sort(lista, new ComparadorDni());
	
	}*/

}
