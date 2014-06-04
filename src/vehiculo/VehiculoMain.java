package vehiculo;

public class VehiculoMain {

	public static void main(String[] args) {
		VehiculoAbstract opel = new Vehiculo(16000, "Opel, marca alemana","Corsa");
		Extras gps = new GPS(1500,"GPS de mapas europeos",opel);
		Extras mp3 = new MP3(200,"MP3 incorporado",gps);
		System.out.println(mp3.PrecioFinal());
		System.out.println(mp3.DescripcionFinal());
	}

}
