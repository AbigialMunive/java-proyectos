
public class CrearCuenta {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta ();
		primeraCuenta.getSaldo = 1000;
		//primeraCuenta.pais = "Peru"; NO COMPILA
		
		System.out.println(primeraCuenta.getSaldo);
		
		Cuenta segundaCuenta = new Cuenta ();
		segundaCuenta.saldo = 500;
		segundaCuenta.depositar(400);
		
		System.out.println(segundaCuenta.getSaldo);
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		if (primeraCuenta == segundaCuenta); {
			System.out.println("Son el mismo objeto");
			
			else(){
				System.out.println("Son diferentes");
	}
	
	}


