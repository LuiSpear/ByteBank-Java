
public class Cuenta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular = new Cliente();
	
	public void depositar(double saldo) {
		this.saldo = this.saldo + saldo;
	}
	public boolean retirar (double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		}else {
			return false;
		}
	}
	public boolean transferir (double  valor, Cuenta cuenta) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			cuenta.depositar(valor);
			return true;
		}else {
			return false;
		}
	}
	
}
