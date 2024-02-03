
public class PruebaMetodos {

	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		miCuenta.saldo = 300;
		miCuenta.depositar(200);

		System.out.println(miCuenta.saldo);

		miCuenta.retirar(100);
		System.out.println(miCuenta.saldo);

		Cuenta cuentadeJimena = new Cuenta();
		cuentadeJimena.depositar(100);
		boolean puedetransferir = cuentadeJimena.transferir(50, miCuenta);

		if (puedetransferir) {
			System.out.println("Transferencia Exitosa");
		} else {
			System.out.println("Transferencia Denegada");
		}
		
		System.out.println(cuentadeJimena.saldo);
		System.out.println(miCuenta.saldo);

	}
}
