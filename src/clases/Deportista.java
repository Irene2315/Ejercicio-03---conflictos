package clases;

public abstract class Deportista {
	private String nombre; 

	public Deportista(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Deportista() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
