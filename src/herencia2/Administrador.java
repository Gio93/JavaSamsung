package herencia2;

public class Administrador extends Empleado {
	
	public Administrador(String dni, int horas){
		super(dni,horas);
	}
	
	public Administrador(){
		this(null,0);
	}

	@Override
	public double salario() {
		return this.getHoras()*10;
	}
	
}
