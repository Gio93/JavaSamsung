package StateConPatron;

public class StateParado extends State {

	@Override
	public void parar(Conexion connect) {
		System.out.println("Ya esta PARADO");
	}

	@Override
	public void iniciar(Conexion connect) {
		System.out.println("De estado PARADO pasa a estado PREPARADO");
		connect.setState(new StatePreparado());

	}

	@Override
	public Estado estado() {
		return Estado.PARADO;
	}

}
