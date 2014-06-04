package personaObserver;

public class ObservadorPersona implements Observador {
	private Persona persona;
	
	public ObservadorPersona(Persona persona){
		this.persona = persona;
		this.persona.aniadir(this);
	}

	@Override
	public void actualizar() {
		System.out.println("Ha cambiado el objeto persona");
		
	}
	
	
}
