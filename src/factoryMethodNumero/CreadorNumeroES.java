package factoryMethodNumero;

public class CreadorNumeroES extends CreadorNumero {

	@Override
	public Numero createNumero() {
		return new NumeroES();
	}

}
