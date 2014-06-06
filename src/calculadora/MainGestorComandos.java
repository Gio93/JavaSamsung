package calculadora;

import java.util.HashSet;
import java.util.Set;

import upm.jbb.IO;
import upm.jbb.io.Log;

public class MainGestorComandos {
    private Set<Comando> comandos = new HashSet<Comando>();

    public void add(Comando comando) {
        this.comandos.add(comando);
    }

    public void ejecutar() {
        Comando comando = (Comando) IO.in.select(this.comandos.toArray());
        comando.execute();
    }

    public static void main(String[] args) {
        CalculadoraMementable calc = new CalculadoraMementable();
        MainGestorComandos gestor = new MainGestorComandos();
        GestorMementos<MementoCalculadora> gestormementos = new GestorMementos<MementoCalculadora>();
        
        gestor.add(new ComandoSumar(calc));
        gestor.add(new ComandoRestar(calc));
        gestor.add(new ComandoIniciar(calc));
        gestor.add(new ComandoImprimir(calc));
        
        gestor.add(new ComandoGuardar(calc,gestormementos));
        gestor.add(new ComandoDeshacer(calc,gestormementos));
        IO.in.addController(gestor);
        IO.out.setLog(Log.DEBUG);
    }
}
