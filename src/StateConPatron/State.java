package StateConPatron;

public abstract class State {
	public void abrir(Conexion connect){
		throw new UnsupportedOperationException("Acción no permitida... ");
	};
	public void cerrar(Conexion connect){
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	public void parar(Conexion connect){
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	public void iniciar(Conexion connect){
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	public void enviar(Emisor emisor,String msg){
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	
	public abstract Estado estado();
}
