package calculadora;

import upm.jbb.IO;

public class ComandoSumar implements Comando {
	private Calculadora calcu;
	
	public ComandoSumar(Calculadora calcu){
		this.calcu = calcu;
	}

	@Override
	public void execute() {
		this.calcu.sumar(IO.in.readInt());
		
	}
	
	@Override
	public String toString() {
		return "Sumar";
	}
}
