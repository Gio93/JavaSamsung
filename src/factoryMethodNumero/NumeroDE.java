package factoryMethodNumero;

public class NumeroDE extends Numero {
    private static final String[] texto = {"null", "eins", "zwei", "drei", "vier", "fünf"};

    public String convertir(int numero) {
        if (0 <= numero && numero <= 5) {
            return texto[numero];
        } else {
            return "???";
        }
    }

}