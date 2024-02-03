
public class Referencia {
	public static void main(String[] args) {
		Cliente luis = new Cliente();
		luis.nombre = "Luis";
		luis.documento = "2004";
		luis.numero = "3139613055";

		Cuenta cuentadeluis = new Cuenta();
		cuentadeluis.agencia = 1;
		cuentadeluis.titular = luis;
		System.out.println(cuentadeluis);
	}
}
