package visitor;

import upm.jbb.IO;

public class Visitador2 extends Visitador {
	private int contadorA;
	private int contadorB;
    @Override
    public void visitarElementoA(ElementoA e) {
        IO.out.println("Visitador 2 --> elemento: " + e.getAtributoA());
        contadorA++;
    }

    @Override
    public void visitarElementoB(ElementoB e) {
        IO.out.println("Visitador 2 --> elemento: " + e.getAtributoB());
        contadorB++;
    }
    
    public int getAs(){
    	return contadorA;
    }
    
    public int getBs(){
    	return contadorB;
    }

}
