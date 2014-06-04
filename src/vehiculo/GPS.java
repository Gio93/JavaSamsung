package vehiculo;

public class GPS extends Extras{
	
	public GPS(int precio,String Descripcion, VehiculoAbstract v){
		super(precio,Descripcion,v);
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
