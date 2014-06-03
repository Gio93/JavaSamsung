package editortexto;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
	private static FactoriaCaracter factoria;
	private final Map<Character, Caracter> mapa = new HashMap<>();
	
    private FactoriaCaracter() {
    	
    }
    
    public static FactoriaCaracter getFactoria(){
    	if(factoria==null){
    		factoria = new FactoriaCaracter();
    	}
    	return FactoriaCaracter.factoria;
    }
    
    public Caracter get(char clave) {
    	if(mapa.containsKey(clave)){
    		return mapa.get(clave);
    	}else{
    		mapa.put(clave, new Caracter(clave));
    		return mapa.get(clave);
    	}
    }
}
