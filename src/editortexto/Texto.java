package editortexto;

public class Texto extends Compuesto {

	@Override
	public void add(TextoAbstract v) {
		if(v.isTexto()==true){
			throw new UnsupportedOperationException();
		}else{
			this.getCaracteres().add(v);
		}
		
	}

	@Override
	public String dibujar(boolean tipo) {
		// TODO Auto-generated method stub
		return null;
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
