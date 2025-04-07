package composicion.automovil;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Menu {
	
	Ingresa i = new Ingresa();
	Motor motor;
	Stereo stereo;
	
	Image imgMenu = new ImageIcon(getClass().getResource("/general.icons/MENU.png")).getImage();
	ImageIcon men= new ImageIcon(imgMenu.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Image imgError = new ImageIcon(getClass().getResource("/general.icons/ERROR.png")).getImage();
	ImageIcon error= new ImageIcon(imgError.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Image imgSalir = new ImageIcon(getClass().getResource("/general.icons/SALIR.png")).getImage();
	ImageIcon salir= new ImageIcon(imgSalir.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	public void menu() {
		int opc;
		do {
			opc = Integer.parseInt((String)JOptionPane.showInputDialog(null, "1.- Alta Motor\n"
					+ "2.- Alta Stereo\n3.- Alta Automóvil\n4.- Salir", "Menu Principal", 
					JOptionPane.INFORMATION_MESSAGE, men, null, null));
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
