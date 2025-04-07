package composicion.empleado2;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Empleado {
	
	Image imgEmp = new ImageIcon("src/general.icons/EMPLEADOS.png").getImage();
	ImageIcon emp= new ImageIcon(imgEmp.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	//Definicion de los Atributos de la Clase
	private String nombre;
	private String apellido;
	private String correo;
	private String empresa;
	private double salario;
	private String ocupacion;
	private int edad;
	private String sexo;
	private double peso;
	private String origen;
	
	//Definicion del Metodo Constructor
	public Empleado(String nombre,String apellido,String correo,String empresa,
			double salario,String ocupacion,int edad,String sexo,double peso,
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
	
	// Metodos get's
	
	public String getNombre() {
		return this.nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	public String getCorreo() {
		return this.correo;
	}
	public String getEmpresa() {
		return this.empresa;
	}
	public String getSexo() {
		return this.sexo;
	}
	public String getOcupacion() {
		return this.ocupacion;
	}
	public String getOrigen() {
		return this.origen;
	}
	public double getSalario() {
		return this.salario;
	}
	public double getPeso() {
		return this.peso;
	}
	public int getEdad() {
		return this.edad;
	}
	
	// Metodos set's
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void atender() {
		JOptionPane.showMessageDialog(null, "El empleado Atendió", 
				"Empleado", JOptionPane.INFORMATION_MESSAGE, emp);
	}
	public void surtir() {
		JOptionPane.showMessageDialog(null, "El empleado Surtió", 
				"Empleado", JOptionPane.INFORMATION_MESSAGE, emp);
	}
	public void preparar() {
		JOptionPane.showMessageDialog(null, "El empleado Preparó", 
				"Empleado", JOptionPane.INFORMATION_MESSAGE, emp);
	}
	public void administrar() {
		JOptionPane.showMessageDialog(null, "El empleado Administró", 
				"Empleado", JOptionPane.INFORMATION_MESSAGE, emp);
	}
	public void cobrar() {
		JOptionPane.showMessageDialog(null, "El empleado Cobró", 
				"Empleado", JOptionPane.INFORMATION_MESSAGE, emp);
	}
	
	

}
