package compositeArbol;

public abstract class NodoComponente {
    private String nombre;

    protected NodoComponente(String nombre) {
        this.nombre = nombre;
    }
    protected NodoComponente(){
    	this("");
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public abstract int numHijos();
    public abstract int getNumero();
    public abstract int suma();
    public abstract int mayor();

    public abstract void remove(NodoComponente cc);

    public abstract void add(NodoComponente cc);

    public abstract boolean isCompuesto();

    public abstract void view(String cabecera);

}
