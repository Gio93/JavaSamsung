package test;

public class Angulo {
	private int grado;
	
	public Angulo(int grado){
		this.setGrado(grado);
	}
	public Angulo(){
		this(0);
	}

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = convertir(grado);
	} 
	
	public int suma(int sumando){
		int suma;
		suma = this.grado + sumando;
		return convertir(suma);
	}
	
	private int convertir(int grado){
		return ((grado%360)+360)%360;
	}
}
