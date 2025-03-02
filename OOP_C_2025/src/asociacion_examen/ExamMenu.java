package asociacion_examen;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ExamMenu {
	int opc;
	String data;
	JTextArea salida = new JTextArea();
	//Instanciar las clases
	Tablas t = new Tablas();
	Aleatorio a = new Aleatorio();
	Estudiante e = new Estudiante();
	Intercalacion i = new Intercalacion();
	Ecuacion ec = new Ecuacion();
	public void menu() {
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, 
					"1.- Tablas\n"
					+ "2.- Aleatorio\n"
					+ "3.- Etudiante\n"
					+ "4.- Intercalacion\n"
					+ "5.- Ecuacion\n"
					+ "6.- Salir\n",
					"Menu", JOptionPane.QUESTION_MESSAGE));
			switch(opc) {
				case 1:
					salida.setTabSize(8);
					data = t.tablas();
					salida.setText(data);
					JOptionPane.showMessageDialog(null, salida, "Tablas",
							JOptionPane.INFORMATION_MESSAGE);
					break;
				case 2:
					salida.setTabSize(4);
					data = a.aleatorio();
					salida.setText(data);
					JOptionPane.showMessageDialog(null, salida, "Aleatorio",
							JOptionPane.INFORMATION_MESSAGE);
					break;
				case 3:
					salida.setTabSize(8);
					data = e.estudiante();
					salida.setText(data);
					JOptionPane.showMessageDialog(null, salida, "Estudiante",
							JOptionPane.INFORMATION_MESSAGE);
					break;
				case 4:
					salida.setTabSize(6);
					data = i.intercalacion();
					salida.setText(data);
					JOptionPane.showMessageDialog(null, salida, "Intercalacion",
							JOptionPane.INFORMATION_MESSAGE);
					break;
				case 5:
					data = ec.ecuacion();
					JOptionPane.showMessageDialog(null, data, "Ecuacion",
							JOptionPane.INFORMATION_MESSAGE);
					break;
				case 6: 
					JOptionPane.showMessageDialog(null, "Hasta la Vista Baby!!!", 
							"Salir", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, "Entrada Invalida!!!", 
							"ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}while(opc != 6);
	}
}
