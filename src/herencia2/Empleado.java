package herencia2;

public abstract class Empleado {
	private String dni;
	private int horas;
	
	public Empleado(String dni, int horas){
		this.setDni(dni);
		this.setHoras(horas);
	}
	
	public Empleado(){
		this(null,0);
	}

	public String getDni() {
		return dni;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public abstract double salario();

}
