package clases;

public class Fraccion {
	private float numerador;
	private float denominador;

	public Fraccion(float numerador, float denominador) {
		this.setNumerador(numerador);
		this.setDenominador(denominador);
	}

	public void setNumerador(float numerador) {
		this.numerador = numerador;
	}

	public float getDenominador() {
		return denominador;
	}

	public void setDenominador(float denominador) {
		this.denominador = denominador;
	}

	public float getNumerador() {
		return numerador;
	}

	public float resultadoDecimal() {
		float resultado;
		resultado = this.numerador / this.denominador;
		return resultado;
	}

	public void dividir(Fraccion fraccion) {
		this.setNumerador(this.numerador * fraccion.getDenominador());
		this.setDenominador(this.denominador * fraccion.getNumerador());
	}
	
	public void multiplicar(Fraccion fraccion) {
		this.setNumerador(this.numerador * fraccion.getNumerador());
		this.setDenominador(this.denominador * fraccion.getDenominador());
	}

	public void sumar(Fraccion fraccion){
		this.setNumerador((this.numerador*fraccion.denominador)+(this.denominador*fraccion.numerador));
		this.setDenominador(this.denominador*fraccion.denominador);
	}
}
