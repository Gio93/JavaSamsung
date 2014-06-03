package compositeArbol;

import upm.jbb.IO;

public class NodoHoja extends NodoComponente {
	private int valor;
	
    public NodoHoja(int valor) {
    	super();
    	this.setValor(valor);
    }

    public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
    public void view(String cabecera) {
        IO.out.println(cabecera + "-" + this.toString());
    }

    @Override
    public String toString() {
        return "NH:" + this.getNombre().toLowerCase();
    }

    @Override
    public void remove(NodoComponente cc) {
        throw new UnsupportedOperationException("Operación no soportada");
    }

    @Override
    public void add(NodoComponente cc) {
        throw new UnsupportedOperationException("Operación no soportada");
    }

    @Override
    public boolean isCompuesto() {
        return false;
    }

	@Override
	public int numHijos() {
		return 0;
	}

	@Override
	public int getNumero() {
		return valor;
	}

	@Override
	public int suma() {
		return valor;
	}

	@Override
	public int mayor() {
		return valor;
	}

}
