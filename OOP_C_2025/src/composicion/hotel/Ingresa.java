package composicion.hotel;

import javax.swing.JOptionPane;

public class Ingresa {
	
	Imprime i = new Imprime();
	
	public Huesped ingresaHuesped() {
		
		String nombre,apellido,direccion,email,origen;
		int edad;
		long telefono;
		
		nombre = JOptionPane.showInputDialog(null, "Ingresa Nombre: ", "Nombre - Huesped", JOptionPane.INFORMATION_MESSAGE);
		apellido = JOptionPane.showInputDialog(null, "Ingresa Apellido: ", "Apellido - Huesped", JOptionPane.INFORMATION_MESSAGE);
		direccion = JOptionPane.showInputDialog(null, "Ingresa Direccion: ", "Direccion - Huesped", JOptionPane.INFORMATION_MESSAGE);
		email = JOptionPane.showInputDialog(null, "Ingresa Email: ", "Email - Huesped", JOptionPane.INFORMATION_MESSAGE);
		origen = JOptionPane.showInputDialog(null, "Ingresa Origen: ", "Origen - Huesped", JOptionPane.INFORMATION_MESSAGE);
		
		edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Edad: ", "Edad - Huesped", JOptionPane.INFORMATION_MESSAGE));
		telefono = Long.parseLong(JOptionPane.showInputDialog(null, "Ingresa Telefono: ", "Telefono - Huesped", JOptionPane.INFORMATION_MESSAGE));
		
		Huesped hue = new Huesped(nombre,apellido,direccion,email,origen,edad,telefono);
		
		i.datosHuesped(hue);
		
		return hue;
	}
	
	public Habitacion ingresaHabitacion() {
		int numero,capacidad;
		String piso, categoria;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Numero: ", "Numero - Habitacion", JOptionPane.INFORMATION_MESSAGE));
		capacidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Capacidad: ", "Capacidad - Habitacion", JOptionPane.INFORMATION_MESSAGE));
		
		piso = JOptionPane.showInputDialog(null, "Ingresa Piso: ", "Piso - Habitacion", JOptionPane.INFORMATION_MESSAGE);
		categoria = JOptionPane.showInputDialog(null, "Ingresa Categoria: ", "Categoria - Habitacion", JOptionPane.INFORMATION_MESSAGE);
		
		Habitacion hab = new Habitacion(numero,capacidad,piso,categoria);
		
		i.datosHabitacion(hab);
		
		return hab;
	}
	
	public void ingresaHotel(Huesped huesped, Habitacion habitacion) {
		String nombre,direccion,telefono,www,rfc,categoria,ciudad;
		
		nombre = JOptionPane.showInputDialog(null, "Ingresa Nombre: ", "Nombre - Hotel", JOptionPane.INFORMATION_MESSAGE);
		direccion = JOptionPane.showInputDialog(null, "Ingresa Direccion: ", "Direccion - Hotel", JOptionPane.INFORMATION_MESSAGE);
		telefono = JOptionPane.showInputDialog(null, "Ingresa Telefono: ", "Telefono - Hotel", JOptionPane.INFORMATION_MESSAGE);
		www = JOptionPane.showInputDialog(null, "Ingresa Web: ", "Web - Hotel", JOptionPane.INFORMATION_MESSAGE);
		rfc = JOptionPane.showInputDialog(null, "Ingresa RFC: ", "RFC - Hotel", JOptionPane.INFORMATION_MESSAGE);
		categoria = JOptionPane.showInputDialog(null, "Ingresa Categoria: ", "Categoria - Hotel", JOptionPane.INFORMATION_MESSAGE);
		ciudad = JOptionPane.showInputDialog(null, "Ingresa Ciudad: ", "Ciudad - Hotel", JOptionPane.INFORMATION_MESSAGE);
		
		Hotel hotel = new Hotel(huesped,habitacion,nombre,direccion,telefono,www,rfc,categoria,ciudad);
		
		i.datosHotel(hotel);

	}

}
