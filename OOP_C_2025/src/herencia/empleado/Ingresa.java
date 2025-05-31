package herencia.empleado;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class Ingresa {
	
	Image imgPreg = new ImageIcon(getClass().getResource(
			"/general.icons/PREGUNTA.png")).getImage();
	ImageIcon preg= new ImageIcon(imgPreg.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Fichero f = new Fichero();
	
	private int id;
	private String nombre,apaterno,amaterno;
	private int edad;
	private String sexo,direccion;
	private double salario;
	
	private String area;
	
	private String correo;
	private int telefono;
	
	private double bono;
	
	
	public void ingresaMantenimiento() {
		id = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa ID","Mantenimiento", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre","Mantenimiento", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		apaterno = (String)JOptionPane.showInputDialog(null, "Ingresa Apellido Paterno","Mantenimiento", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		amaterno = (String)JOptionPane.showInputDialog(null, "Ingresa Apellido Materno","Mantenimiento", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		edad = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Edad","Mantenimiento", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		sexo = (String)JOptionPane.showInputDialog(null, "Ingresa Sexo","Mantenimiento", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		direccion = (String)JOptionPane.showInputDialog(null, "Ingresa Direccion","Mantenimiento", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		salario = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Salario","Mantenimiento", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		
		
		area = (String)JOptionPane.showInputDialog(null, "Ingresa Area","Mantenimiento", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		
		
		f.almacenMantenimiento(new Mantenimiento(id,nombre,apaterno,amaterno,edad,sexo,direccion,salario,area));
		
	}
	
	public void ingresaInformatico() {
		id = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa ID","Informatico", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre","Informatico", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		apaterno = (String)JOptionPane.showInputDialog(null, "Ingresa Apellido Paterno","Informatico", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		amaterno = (String)JOptionPane.showInputDialog(null, "Ingresa Apellido Materno","Informatico", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		edad = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Edad","Informatico", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		sexo = (String)JOptionPane.showInputDialog(null, "Ingresa Sexo","Informatico", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		direccion = (String)JOptionPane.showInputDialog(null, "Ingresa Direccion","Informatico", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		salario = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Salario","Informatico", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		
		correo = (String)JOptionPane.showInputDialog(null, "Ingresa Correo","Informatico", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		telefono = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Telefono","Informatico", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		
		
		f.almacenaInformatico(new Informatico(id,nombre,apaterno,amaterno,edad,sexo,direccion,salario,correo,telefono));
		
	}
	
	public void ingresaDirector() {
		id = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa ID","Director", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre","Director", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		apaterno = (String)JOptionPane.showInputDialog(null, "Ingresa Apellido Paterno","Director", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		amaterno = (String)JOptionPane.showInputDialog(null, "Ingresa Apellido Materno","Director", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		edad = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Edad","Director", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		sexo = (String)JOptionPane.showInputDialog(null, "Ingresa Sexo","Director", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		direccion = (String)JOptionPane.showInputDialog(null, "Ingresa Direccion","Director", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		salario = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Salario","Director", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		
		
		bono = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Bono","Director", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
				
		
		f.almacenaDirector(new Director(id,nombre,apaterno,amaterno,edad,sexo,direccion,salario,bono));
		
	}

}
