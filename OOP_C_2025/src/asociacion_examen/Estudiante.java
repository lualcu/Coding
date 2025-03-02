package asociacion_examen;

import javax.swing.JOptionPane;

public class Estudiante {
	String datos = "";
	String linea = "----------------------------------------------\n";
	String nombre;
	int numCal;
	boolean valido = false;
	int califs[] = new int[10];
	int sumaCal = 0;
	double promCal;
	public String estudiante() {
		nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del Estudiante: ",
				"Nombre Estudiante", JOptionPane.QUESTION_MESSAGE);
		do {
			numCal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la cantidad de Calificaciones (1-10): ",
					"Calificaciones", JOptionPane.QUESTION_MESSAGE ));
			if(numCal == 0 || numCal > 10) {
				JOptionPane.showMessageDialog(null, "Dato Invalido!!!", "Error",
						JOptionPane.ERROR_MESSAGE);
				valido = false;
			}
			else {
				valido = true;
			}
		}while(!valido);
		
		//Llenar Calificaciones y Acomodar Salida
		datos += "Estudiante: " + nombre + "\n";
		datos += "Calificaciones Solicitadas: " + numCal + "\n";
		datos += linea;
		for(int i = 0; i<numCal; i++) {
			califs[i] = (int)(Math.random()*51+50);
			sumaCal += califs[i];
			datos += "Calif. " + (i+1) + ": " + califs[i] + "\n";
		}
		datos += linea;
		//Calcular Promedio
		promCal = (double)sumaCal/(double)numCal;
		
		datos += "Promedio: " + String.format("%.2f", promCal) + " ";
		if(promCal <70) {
			datos += "Lastima Margarito\n";
		}
		else if(promCal == 70) {
			datos += "Lo hiciste\n";
		}
		else if(promCal <= 80) {
			datos += "Anímate\n";
		}
		else if(promCal <= 90) {
			datos += "Adelante\n";
		}
		else if(promCal <= 100) {
			datos += "Enhorabuena\n";
		}
		return datos;
	}
}
