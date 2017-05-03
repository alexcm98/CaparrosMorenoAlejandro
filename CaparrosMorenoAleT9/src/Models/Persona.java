package Models;

public abstract class Persona implements Comparable{
	
	private String nombre ;
	private float altura ;
	private float peso ;
	private String nacionalidad ;
	
	public Persona(String nombre, float altura, float peso, String nacionalidad) {
		super();
		this.nombre = nombre;
		this.altura = altura;
		this.peso = peso;
		this.nacionalidad = nacionalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
	
	public int compareTo(Persona l) {
		
		int p = (int) ((int) l.getPeso()-getPeso());
		
		return p == 0 ? getNombre().compareTo(l.getNombre()) : p;
	}
	

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", altura=" + altura + ", peso=" + peso + ", nacionalidad=" + nacionalidad
				+ "]";
	}

}
