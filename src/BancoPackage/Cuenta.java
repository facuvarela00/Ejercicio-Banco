package BancoPackage;

public class Cuenta {
	
	private Cliente nuevoCliente=null;
	protected Double saldo;
	
	public Cuenta(Cliente nuevoCliente) {
		this.nuevoCliente=nuevoCliente;
		this.saldo=0.0;
	}

	public Cliente getNuevoCliente() {
		return nuevoCliente;
	}

	public void setNuevoCliente(Cliente nuevoCliente) {
		this.nuevoCliente = nuevoCliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void agregarSaldo(Double saldoQueSeAgrega) {
		this.saldo+=saldoQueSeAgrega;
	}

	public void extraerSaldo(Double saldoQueSeExtrae) {
		if (saldo>=saldoQueSeExtrae) {
			saldo-=saldoQueSeExtrae;
		}
		
	}
	
}
