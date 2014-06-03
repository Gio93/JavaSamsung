package arreglarCodigo;

public abstract class Operacion {
	private int operando1;
	private int operando2;
	
	public Operacion(int operando1,int operando2){
		this.setOperando1(operando1);
		this.setOperando2(operando2);
	}
	
	public Operacion(){
		this(0,0);
	}

	public int getOperando1() {
		return operando1;
	}

	public void setOperando1(int operando1) {
		this.operando1 = operando1;
	}

	public int getOperando2() {
		return operando2;
	}

	public void setOperando2(int operando2) {
		this.operando2 = operando2;
	}
	
	public abstract int operacion();
}