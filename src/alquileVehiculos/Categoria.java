package alquileVehiculos;

public enum Categoria {

	A(10),B(15),C(20);
	private int categoria;
	
	private Categoria(int categoria){
		this.setCategoria(categoria);
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	
}
