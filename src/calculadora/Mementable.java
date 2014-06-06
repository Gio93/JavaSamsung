package calculadora;

public interface Mementable<T> {
	T guardar();

	void deshacer(T memento);
}
