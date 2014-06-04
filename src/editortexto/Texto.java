package editortexto;

public class Texto extends Compuesto {

	@Override
	public void add(TextoAbstract v) {
		if(v.isTexto()==true){
			throw new UnsupportedOperationException();
		}else{
			this.getList().add(v);
		}
		
	}

	@Override
	public String dibujar(boolean tipo) {
		String aux = null;
		for(TextoAbstract v: this.getList()){
			aux = v.dibujar(tipo);
		}
		if(tipo==true){
			return aux.toUpperCase();
		}else{
			return aux.toLowerCase();
		}
	}

	@Override
	public boolean isParrafo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isTexto() {
		// TODO Auto-generated method stub
		return true;
	}

}
