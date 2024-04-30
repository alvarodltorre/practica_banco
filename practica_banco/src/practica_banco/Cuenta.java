package practica_banco;

public class Cuenta {

	private String iban;
	private Cliente cliente;
	private double cantidad;
	private boolean estado = true;
	
	public Cuenta (String iban, Cliente cliente, double cantidad) {
		 this.iban = iban;
		 this.cliente = cliente;
		 this.cantidad = cantidad;
		 this.estado = true;
	}
	
	public String getIban() {
		return iban;
	}
	
	public void setIban(String iban) {
		this.iban = iban;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public double getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
}
