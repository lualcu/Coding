package composicion.hotel;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Imprime {
	
	JTextArea salida = new JTextArea();
	String datosHab = "Num. Cuarto\tCapacidad\tPiso\tCategoria\n";
	String datosHue = "Nombre\tApellido\tDireccion\tEmail\tOrigen\tEdad\tTelefono\n";
	String datosHot = "Nombre\tDireccion\tTelefono\tWWW\tRFC\tCategoría\tCiudad\n";
	
	
	public void datosHabitacion(Habitacion habitacion) {
		
		String datosHabitacion = datosHab;
		
		datosHabitacion += "-----------------------------------------------------------\n";
		
		datosHabitacion += habitacion.getNumero() + "\t" + habitacion.getCapacidad() 
		+ "\t" + habitacion.getPiso() + "\t" + habitacion.getCategoria() + "\n";
		
		salida.setText(datosHabitacion);
		
		JOptionPane.showMessageDialog(null, salida, "Reporte - Habitacion", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	public void datosHuesped(Huesped huesped) {
		
		String datosHuesped = datosHue;
		
		datosHuesped += "-------------------------------------------------------------"
				+ "-----------------------------------------------------------------\n";
		
		datosHuesped += huesped.getNombre() + "\t" + huesped.getApellido() + "\t" + huesped.getDireccion()
		 + "\t" + huesped.getEmail() + "\t" + huesped.getOrigen() + "\t" + huesped.getEdad() + "\t" + huesped.getTelefono() + "\n";
		
		salida.setText(datosHuesped);
		
		JOptionPane.showMessageDialog(null, salida, "Reporte - Huesped", JOptionPane.INFORMATION_MESSAGE);

	}
	
	public void datosHotel(Hotel hotel) {
		
		String datosHotel = datosHue;
		
		datosHotel += "-------------------------------------------------------------"
				+ "-----------------------------------------------------------------\n";
		
		datosHotel += hotel.getHuesped().getNombre() + "\t"
					+ hotel.getHuesped().getApellido() + "\t"
					+ hotel.getHuesped().getDireccion() + "\t"
					+ hotel.getHuesped().getEmail() + "\t"
					+ hotel.getHuesped().getOrigen() + "\t"
					+ hotel.getHuesped().getEdad() + "\t"
					+ hotel.getHuesped().getTelefono() + "\n";
		
		datosHotel += "-------------------------------------------------------------"
				+ "-----------------------------------------------------------------\n";
		
		datosHotel += datosHab;
		
		datosHotel += "-------------------------------------------------------------"
				+ "-----------------------------------------------------------------\n";
		
		datosHotel += hotel.getHabitacion().getNumero() + "\t"
					+ hotel.getHabitacion().getCapacidad() + "\t"
					+ hotel.getHabitacion().getPiso() + "\t"
					+ hotel.getHabitacion().getCategoria() + "\n";
				
		datosHotel += "-------------------------------------------------------------"
				+ "-----------------------------------------------------------------\n";
		
		datosHotel += datosHot;
		
		datosHotel += "-------------------------------------------------------------"
				+ "-----------------------------------------------------------------\n";
		
		datosHotel += hotel.getNombre() + "\t"
					+ hotel.getDireccion() + "\t"
					+ hotel.getTelefono() + "\t"
					+ hotel.getWww() + "\t"
					+ hotel.getRfc() + "\t"
					+ hotel.getCategoria() + "\t"
					+ hotel.getCiudad() + "\n";
		
		salida.setText(datosHotel);
		
		JOptionPane.showMessageDialog(null, salida, "Reporte - Hotel", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
