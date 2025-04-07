package composicion.paciente;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Menu {
	IngresaDatos i = new IngresaDatos();
	Hospital h = new Hospital();
	Medico m = new Medico();
	
	Image imgMenu = new ImageIcon(getClass().getResource("/general.icons/MENU.png")).getImage();
	ImageIcon men= new ImageIcon(imgMenu.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Image imgError = new ImageIcon(getClass().getResource("/general.icons/ERROR.png")).getImage();
	ImageIcon error= new ImageIcon(imgError.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Image imgSalir = new ImageIcon(getClass().getResource("/general.icons/SALIR.png")).getImage();
	ImageIcon salir= new ImageIcon(imgSalir.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

	
	public void menu() {
		int opc;
		do {
			opc = Integer.parseInt((String)JOptionPane.showInputDialog(null, "1.- Alta Medico\n"
					+ "2.- Alta Hospital\n3.- Alta Paciente\n4.- Salir", "Menu Principal", 
					JOptionPane.INFORMATION_MESSAGE, men, null, null));
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
					JOptionPane.showMessageDialog(null, "Hasta la Vista Baby!!!", "Salir", 
							JOptionPane.INFORMATION_MESSAGE, salir);
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, "Entrada Invalida!!!", "Error", 
							JOptionPane.INFORMATION_MESSAGE, error);
			}
		}while(opc != 4);
	}
}
