package factoriaSingleton;

public final class PrinterFactory {
	private static PrinterFactory factoria;
    private Printer printer = null;

    private PrinterFactory() {
    }
    
    public static PrinterFactory getPrinterFactory(){
    	if(factoria==null){
    		factoria = new PrinterFactory();
    	}
    	return PrinterFactory.factoria;
    }

    public Printer getPrinter() {
        return this.printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }
}
