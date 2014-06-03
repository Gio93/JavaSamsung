package asserts;

public class CajaGenerica<T> {

	private T atr1;

	public CajaGenerica() {
	}

	public void almacenar(T Objeto) throws RuntimeException {
		assert Objeto != null : "El objeto que deseas almacenar es null";
		if (atr1 != null)
			throw new RuntimeException("El atributo de la clase ya esta lleno");
		this.atr1 = Objeto;
	}

	public T getAtr1() {
		return atr1;
	}

	public T extraer() throws RuntimeException {
		if (this.atr1 == null)
			throw new RuntimeException(
					"El atributo de la clase que quieres extraer esta vacio");
		return atr1;
	}
}
