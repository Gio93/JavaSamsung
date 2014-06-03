package singleton;

import java.util.Date;

import upm.jbb.IO;



public final class Logger {
	//Creación temprana:
	private static Logger logger= new Logger();//private static Logger logger; (Prueba para fallo)
	private String logs;

	private Logger() {
		this.clear();
	}

	public static Logger getLogger() {
	//Creación perezosa:
	/*if(logger==null){
			logger = new Logger();
		}*/
		return Logger.logger;//new Logger();(Prueba para fallo)
	}

    public void addLog(String log) {
        this.logs = this.logs + ">>> " + log + "\n";
    }

    public void clear() {
        this.logs = new Date().toString() + "\n";
    }

    public void print() {
        IO.out.print(this.logs);
    }
}
