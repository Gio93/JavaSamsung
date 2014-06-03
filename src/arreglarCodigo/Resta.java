package arreglarCodigo;

public class Resta extends Operacion{
	
	public Resta(int operando1, int operando2){
		super(operando1, operando2);
	}

	@Override
	public int operacion() {
		return this.getOperando1()-this.getOperando2();
	}
	
}
