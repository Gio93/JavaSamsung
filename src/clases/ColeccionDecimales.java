package clases;

public class ColeccionDecimales {
	private Double[] decimales;
	private static final int MAXIMO = 100;

	public ColeccionDecimales() {
		this.decimales = new Double[MAXIMO];
	}

	public Double[] getDecimales() {
		return decimales;
	}

	public void setDecimales(Double[] decimales) {
		this.decimales = decimales;
	}

	public int getMAXIMO() {
		return MAXIMO;
	}

	public void addDecimal(Double decimal) {
		int i = 0;
		while (i < this.decimales.length) {
			if (this.decimales[i] == null) {
				this.decimales[i] = decimal;
			}
			i++;
		}
	}

	public void delDecimal(Double decimal) {
		for (int i = 0; i < this.decimales.length; i++) {
			if (this.decimales[i] == decimal) {
				this.decimales[i] = 0.0;
			}
		}
	}

	public void vaciarArray(){
		for(int i=0;i<decimales.length;i++){
			decimales[i] = null;
		}
	}
}
