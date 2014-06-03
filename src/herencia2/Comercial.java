package herencia2;

public class Comercial extends Empleado{
	private double comision;
	
	public Comercial(String dni, int horas, double comision){
		super(dni,horas);
		this.setComision(comision);
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public double salario() {
		return this.comision+this.getHoras()*8;
	}
}
