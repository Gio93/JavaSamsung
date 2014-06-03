package expresiones;

public class Numero extends Expresion{
	private int valor;
	
	public Numero(int valor){
		this.valor = valor;
	}
	
	@Override
	public int operar() {
		return valor;
	}

	@Override
	public String ver() {
		return Integer.toString(valor);
	}


}
