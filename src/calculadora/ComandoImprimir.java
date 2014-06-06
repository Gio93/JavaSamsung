package calculadora;

import upm.jbb.IO;

public class ComandoImprimir implements Comando {
	private Calculadora calcu;
	
	public ComandoImprimir(Calculadora calcu){
		this.calcu = calcu;
	}

	@Override
	public void execute() {
		IO.out.println(this.calcu.getTotal());
		
	}
	
	@Override
	public String toString() {
		return "Imprimir";
	}
}
