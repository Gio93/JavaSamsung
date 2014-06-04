package vehiculo;

public class MP3 extends Extras{
	
	public MP3(int precio, String descripcion, VehiculoAbstract v){
		super(precio,descripcion, v);
	}

	@Override
	public int PrecioFinal() {
		return this.getPrecio()+this.getV().PrecioFinal();
	}

	@Override
	public String DescripcionFinal() {
		return this.getV().DescripcionFinal()+this.getDescripcion();
	}
	
	

}
