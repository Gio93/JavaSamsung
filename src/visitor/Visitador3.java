package visitor;

import upm.jbb.IO;

public class Visitador3 extends Visitador {
	public int mayorA;
	private int contadorA;
	public int mayorB;
	private int contadorB;
	
	@Override
	public void visitarElementoA(ElementoA e) {
		 IO.out.println("Visitador 3 --> elemento: " + e.getAtributoA());
		 contadorA++;
	
		 if(mayorB<contadorB){
			mayorB=contadorB;
			 this.contadorB=0;
		 }
		 
	}

	@Override
	public void visitarElementoB(ElementoB e) {
		IO.out.println("Visitador 3 --> elemento: " + e.getAtributoB());
		contadorB++;
		
		if(mayorA<contadorA){
			mayorA=contadorA;
			this.contadorA=0;
		}
	}

}
