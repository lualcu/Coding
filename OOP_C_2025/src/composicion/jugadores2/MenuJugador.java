package composicion.jugadores2;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class MenuJugador {
	
	Image imgSal = new ImageIcon("src/general.icons/SALIR.png").getImage();
	ImageIcon salir= new ImageIcon(imgSal.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Image imgErr = new ImageIcon("src/general.icons/ERROR.png").getImage();
	ImageIcon err= new ImageIcon(imgErr.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Image imgMenu = new ImageIcon("src/general.icons/MENU.png").getImage();
	ImageIcon menu = new ImageIcon(imgMenu.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	
	
	IngresaDatos i = new IngresaDatos();
	public void menuJugador() {
		int opc;
		do {
			opc = Integer.parseInt((String)JOptionPane.showInputDialog(null, "1.- Ingresa Jugador\n"
					+ "2.- Salir\n","Menu", JOptionPane.INFORMATION_MESSAGE, menu, null ,null));
			switch(opc) {
				case 1:
					i.ingresaDatos();
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Hasta la Vista Baby!!!", "Salir", JOptionPane.INFORMATION_MESSAGE, salir);
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, "Entrada Invalida", "ERROR", JOptionPane.INFORMATION_MESSAGE, err);
			}
		}while(opc != 2);
	}

}
