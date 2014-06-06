package calculadora;

import upm.jbb.IO;

public class ComandoIniciar implements Comando {
	private Calculadora calcu;
	
	public ComandoIniciar(Calculadora calcu){
		this.calcu = calcu;
	}

	@Override
	public void execute() {
		this.calcu.iniciar();
		
	}
	
	@Override
	public String toString() {
		return "Iniciar";
	}
}
