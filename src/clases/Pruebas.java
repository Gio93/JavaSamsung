package clases;

public class Pruebas {

	public void pruebas() {
		Rectangulo rec1, rec2;
		rec1 = new Rectangulo();
		rec2 = new Rectangulo(-4, 2);
		System.out.println("-----RECTANGULO----");
		if (rec1.getBase() == 0 && rec1.getAltura() == 0) {
			System.out.println("Getters sin parámetros funcionan");
		} else
			System.out.println("ERROR de getters sin parámetros");
		if (rec2.getBase() == -4.1 && rec2.getAltura() == 2.7) {
			System.out.println("Getters con parámetros funcionan");
		} else
			System.out.println("ERROR de getters con parámetros");
		if (rec1.area() == 0.0) {
			System.out.println("area sin parámetros funciona");
		} else
			System.out.println("ERROR. area sin parametros");
		if (rec2.area() == 11.07) {
			System.out.println("area con parámetros funciona");
		} else
			System.out.println("ERROR. area con parametros");
		if (rec1.perimetro() == 0) {
			System.out.println("perimetro sin parámetros funciona.");
		} else
			System.out.println("ERROR. perimetro sin parámetros");
		if (rec2.perimetro() == 13.6) {
			System.out.println("perimetro con parámetros funciona.");
		} else
			System.out.println("ERROR. perimetro con parámetros");
		System.out.println("-----ANGULO-----");
		/*Angulo ang1 = new Angulo(170,7,-3);
		Angulo ang2 = new Angulo (90,-2,8);*/

	}

	public static void main(String[] args) {
		Pruebas pruebas = new Pruebas();
		pruebas.pruebas();

	}

}
