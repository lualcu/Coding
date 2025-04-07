package composicion.hotel;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ingresa {
	
	Imprime i = new Imprime();
	
	Image imgPreg = new ImageIcon(getClass().getResource("/general.icons/PREGUNTA.png")).getImage();
	ImageIcon preg= new ImageIcon(imgPreg.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	public Huesped ingresaHuesped() {
		
		String nombre,apellido,direccion,email,origen;
		int edad;
		long telefono;
		
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre: ", 
				"Nombre - Huesped", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		apellido = (String)JOptionPane.showInputDialog(null, "Ingresa Apellido: ", 
				"Apellido - Huesped", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		direccion =(String)JOptionPane.showInputDialog(null, "Ingresa Direccion: ", 
				"Direccion - Huesped", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		email = (String)JOptionPane.showInputDialog(null, "Ingresa Email: ", 
				"Email - Huesped", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		origen = (String)JOptionPane.showInputDialog(null, "Ingresa Origen: ", 
				"Origen - Huesped", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		
		edad = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Edad: ", 
				"Edad - Huesped", JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		telefono = Long.parseLong((String)JOptionPane.showInputDialog(null, "Ingresa Telefono: ",
				"Telefono - Huesped", JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		
		Huesped hue = new Huesped(nombre,apellido,direccion,email,origen,edad,telefono);
		
		i.datosHuesped(hue);
		
		return hue;
	}
	
	public Habitacion ingresaHabitacion() {
		int numero,capacidad;
		String piso, categoria;
		
		numero = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Numero: ",
				"Numero - Habitacion", JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		capacidad = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Capacidad: ",
				"Capacidad - Habitacion", JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		
		piso = (String) JOptionPane.showInputDialog(null, "Ingresa Piso: ", 
				"Piso - Habitacion", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		categoria = (String) JOptionPane.showInputDialog(null, "Ingresa Categoria: ",
				"Categoria - Habitacion", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		
		Habitacion hab = new Habitacion(numero,capacidad,piso,categoria);
		
		i.datosHabitacion(hab);
		
		return hab;
	}
	
	public void ingresaHotel(Huesped huesped, Habitacion habitacion) {
		String nombre,direccion,telefono,www,rfc,categoria,ciudad;
		
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre: ", 
				"Nombre - Hotel", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		direccion = (String)JOptionPane.showInputDialog(null, "Ingresa Direccion: ",
				"Direccion - Hotel", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		telefono = (String)JOptionPane.showInputDialog(null, "Ingresa Telefono: ", 
				"Telefono - Hotel", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		www = (String)JOptionPane.showInputDialog(null, "Ingresa Web: ", 
				"Web - Hotel", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		rfc = (String)JOptionPane.showInputDialog(null, "Ingresa RFC: ",
				"RFC - Hotel", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		categoria = (String)JOptionPane.showInputDialog(null, "Ingresa Categoria: ", 
				"Categoria - Hotel", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		ciudad = (String)JOptionPane.showInputDialog(null, "Ingresa Ciudad: ",
				"Ciudad - Hotel", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		
		Hotel hotel = new Hotel(huesped,habitacion,nombre,direccion,telefono,www,
				rfc,categoria,ciudad);
		
		i.datosHotel(hotel);

	}

}
