package personaObserver;

import upm.jbb.IO;
import Observer.ObservadorA;
import Observer.ObservadorB;


public final class MainObserver {
    private MainObserver() {
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Juan",20,"615946562");
        new ObservadorPersona(persona);

        IO.out.println("Leo sujeto... " + persona.getNombre());
        IO.out.println("Cambio sujeto...");
        persona.setNombre("Pepe");
        IO.out.println( persona.getNombre());
    }
}
