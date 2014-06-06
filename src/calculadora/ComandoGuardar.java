package calculadora;

import upm.jbb.IO;

public class ComandoGuardar implements Comando{
	private CalculadoraMementable calcu;
	private GestorMementos<MementoCalculadora> gestor;
	
	public ComandoGuardar(CalculadoraMementable calcu, GestorMementos<MementoCalculadora> gestor){
		this.calcu = calcu;
		this.gestor = gestor;
	}

	@Override
	public void execute() {
		gestor.addMemento(IO.in.readString("Nombre"), calcu.guardar());
	}
	
	@Override
	public String toString() {
		return "Guardar";
	}

}
