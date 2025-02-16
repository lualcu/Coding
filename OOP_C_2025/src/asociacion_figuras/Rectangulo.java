package asociacion_figuras;

import javax.swing.JOptionPane;

public class Rectangulo {
	double base,altura;
	public void area() {
		base = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Ingresa la Base: ", "Base-Rectangulo", JOptionPane.INFORMATION_MESSAGE));
		altura = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Ingresa la Altura: ", "Altura-Rectangulo", JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showMessageDialog(null, "El Area es: " + (base*altura), "Area-Rectangulo",
				JOptionPane.INFORMATION_MESSAGE);
	}
	public void perimetro() {
		base = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Ingresa la Base: ", "Base-Rectangulo", JOptionPane.INFORMATION_MESSAGE));
		altura = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Ingresa la Altura: ", "Altura-Rectangulo", JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showMessageDialog(null, "El Perimetro es: " + ((base*2)+(altura*2)), "Perimetro-Rectangulo",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
