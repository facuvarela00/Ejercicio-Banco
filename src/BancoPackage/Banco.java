package BancoPackage;

import java.util.HashSet;

public class Banco {
private String nombreBanco="";
private HashSet <Cuenta> cuentasSueldo;
private HashSet <CajaDeAhorro> cuentasDeCajaDeAhorro;

public Banco(String nombreBanco) {
	this.nombreBanco=nombreBanco;
	this.cuentasSueldo=new HashSet <Cuenta>();
	this.cuentasDeCajaDeAhorro=new HashSet <CajaDeAhorro>();
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

}
