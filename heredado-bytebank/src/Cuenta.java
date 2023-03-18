
public abstract class Cuenta {
	
	
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	private static int total;
	
		
	public Cuenta() {
		
	}
	
	public Cuenta(int agencia, int numero) {
		
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estoy creando una nueva cuenta");
		
		Cuenta.total++;
		}
	

	// void NO retorna valor
	public abstract void depositar(double valor);
	//{
		//this.saldo += valor;
		// este objeto
		// this object
	//}

	// Retorna valor true or false
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saca (valor);
			cuenta.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	
	
	
	public int getAgencia () {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Cuenta.total;
	}

}