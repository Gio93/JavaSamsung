package calculadora;

import upm.jbb.IO;

public class ComandoRestar implements Comando {
	private Calculadora calcu;
	
	public ComandoRestar(Calculadora calcu){
		this.calcu = calcu;
	}

	@Override
	public void execute() {
		this.calcu.restar(IO.in.readInt());
		
	}
	
	@Override
	public String toString() {
		return "Restar";
	}
}
