package polimorfismo.vehiculo;

import javax.swing.JOptionPane;

public class Menu {
	
	IngresaDatos i = new IngresaDatos();
	int opc;
	
	public void menuPrincipal() {
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1.- Deportivo\n"
					+ "2.- Familiar\n"
					+ "3.- Carga\n"
					+ "4.- Salir",
					"Menu Principal", JOptionPane.INFORMATION_MESSAGE));
			
			switch(opc) {
				case 1:
					i.ingresaDeportivo();
					break;
				case 2:
					i.ingresaFamiliar();
					break;
				case 3:
					i.ingresaCarga();
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Hasta la Vista Baby!!!",
							"Salir del Programa", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, "Entrada Invalida!!", 
							"ERROR", JOptionPane.INFORMATION_MESSAGE);
			}
		}while(opc != 4);
	}
}
