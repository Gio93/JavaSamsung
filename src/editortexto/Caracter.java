package editortexto;

public class Caracter extends TextoAbstract {
	private char actual;
	
	public Caracter(char valor){
		this.actual = valor;
	}
	@Override
	public void add(TextoAbstract v) {
		// TODO Auto-generated method stub	
	}

	@Override
	public String dibujar(boolean tipo) {
		if(tipo==true){
			return Character.toString(actual).toUpperCase();
		}else{
			return Character.toString(actual).toLowerCase();
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
		return false;
	}
	
	

}
