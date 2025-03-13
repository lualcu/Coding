package composicion.empleados;

public class Empleado {
	
	//Definicion de los Atributos de la Clase
	String nombre;
	String apellido;
	String correo;
	String empresa;
	double salario;
	String ocupacion;
	int edad;
	String sexo;
	double peso;
	String origen;
	
	//Definicion del Metodo Constructor
	public Empleado(String nombre,
					String apellido,
					String correo,
					String empresa,
					double salario,
					String ocupacion,
					int edad,
					String sexo,
					double peso,
					String origen) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.empresa = empresa;
		this.correo = correo;
		this.salario = salario;
		this.ocupacion = ocupacion;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.origen = origen;
		
	}

}
