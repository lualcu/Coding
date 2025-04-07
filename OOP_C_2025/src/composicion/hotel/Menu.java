package composicion.hotel;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Menu {
	
	Ingresa i = new Ingresa();
	Huesped hue;
	Habitacion hab;
	
	Image imgMenu = new ImageIcon(getClass().getResource("/general.icons/MENU.png")).getImage();
	ImageIcon men= new ImageIcon(imgMenu.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Image imgError = new ImageIcon(getClass().getResource("/general.icons/ERROR.png")).getImage();
	ImageIcon error= new ImageIcon(imgError.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Image imgSalir = new ImageIcon(getClass().getResource("/general.icons/SALIR.png")).getImage();
	ImageIcon salir= new ImageIcon(imgSalir.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	public void menu() {
		int opc;
		do {
			opc = Integer.parseInt((String)JOptionPane.showInputDialog(null, "1.- Alta Huesped\n"
					+ "2.- Alta Habitacion\n3.- Alta Hotel\n4.- Salir", "Menu Principal", 
					JOptionPane.INFORMATION_MESSAGE, men, null, null));
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
					JOptionPane.showMessageDialog(null, "Hasta la Vista Baby!!!", "Salir", 
							JOptionPane.INFORMATION_MESSAGE, salir);
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, "Entrada Invalida!!!", "Error", 
							JOptionPane.INFORMATION_MESSAGE, salir);
			}
		}while(opc != 4);
	}

}
