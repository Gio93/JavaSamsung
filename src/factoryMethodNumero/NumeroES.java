package factoryMethodNumero;

public class NumeroES extends Numero {
    private static final String[] texto = {"cero", "uno", "dos", "tres", "cuatro", "cinco"};

    public String convertir(int numero) {
        if (0 <= numero && numero <= 5) {
            return texto[numero];
        } else {
            return "???";
        }
    }

}
