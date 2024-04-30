package practica_banco;

public abstract class Operaciones {
	public static void transferencia (Cuenta cuentaOrigen, Cuenta cuentaDestino, double cantidad) {
		cuentaOrigen.setCantidad(cuentaOrigen.getCantidad()-cantidad);
		cuentaDestino.setCantidad(cuentaDestino.getCantidad()+cantidad);
	}
	
	public static void prestamo (Cuenta cuentaDestino, double cantidad) {
		cuentaDestino.setCantidad(cuentaDestino.getCantidad()+cantidad);
	}
	
	public static void cancelarCuenta (Cuenta cuentaDestino) {
		cuentaDestino.setEstado(false);
	}
	

}
