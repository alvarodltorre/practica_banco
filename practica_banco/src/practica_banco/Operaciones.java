package practica_banco;

public class Operaciones {
	public void transferencia (Cuenta cuentaOrigen, Cuenta cuentaDestino, double cantidad) {
		cuentaOrigen.setCantidad(cuentaOrigen.getCantidad()-cantidad);
		cuentaDestino.setCantidad(cuentaDestino.getCantidad()+cantidad);
	}
	
	public void prestamo (Cuenta cuentaDestino, double cantidad) {
		cuentaDestino.setCantidad(cuentaDestino.getCantidad()+cantidad);
	}
	
	public void cancelarCuenta (Cuenta cuentaDestino) {
		cuentaDestino.setEstado(false);
	}
	

}
