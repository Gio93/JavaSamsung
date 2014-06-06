package calculadora;

public class CalculadoraMementable extends Calculadora implements Mementable<MementoCalculadora>{
	
	public CalculadoraMementable(){
		super();
	}

	@Override
	public MementoCalculadora guardar() {
		return new MementoCalculadora(this.getTotal());
	}

	@Override
	public void deshacer(MementoCalculadora memento) {
		this.setTotal(memento.getValor());
		
	}

}
