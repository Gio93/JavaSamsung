package herencia;

public class Punto {
	private int x;
	private int y;

	public Punto(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public Punto() {
		this(0, 0);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double modulo() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}

	public double fase() {
		return Math.atan((double) this.y / this.x);
	}

	public String toString() {
		return "Punto[" + this.x + "," + y + "]";
	}

}
