
public class PruebaEncapsulamiento {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		Cliente cliente = new Cliente ();
		cliente.setNombre("Diego");
		cliente.setDocumento ("fdfd3434");
		
		cuenta.setTitular(cliente);
		
		Cliente titular = cuenta.titular;
		System.out.println(cliente.getNombre());
		
		System.out.println(cuenta.getTitular().getNombre());
		
		System.out.println(titular);
	}
}
