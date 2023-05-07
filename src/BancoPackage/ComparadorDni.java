package BancoPackage;

import java.util.Comparator;

public class ComparadorDni implements Comparator <Cliente>{

	@Override
	public int compare(Cliente cliente1, Cliente cliente2) {

		return Integer.compare(cliente1.getDniCliente(), cliente2.getDniCliente());
	}

}
