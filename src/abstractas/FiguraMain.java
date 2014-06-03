package abstractas;

public class FiguraMain {

	public static void main(String[] args) {
		Figura[] figuras = {new Triangulo("Soy un Triangulo",2,5),new Cuadrado("Soy un cuadrado",6),new Triangulo("Soy un triangulo",100,4)};
		ManejadorFiguras manejador = new ManejadorFiguras(figuras);
		System.out.println(manejador.mayorArea()+"con area: "+manejador.mayorArea().area());
	}

}
