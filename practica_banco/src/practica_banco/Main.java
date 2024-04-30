package practica_banco;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("paco", "de la torre", 87);
		Cliente cliente2 = new Cliente("alvaro", "redanion", 54);

		Cuenta cuenta1 = new Cuenta("123ABC", cliente1, 50000);
		Cuenta cuenta2 = new Cuenta("456ZYX", cliente2, 90000);
		
		Operaciones.transferencia(cuenta1, cuenta2, 20000);
		
	}

}
