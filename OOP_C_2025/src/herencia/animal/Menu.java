	package herencia.animal;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Menu {
	
	Image imgMenu = new ImageIcon(getClass().getResource(
			"/general.icons/MENU.png")).getImage();
	ImageIcon menu= new ImageIcon(imgMenu.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Image imgError = new ImageIcon(getClass().getResource(
			"/general.icons/ERROR.png")).getImage();
	ImageIcon error= new ImageIcon(imgError.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Image imgSalir = new ImageIcon(getClass().getResource(
			"/general.icons/SALIR.png")).getImage();
	ImageIcon salir= new ImageIcon(imgSalir.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Ingresa i = new Ingresa();
	Consulta c = new Consulta();
	int opc;
	
	public void menuPrincipal() {
		do {
		opc = Integer.parseInt((String)JOptionPane.showInputDialog(null, "1.- Alta\n"
				+ "2.- Consulta\n"
				+ "3.- Salir\n", "Menu Principal",
				JOptionPane.INFORMATION_MESSAGE, menu, null, null
				));
		switch(opc) {
			case 1:
				i.ingresaCan();
				break;
			case 2:
				c.consultaCan(); 
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Hasta la Vista Baby!!!",
						"Salir", JOptionPane.INFORMATION_MESSAGE, salir);
				System.exit(0);
			default:
				JOptionPane.showMessageDialog(null, "Opcion Invalida", 
						"ERROR", JOptionPane.ERROR_MESSAGE, error);
		}
		}while(opc != 3);
	
	}
	
	

}
