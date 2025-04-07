package composicion.empleados;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Empleado {
	
	Image imgEmp = new ImageIcon("src/general.icons/EMPLEADOS.png").getImage();
	ImageIcon emp= new ImageIcon(imgEmp.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
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
