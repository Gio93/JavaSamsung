package herencia;

import upm.jbb.IO;

public class PuntoMain {

	public void  m1(){
		//polimorfismo con array:
		Punto[] puntos = {new PuntoTiempo(5,4,10),new Punto3D(5,4,10,8)};
		for(Punto pepe : puntos){
			System.out.println(pepe.modulo());
		}
	}
		public void m2(){
			Punto p = new Punto3D();
			System.out.println(p.modulo());

			Punto pt = new Punto3D(5, 4, 10, 8);
			System.out.println(pt.modulo());

			PuntoTiempo pt1 = new Punto3D(5, 4, 10, 8);
			System.out.println(pt1.modulo());

			Punto3D pt2 = new Punto3D(5, 4, 10, 8);
			System.out.println(pt2.modulo());

			Punto pt3 = new PuntoTiempo(5, 4, 10);
			System.out.println(pt3.modulo());
		}

	public static void main(String[] args) {
		IO.in.addController(new PuntoMain());
	}
}
