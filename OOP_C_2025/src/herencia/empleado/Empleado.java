package herencia.empleado;

import java.io.Serializable;

public class Empleado implements Serializable {
	
	private int id;
	private String nombre,apaterno,amaterno;
	private int edad;
	private String sexo,direccion;
	private double salario;
	
	public Empleado(int id, String nombre, String apaterno, String amaterno, int edad, String sexo, String direccion,
			double salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apaterno = apaterno;
		this.amaterno = amaterno;
		this.edad = edad;
		this.sexo = sexo;
		this.direccion = direccion;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApaterno() {
		return apaterno;
	}

	public String getAmaterno() {
		return amaterno;
	}

	public int getEdad() {
		return edad;
	}

	public String getSexo() {
		return sexo;
	}

	public String getDireccion() {
		return direccion;
	}

	public double getSalario() {
		return salario;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApaterno(String apaterno) {
		this.apaterno = apaterno;
	}

	public void setAmaterno(String amaterno) {
		this.amaterno = amaterno;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	

}
