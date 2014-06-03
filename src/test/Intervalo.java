package test;

public class Intervalo {
	private int minimo;
	private int maximo;

	public Intervalo(int minimo, int maximo) {
		this.setMinimo(minimo);
		this.setMaximo(maximo);
	}

	public Intervalo() {
		this(0, 0);
	}


	public int getMinimo() {
		return minimo;
	}

	public void setMinimo(int minimo) {
		 this.minimo = minimo;
		
	}

	public int getMaximo() {
		return maximo;
	}

	public void setMaximo(int maximo) {
		if (maximo >= this.minimo) {
			this.maximo = maximo;
		}else{
			this.maximo = this.minimo;
		}
		
	}
	
	public boolean solapado(Intervalo otro) {
		if(this.minimo<=otro.getMaximo() && this.maximo>=otro.getMinimo()){
			return true;
		}else{
			return false;
		}
	}

	public boolean incluido(Intervalo otro) {
		if(this.minimo<=otro.getMinimo() && this.maximo>=getMaximo()){
			System.out.println("Salida minimo1:"+this.minimo);
			System.out.println("Salida maximo1:"+this.maximo);
			System.out.println("Salida minimo2:"+otro.minimo);
			System.out.println("Salida maximo2:"+otro.maximo);
			return true;
		}else{
			return false;
		}
	}
	

}
