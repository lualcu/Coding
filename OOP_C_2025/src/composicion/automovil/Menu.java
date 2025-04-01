package composicion.automovil;

import javax.swing.JOptionPane;

public class Menu {
	
	Ingresa i = new Ingresa();
	Motor motor;
	Stereo stereo;
	
	public void menu() {
		int opc;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1.- Alta Motor\n"
					+ "2.- Alta Stereo\n3.- Alta Automóvil\n4.- Salir", "Menu Principal", JOptionPane.INFORMATION_MESSAGE));
			switch(opc) {
				case 1:
					motor = i.ingresaMotor();
					break;
				case 2:
					stereo = i.ingresaStereo();
					break;
				case 3:
					i.ingresaAutomovil(motor, stereo);
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Hasta la Vista Baby!!!", "Salir", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, "Entrada Invalida!!!", "Error", JOptionPane.INFORMATION_MESSAGE);
			}
		}while(opc != 4);
	}

}
