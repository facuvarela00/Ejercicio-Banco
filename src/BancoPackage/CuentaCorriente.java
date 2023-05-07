package BancoPackage;

public class CuentaCorriente extends Cuenta{
	
	private Double descubierto;
	private Double deuda;

	public CuentaCorriente(Cliente nuevoCliente) {
		super(nuevoCliente);
		this.descubierto=0.0;
		this.deuda=0.0;
	}

	public void setDescubierto(Double descubierto) {
		this.descubierto=descubierto;
		
	}

	public Double getDescubierto() {
		return descubierto;
	}
	
	@Override
	public void extraerSaldo(Double saldoQueSeExtrae) {
		Double descubiertoUtilizado=0.00;
		
		if (saldo>=saldoQueSeExtrae) {
			saldo-=saldoQueSeExtrae;
		}else if(saldo+descubierto>=saldoQueSeExtrae) {
			descubiertoUtilizado=saldoQueSeExtrae-saldo;
			descubierto-=(descubiertoUtilizado);
			deuda+=(descubiertoUtilizado+descubiertoUtilizado*0.05);
			saldo=0.0;		
		}
		
	}

	public Double getDeuda() {
		return deuda;
	}

	public void setDeuda(Double deuda) {
		this.deuda = deuda;
	}

}
