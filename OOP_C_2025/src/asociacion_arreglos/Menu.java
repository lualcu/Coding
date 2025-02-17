package asociacion_arreglos;

import javax.swing.JOptionPane;

public class Menu {
	int opc;
	public void menu() {
	do {
		opc = Integer.parseInt(JOptionPane.showInputDialog(null, 
				"1.- Inicializar Arreglos\n"
				+ "2.- Suma\n"
				+ "3.- Resta\n"
				+ "4.- Multiplicacion\n"
				+ "5.- Division\n"
				+ "6.- Residuo\n"
				+ "7.- Intercalacion\n"
				+ "8.- Ecuacion\n"
				+ "9.- Salir\n",
				"Menu", JOptionPane.INFORMATION_MESSAGE));
		switch(opc) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7: 
				break;
			case 8:
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Hasta la Vista Baby!!!",
						"Salir", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			default:
				JOptionPane.showMessageDialog(null, "Entrada Invalidad!!!",
						"ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}while(opc!=9);
	}

}
