package composicion.jugadores;

public class Jugador {
	String nombre;
	String apellido;
	String correo;
	String equipo;
	double salario;
	String posicion;
	int edad;
	String nacionalidad;
	int numeral;
	
	public Jugador(String nombre,
				   String apellido,
				   String correo,
				   String equipo,
				   double salario,
				   String posicion,
				   int edad,
				   String nacionalidad,
				   int numeral) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.equipo = equipo;
		this.salario = salario;
		this.posicion = posicion;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.numeral = numeral;
		
	}

}
