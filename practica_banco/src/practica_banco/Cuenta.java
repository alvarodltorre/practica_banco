package practica_banco;

public class Cuenta {

	String iban;
	String cliente;
	int cantidad;
	boolean estado = true;
	
	public Cuenta () {
		 this.iban = iban;
		 this.cliente = cliente;
		 this.cantidad = cantidad;
		 this.estado = estado;
	}
	
	public String getIban() {
		return iban;
	}
	
	public void setIban(String Iban) {
		this.iban = iban;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public void setCliente(String Cliente) {
		this.cliente = cliente;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int Cantidad) {
		this.cantidad = cantidad;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void setEstado(boolean Estado) {
		this.estado = estado;
	}
}
