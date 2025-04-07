package composicion.vehiculo3;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MenuVehiculo {
	IngresaDatos i = new IngresaDatos();
	Chofer ch = new Chofer();
	Empresa e = new Empresa();
	
	Image imgMenu = new ImageIcon(getClass().getResource("/general.icons/MENU.png")).getImage();
	ImageIcon men= new ImageIcon(imgMenu.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Image imgError = new ImageIcon(getClass().getResource("/general.icons/ERROR.png")).getImage();
	ImageIcon error= new ImageIcon(imgError.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Image imgSalir = new ImageIcon(getClass().getResource("/general.icons/SALIR.png")).getImage();
	ImageIcon salir= new ImageIcon(imgSalir.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	public void menu() {
		int opc;
		do {
			opc = Integer.parseInt((String)JOptionPane.showInputDialog(null, "1.- Alta Chofer\n"
					+ "2.- Alta Empresa\n3.- Alta Vehiculo\n4.- Salir", "Menu Principal", 
					JOptionPane.INFORMATION_MESSAGE, men, null,null));
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
					JOptionPane.showMessageDialog(null, "Hasta la Vista Baby!!!", "Salir", 
							JOptionPane.INFORMATION_MESSAGE,salir);
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, "Entrada Invalida!!!", "Error",
							JOptionPane.INFORMATION_MESSAGE,error);
			}
		}while(opc != 4);
	}

}
