package arreglarCodigo;

public class Suma extends Operacion {

	public Suma(int operando1, int operando2){
		super(operando1,operando2);
	}
	
	public Suma(){
		this(0,0);
	}

	@Override
	public int operacion() {
		return this.getOperando1()+this.getOperando2();
	}
	
}
