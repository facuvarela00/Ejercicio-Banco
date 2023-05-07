package BancoPackage;

public class CajaDeAhorro extends Cuenta{
	
	private Integer contadorExtraccion;

	public CajaDeAhorro(Cliente nuevoCliente) {
		super(nuevoCliente);
		contadorExtraccion=0;
		
	}
	
	@Override
	public void extraerSaldo(Double saldoQueSeExtrae) {
		
		Double extra=6.0;
		
		if (this.saldo>=saldoQueSeExtrae&&contadorExtraccion<4) {
			this.saldo-=saldoQueSeExtrae;
			contadorExtraccion++;
			}
		
		else if (this.saldo>=saldoQueSeExtrae&&contadorExtraccion>=4) {
			saldoQueSeExtrae+=extra;
			if(this.saldo>=saldoQueSeExtrae) {
				this.saldo-=saldoQueSeExtrae;
				contadorExtraccion++;
			}	
		}
	}
}
