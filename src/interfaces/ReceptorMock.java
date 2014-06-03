package interfaces;

public class ReceptorMock implements Receptor {
	private String noticia;
	
	public ReceptorMock(){}

	public String getNoticia() {
		return noticia;
	}

	public void setNoticia(String noticia) {
		this.noticia = noticia;
	}

	public void noticia(String texto) {
		this.setNoticia(texto);
	}

	

}
