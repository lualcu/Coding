package composicion.vehiculo3;

import javax.swing.JOptionPane;

public class MenuVehiculo {
	IngresaDatos i = new IngresaDatos();
	Chofer ch = new Chofer();
	Empresa e = new Empresa();
	
	public void menu() {
		int opc;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1.- Alta Chofer\n"
					+ "2.- Alta Empresa\n3.- Alta Vehiculo\n4.- Salir", "Menu Principal", JOptionPane.INFORMATION_MESSAGE));
			switch(opc) {
				case 1:
					ch = i.ingresaChofer();
					break;
				case 2:
					e = i.IngresaEmpresa();
					break;
				case 3:
					i.ingresaVehiculo(ch, e);
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
