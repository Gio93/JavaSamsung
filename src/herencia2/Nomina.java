package herencia2;

public class Nomina {
	
	public double totalNominas(Empleado[] empleados){
		double nomina=0;
		for(int i=0;i<empleados.length;i++){
			nomina+=empleados[i].salario();
		}
		return nomina;
	}
}
