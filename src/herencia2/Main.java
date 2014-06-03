package herencia2;

public class Main {

	public static void main(String[] args) {
		Empleado[] empleados = { new Administrador("52904001E", 200),
				new Comercial("52904002E", 100, 2) };
		System.out.println(new Nomina().totalNominas(empleados));

	}

}
