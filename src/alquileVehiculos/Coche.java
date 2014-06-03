package alquileVehiculos;

public class Coche extends Vehiculo {
	private Categoria categoria;

	public Coche(String idvehiculo, String descripcion, Categoria categoria) {
		super(idvehiculo, descripcion);
		this.setCategoria(categoria);
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public double getPrecio(int diasAlquiler) {
		double precio = 0;
		if (diasAlquiler < 4) {
			precio = this.categoria.getCategoria() * diasAlquiler;
		} else if (diasAlquiler > 3 && diasAlquiler < 8) {
			precio = ((this.categoria.getCategoria() * diasAlquiler) * 80) / 100;
		} else if (diasAlquiler > 7) {
			precio = ((this.categoria.getCategoria() * diasAlquiler) * 50) / 100;
		} else {
			assert false: "Aqui nunca deberia de haber llegado";
		}
		return precio;
	}

}
