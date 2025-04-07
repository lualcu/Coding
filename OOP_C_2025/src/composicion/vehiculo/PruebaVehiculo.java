package composicion.vehiculo;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class PruebaVehiculo {

	public static void main(String[] args) {
		
		Image img = new ImageIcon("src/general.icons/CARRO.png").getImage();
		ImageIcon icon= new ImageIcon(img.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

		JTextArea salida = new JTextArea();
		String datos = "";
		
		Vehiculo a1 = new Vehiculo("Chevrolet", "ZDF-123-A", "Camaro", "Rojo", 
				250000, 8, "Sport", 5.5);
		Vehiculo a2 = new Vehiculo("Ferrari", "ZDA-223-C", "Enzo", "Rojo", 
				350000, 7, "Sport", 4.4);
		Vehiculo a3 = new Vehiculo("Honda", "ZDS-456-B", "Fit", "Azul", 
				450000, 6, "Family", 6.6);
		Vehiculo a4 = new Vehiculo("Lamborghini", "ZDQ-333-C", "Urus", "Negro", 
				550000, 9, "Family", 7.7);
		
		
		datos+="Marca\tModelo\tTipo\tColor\tPlaca\tMotor\tCilindros\tPrecio\n";
		datos+="------------------------------------------------"
				+ "---------------------------------------------\n";
		datos+= a1.marca + "\t" + a1.modelo + "\t" + a1.tipoVehiculo 
		+ "\t" + a1.color + "\t" + a1.matricula + "\t" + a1.tipoMotor 
		+ "\t" + a1.cilindros + "\t" + a1.precio + "\n";
		
		datos+= a2.marca + "\t" + a2.modelo + "\t" + a2.tipoVehiculo 
		+ "\t" + a2.color + "\t" + a2.matricula + "\t" + a2.tipoMotor 
		+ "\t" + a2.cilindros + "\t" + a2.precio + "\n";
		
		datos+= a3.marca + "\t" + a3.modelo + "\t" + a3.tipoVehiculo 
		+ "\t" + a3.color + "\t" + a3.matricula + "\t" + a3.tipoMotor 
		+ "\t" + a3.cilindros + "\t" + a3.precio + "\n";
		
		datos+= a4.marca + "\t" + a4.modelo + "\t" + a4.tipoVehiculo 
		+ "\t" + a4.color + "\t" + a4.matricula + "\t" + a4.tipoMotor 
		+ "\t" + a4.cilindros + "\t" + a4.precio + "\n";
		salida.setText(datos);
		
		JOptionPane.showMessageDialog(null, salida, "Catalogo - Vehiculos",
				JOptionPane.INFORMATION_MESSAGE,icon);
		
		a1.arrancar();
		a1.detenerse();
		a1.acelerar();
		a1.frenar();
		

	}

}
