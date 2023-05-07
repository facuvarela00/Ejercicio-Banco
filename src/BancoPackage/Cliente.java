package BancoPackage;

public class Cliente {
	private String nombreCliente="Pedro", apellidoCliente="Pascal";
	private Integer dniCliente=42952902;
	
	public Cliente(String nombreCliente, String apellidoCliente, Integer dniCliente) {
		this.nombreCliente=nombreCliente;
		this.apellidoCliente=apellidoCliente;
		this.dniCliente=dniCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}

	public Integer getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(Integer dniCliente) {
		this.dniCliente = dniCliente;
	}

	
	
}
