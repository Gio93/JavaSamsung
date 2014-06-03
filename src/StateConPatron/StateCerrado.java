package StateConPatron;

public class StateCerrado extends State{

	@Override
	public void abrir(Conexion connect) {
		System.out.println("De estado CERRADO pasa a estado PREPARADO");
		connect.setState(new StatePreparado());
	}

	@Override
	public void cerrar(Conexion connect) {
		System.out.println("Ya está cerrado");
	}

	@Override
	public Estado estado() {
		return Estado.CERRADO;
	}

	

	
	
}
