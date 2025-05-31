package herencia.vehiculo2;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class Ingresa {
	Image imgPreg = new ImageIcon(getClass().getResource(
			"/general.icons/PREGUNTA.png")).getImage();
	ImageIcon preg= new ImageIcon(imgPreg.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Fichero f = new Fichero();
	
	private String nombre,marca,color;
	private int modelo;
	private double precio,velocidad;
	
	private String empresa,ruta;
	
	private String tipo;
	
	private String categoria;
	private int capacidad;
	
	public void ingresaAcuatico() {
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre","Acuatico", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		marca = (String)JOptionPane.showInputDialog(null, "Ingresa Marca","Acuatico", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		modelo = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Modelo","Acuatico", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		precio = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Precio","Acuatico", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		color = (String)JOptionPane.showInputDialog(null, "Ingresa Color","Acuatico", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		velocidad = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Velocidad","Acuatico", JOptionPane.INFORMATION_MESSAGE, preg,null,null));

		empresa = (String)JOptionPane.showInputDialog(null, "Ingresa Empresa","Acuatico", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		ruta = (String)JOptionPane.showInputDialog(null, "Ingresa Ruta","Acuatico", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		
		Acuatico ac = new Acuatico(nombre,marca,color,modelo,precio,velocidad,empresa,ruta);
		
		f.almacenAcuatico(ac);
		
	}
	
	public void ingresaAereo() {
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre","Aereo", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		marca = (String)JOptionPane.showInputDialog(null, "Ingresa Marca","Aereo", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		modelo = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Modelo","Aereo", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		precio = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Precio","Aereo", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		color = (String)JOptionPane.showInputDialog(null, "Ingresa Color","Aereo", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		velocidad = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Velocidad","Aereo", JOptionPane.INFORMATION_MESSAGE, preg,null,null));

		categoria = (String)JOptionPane.showInputDialog(null, "Ingresa Categoria","Aereo", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		capacidad = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Capacidad","Aereo", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		
		Aereo ae = new Aereo(nombre,marca,color,modelo,precio,velocidad,categoria,capacidad);
		
		f.almacenaAereo(ae);
		
	}
	
	public void ingresaTerrestre() {
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre","Aereo", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		marca = (String)JOptionPane.showInputDialog(null, "Ingresa Marca","Aereo", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		modelo = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Modelo","Aereo", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		precio = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Precio","Aereo", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		color = (String)JOptionPane.showInputDialog(null, "Ingresa Color","Aereo", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		velocidad = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Velocidad","Aereo", JOptionPane.INFORMATION_MESSAGE, preg,null,null));

		tipo = (String)JOptionPane.showInputDialog(null, "Ingresa Tipo","Aereo", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		
		Terrestre te = new Terrestre(nombre,marca,color,modelo,precio,velocidad,tipo);
		
		f.almacenaTerrestre(te);
		
	}

}
