package asociacion_figuras;

import javax.swing.JOptionPane;

public class Rombo {
	double diagonalMayor,diagonalMenor, lado;
	public void area() {
		diagonalMayor = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa Valor: ",
				"Diagonal Mayor-Rombo", JOptionPane.INFORMATION_MESSAGE));
		diagonalMenor = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa Valor: ",
				"Diagonal Menor-Rombo", JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showMessageDialog(null, "El Area es: " + ((diagonalMayor*diagonalMenor)/2),
				"Area-Rombo", JOptionPane.INFORMATION_MESSAGE);
	}
	public void perimetro() {
		lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa Lado: ", 
				"Lado-Rombo", JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showMessageDialog(null, "El Perimetro es: " + (lado*4),
				"Perimetro-Rombo", JOptionPane.INFORMATION_MESSAGE);
	}
}
