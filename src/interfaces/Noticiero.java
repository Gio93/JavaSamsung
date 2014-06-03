package interfaces;

import java.util.ArrayList;

public class Noticiero {
	private ArrayList<Receptor> receptor;
	
	public Noticiero(ArrayList<Receptor> receptor){
		this.setReceptor(receptor);
	}

	public ArrayList<Receptor> getReceptor() {
		return receptor;
	}

	public void setReceptor(ArrayList<Receptor> receptor) {
		this.receptor = receptor;
	}
	public void registrar(Receptor r){
		receptor.add(r);
	}
	public void informar(String texto){
		for(Receptor r:this.receptor){
			r.noticia(texto);
		}
	}
	
}
