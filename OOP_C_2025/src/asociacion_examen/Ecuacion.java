package asociacion_examen;

import javax.swing.JOptionPane;

public class Ecuacion {
	String datos = "";
	int a,b,c;
	int D;
	public String ecuacion() {
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "De: Ax^2 + Bx + C = 0\n Ingresa A: ",
				"Ingresa A", JOptionPane.QUESTION_MESSAGE));
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "De: "+a+"x^2 + Bx + C = 0\n Ingresa B: ",
				"Ingresa B", JOptionPane.QUESTION_MESSAGE));
		c = Integer.parseInt(JOptionPane.showInputDialog(null, "De: "+a+"x^2 + "+b+"x + C = 0\n Ingresa C: ",
				"Ingresa C", JOptionPane.QUESTION_MESSAGE));
		// Calcular la discriminante D = b2 - 4ac
		D = (int) (Math.pow(b, 2) - (4*a*c));
		if(D > 0) {
			datos += "Las Soluciones para el Discriminante de:\n" + a+"x^2 + "+b+"x + "+c+" = 0\n"
					+ "Solucion 1: " + ((-b + Math.sqrt(D))/(2*a)) + "\n"
					+ "Solucion 2: " + ((-b - Math.sqrt(D))/(2*a)) + "\n";
		}
		else if(D == 0) {
			datos += "La Solucion para el Discriminante de:\n" + a+"x^2 + "+b+"x + "+c+" = 0\n"
					+ "Solucion: " + ((-b + Math.sqrt(D))/(2*a)) + "\n";
		}
		else {
			datos += "No hay Solucion Real para el Discriminante de:\n" + a+"x^2 + "+b+"x + "+c+" = 0\n";
		}
		return datos;
	}
}
