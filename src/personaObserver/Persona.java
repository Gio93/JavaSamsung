package personaObserver;

public class Persona extends Observable{
	private String nombre;
	private int edad;
	private String movil;
	
	public Persona(String nombre, int edad, String movil){
		this.nombre = nombre;
		this.edad = edad;
		this.movil = movil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
		this.notificar();
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
		this.notificar();
	}

	public String getMovil() {
		return movil;
	}

	public void setMovil(String movil) {
		this.movil = movil;
		this.notificar();
	}
}
