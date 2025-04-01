package composicion.hotel;

import javax.swing.JOptionPane;

public class Menu {
	
	Ingresa i = new Ingresa();
	Huesped hue;
	Habitacion hab;
	
	public void menu() {
		int opc;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1.- Alta Huesped\n"
					+ "2.- Alta Habitacion\n3.- Alta Hotel\n4.- Salir", "Menu Principal", JOptionPane.INFORMATION_MESSAGE));
			switch(opc) {
				case 1:
					hue = i.ingresaHuesped();
					break;
				case 2:
					hab = i.ingresaHabitacion();
					break;
				case 3:
					i.ingresaHotel(hue, hab);
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
