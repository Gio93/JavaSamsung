package expresiones;

public class Multiplicar extends Operacion{

	public Multiplicar(Expresion exp1, Expresion exp2){
		super(exp1, exp2);
	}
	@Override
	public int operar() {
		return (this.getExp1().operar()*this.getExp2().operar());
	}

	@Override
	public String ver() {
		return (this.getExp1().ver()+"*"+this.getExp2().ver());
	}
	

}
