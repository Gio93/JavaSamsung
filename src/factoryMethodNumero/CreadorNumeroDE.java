package factoryMethodNumero;

public class CreadorNumeroDE extends CreadorNumero{

	@Override
	public Numero createNumero() {
		return new NumeroDE();
	}

}
