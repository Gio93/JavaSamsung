package printer;

import upm.jbb.IO;

public class PrinterC implements Printer {
    @Override
    public void print(String msg) {
        IO.out.println("PrinterC >>> " + msg);
    }

}
