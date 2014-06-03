package printer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FactoriaPrinter {
	private static final FactoriaPrinter instance = new FactoriaPrinter();
	private final Map<String, Printer> mapa = new HashMap<>();

	private FactoriaPrinter() {
		mapa.put("A", new PrinterA());
		mapa.put("B", new PrinterB());
		mapa.put("C", new PrinterC());
	}

	public static FactoriaPrinter getInstance() {
		return instance;
	}

	public Printer getImpresora(String clave) {
		return mapa.get(clave);
	}

	public Collection<Printer> getList() {
		return mapa.values();
	}
}
