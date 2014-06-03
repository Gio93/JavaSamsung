package editortexto;

import java.util.ArrayList;
import java.util.List;

public abstract class Compuesto extends TextoAbstract {
	private List<TextoAbstract> componentes = new ArrayList<TextoAbstract>();

	public List<TextoAbstract> getList() {
		return componentes;
	}
}
