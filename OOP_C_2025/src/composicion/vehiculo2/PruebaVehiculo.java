package composicion.vehiculo2;

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
		
		Vehiculo a1 = new Vehiculo("Chevrolet", "ZDF-123-A", "Camaro",
				"Rojo", 250000, 8, "Sport", 5.5);
		
		datos+="Marca\tModelo\tTipo\tColor\tPlaca\tMotor\tCilindros\tPrecio\n";
		datos+="------------------------------------------------"
				+ "---------------------------------------------\n";
		datos+= a1.getMarca() + "\t" + a1.getModelo() + "\t" + a1.getTipoVehiculo() 
		+ "\t" + a1.getColor() + "\t" + a1.getMatricula() + "\t" + a1.getTipoMotor() 
		+ "\t" + a1.getCilindros() + "\t" + a1.getPrecio() + "\n";
		salida.setText(datos);
		JOptionPane.showMessageDialog(null, salida, "Catalogo - Vehiculos",
				JOptionPane.INFORMATION_MESSAGE,icon);
		
		// Modificar Mediante el Uso de los Set's algunos atributos de la clase
		a1.setMatricula("AGS-456-G");
		a1.setColor("Amarillo");
		a1.setPrecio(220000);
		
		// Muestra los valores modificados
		datos+= a1.getMarca() + "\t" + a1.getModelo() + "\t" + a1.getTipoVehiculo() 
		+ "\t" + a1.getColor() + "\t" + a1.getMatricula() + "\t" + a1.getTipoMotor() 
		+ "\t" + a1.getCilindros() + "\t" + a1.getPrecio() + "\n";
		salida.setText(datos);
		JOptionPane.showMessageDialog(null, salida, "Catalogo - Vehiculos", 
				JOptionPane.INFORMATION_MESSAGE, icon);
		
		// Ejecutar los Métodos de Operaciones
		
		JOptionPane.showMessageDialog(null, a1.acelerar(), "Acelerar", 
				JOptionPane.INFORMATION_MESSAGE, icon);
	}
	

}
