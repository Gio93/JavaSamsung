package clases;

public class Angulo {
	private double amplitud;
	private Punto punto;

	public Angulo(double amplitud, float x, float y) {
		this.setAmplitud(amplitud);
		//this.setPunto(new Punto(x, y));
	}

	public Angulo(){
		this(0,0,0);
	}
	public Punto getPunto() {
		return punto;
	}

	public void setPunto(Punto punto) {
		this.punto = punto;
	}

	public double getAmplitud() {
		return amplitud;
	}

	public void setAmplitud(double amplitud) {
		this.amplitud = amplitud;
	}

}
