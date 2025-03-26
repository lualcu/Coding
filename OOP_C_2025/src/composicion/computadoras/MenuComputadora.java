package composicion.computadoras;

import javax.swing.JOptionPane;

public class MenuComputadora {
	
	IngresaDatos i = new IngresaDatos();
	
	public void menu() {
		int opc;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1.- Ingresa Computadora\n2.- Salir\n", "Menu", JOptionPane.INFORMATION_MESSAGE));
			switch(opc) {
				case 1:
					i.ingresaDatos();
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Hasta la Vista Baby!!!", "Salir", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, "Entrada Invalida", "ERROR", JOptionPane.INFORMATION_MESSAGE);
			}
		}while(opc != 2);
	}

}
