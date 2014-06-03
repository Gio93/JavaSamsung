package abstractas;

public class ManejadorFiguras {
	private Figura[] figuras;
	
	public ManejadorFiguras(Figura[] figuras){
		this.setFiguras(figuras);
	}

	public Figura[] getFiguras() {
		return figuras;
	}

	public void setFiguras(Figura[] figuras) {
		this.figuras = figuras;
	}
	public Figura mayorArea(){
		Figura figura=null;
		for(int i=0;i<this.figuras.length-1;i++){
			if(this.figuras[i].area()>this.figuras[i+1].area()){
				figura = figuras[i];
			}else
				figura = figuras[i+1];
		}
		return figura;
	}
}
