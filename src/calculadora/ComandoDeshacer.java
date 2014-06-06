package calculadora;

import upm.jbb.IO;

public class ComandoDeshacer implements Comando {
	private CalculadoraMementable calcu;
	private GestorMementos<MementoCalculadora> gestor;
	
	public ComandoDeshacer(CalculadoraMementable calcu, GestorMementos<MementoCalculadora> gestor){
		this.calcu = calcu;
		this.gestor = gestor;
	}

	@Override
	public void execute() {
		calcu.deshacer(gestor.getMemento((String) IO.in.select(gestor.keys())));
	}

	@Override
	public String toString() {
		return "Deshacer";
	}
	

}
