package composicion.computadoras;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MenuComputadora {
	
	IngresaDatos i = new IngresaDatos();
	
	Image imgMenu = new ImageIcon("src/general.icons/MENU.png").getImage();
	ImageIcon men= new ImageIcon(imgMenu.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Image imgError = new ImageIcon("src/general.icons/ERROR.png").getImage();
	ImageIcon error= new ImageIcon(imgError.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Image imgSalir = new ImageIcon("src/general.icons/SALIR.png").getImage();
	ImageIcon salir= new ImageIcon(imgSalir.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	public void menu() {
		int opc;
		do {
			opc = Integer.parseInt((String)JOptionPane.showInputDialog(null, 
					"1.- Ingresa Computadora\n2.- Salir\n", "Menu",
					JOptionPane.INFORMATION_MESSAGE, men, null, null));
			switch(opc) {
				case 1:
					i.ingresaDatos();
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Hasta la Vista Baby!!!", "Salir", 
							JOptionPane.INFORMATION_MESSAGE, salir);
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, "Entrada Invalida", "ERROR", 
							JOptionPane.INFORMATION_MESSAGE, error);
			}
		}while(opc != 2);
	}

}
