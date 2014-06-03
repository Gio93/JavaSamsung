package arreglarCodigo;

public class Operaciones {

	public int total(Operacion[] operaciones){
		int result=0;
		for(Operacion op: operaciones){
			result += op.operacion();
		}
		return result;
	}
}
