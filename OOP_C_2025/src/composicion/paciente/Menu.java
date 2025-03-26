package composicion.paciente;

import javax.swing.JOptionPane;


public class Menu {
	IngresaDatos i = new IngresaDatos();
	Hospital h = new Hospital();
	Medico m = new Medico();

	
	public void menu() {
		int opc;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1.- Alta Medico\n"
					+ "2.- Alta Hospital\n3.- Alta Paciente\n4.- Salir", "Menu Principal", JOptionPane.INFORMATION_MESSAGE));
			switch(opc) {
				case 1:
					m = i.ingresaMedico();
					break;
				case 2:
					h = i.ingresaHospital();
					break;
				case 3:
					i.ingresaPaciente(m, h);
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
