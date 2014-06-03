package printer;

import upm.jbb.IO;

public class ClientePrinter {
	
	FactoriaPrinter factoria = FactoriaPrinter.getInstance();
	
	public void verImpresoras(){
		IO.in.select(factoria.getList().toArray());
	}
	
	
	public static void main(String[] args) {
        IO.in.addController(new ClientePrinter());
    }
}
