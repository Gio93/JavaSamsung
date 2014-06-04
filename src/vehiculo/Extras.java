package vehiculo;

public abstract class Extras extends VehiculoAbstract {
	private VehiculoAbstract v;
	
	public Extras(int precio, String Descripcion,VehiculoAbstract v){
		super(precio,Descripcion);
		this.v = v;
	}

	public VehiculoAbstract getV() {
		return v;
	}

}
