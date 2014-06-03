package expresiones;

public abstract class Operacion extends Expresion {
	private Expresion exp1;
	private Expresion exp2;
	
	public Operacion(Expresion exp1, Expresion exp2){
		this.exp1 = exp1;
		this.exp2 = exp2;
	}
	
	public Expresion getExp2() {
		return exp2;
	}

	public Expresion getExp1() {
		return exp1;
	}
}
