package StateConPatron;

public class StatePreparado extends State {

	@Override
	public void abrir(Conexion connect) {
		System.out.println("Está PREPARADO, PARA QUE QUIERES ABRIRLO?");
	}

	@Override
	public void cerrar(Conexion connect) {
		System.out.println("De estado PREPARADO pasa a estado CERRADO");
		connect.setState(new StateCerrado());
	}

	@Override
	public void parar(Conexion connect) {
		System.out.println("De estado PREPARADO pasa a estado PARADO");
		connect.setState(new StateParado());

	}

	@Override
	public void iniciar(Conexion connect) {
		System.out.println("Está PREPARADO, PARA QUE QUIERES INICIARLO?");
	}

	@Override
	public void enviar(Emisor emisor, String msg) {
		emisor.enviar(msg);
		System.out.println("Enviado el mensaje: " + msg);

	}

	@Override
	public Estado estado() {
		return Estado.PREPARADO;
	}

}
