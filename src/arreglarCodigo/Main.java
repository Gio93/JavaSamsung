package arreglarCodigo;

public class Main {
	
	public static void main(String[] args) {
		
		Operacion[] operaciones = {new Suma(4,5),new Suma(7,1), new Resta(9,2), new Suma(4,3), new Resta(10,5)};
		System.out.println(new Operaciones().total(operaciones));
		
	}
	
}
