package proxy;

public final class MainProxy {
    private MainProxy() {
    }

    public static void main(String[] args) {
        // El cliente no tiene porque saber que trabaja con el proxy
        Sujeto sujeto = new Proxy();
        sujeto.peticion2();
        sujeto.peticion();
        sujeto.peticion2();
    }
}
