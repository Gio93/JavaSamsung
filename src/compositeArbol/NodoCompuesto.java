package compositeArbol;

import upm.jbb.IO;

public class NodoCompuesto extends NodoComponente {
	java.util.List<NodoComponente> list;
    public NodoCompuesto(String nombre) {
        super(nombre);
        this.list = new java.util.ArrayList<NodoComponente>();
    }
    @Override
    public int suma(){
    	int suma = 0;
    	for(NodoComponente item : list){
    		suma+= item.suma();
    	}
    	return suma;
    }

    @Override
    public void view(String cabecera) {
        IO.out.println(cabecera + "-" + this.toString());
    }

    @Override
    public String toString() {
        return "NC:" + this.getNombre().toLowerCase();
    }

    @Override
    public void remove(NodoComponente cc) {
       list.remove(cc);
    }

    @Override
    public void add(NodoComponente cc) {
    	if(cc!=null){
    		list.add(cc);
    	}
        
    }

    @Override
    public boolean isCompuesto() {
        return false;
    }

	@Override
	public int numHijos() {
		return this.list.size();
	}

	@Override
	public int getNumero() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int mayor() {
		int valor=0;
		for(int i=0;i<this.list.size();i++){
			if(this.list.get(i).getNumero()>valor){
				valor = list.get(i).mayor();
			}
		}
		return valor;
	}

}
