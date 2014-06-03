package compositeArbol;

import java.util.ArrayList;
import java.util.List;

import upm.jbb.IO;

public class ArbolMain {

    private List<NodoComponente> compuestos = new ArrayList<NodoComponente>();

    private NodoComponente raiz;

    public ArbolMain() {
        this.raiz = new NodoCompuesto("Raiz");
        this.compuestos.add(raiz);
    }

    public void addCompuesto() {
        NodoComponente com = (NodoComponente) IO.in.select(compuestos.toArray());
        if (com == null) {
            return;
        }
        NodoComponente nuevo = new NodoCompuesto(IO.in.readString("Nombre"));
        com.add(nuevo);
        this.compuestos.add(nuevo);
    }

    public void addHoja() {
        NodoComponente com = (NodoComponente) IO.in.select(compuestos.toArray());
        if (com == null) {
            return;
        }
        com.add(new NodoHoja(IO.in.readInt("Valor")));
    }

    public void suma() {
        IO.out.println("Suma: " + this.raiz.suma());
    }

    public void mayor() {
        IO.out.println("Mayor: " + this.raiz.mayor());
    }

    public static void main(String[] args) {
        IO.in.addController(new ArbolMain());
    }

}
