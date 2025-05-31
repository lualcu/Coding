package polimorfismo.seleccionfutbol2;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class Menu {
	
	Image imgMenu = new ImageIcon("src/general.icons/MENU.png").getImage();
	ImageIcon menu= new ImageIcon(imgMenu.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Image imgError = new ImageIcon("src/general.icons/ERROR.png").getImage();
	ImageIcon error= new ImageIcon(imgError.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Image imgSalir = new ImageIcon("src/general.icons/SALIR.png").getImage();
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
				menuIngresa();
				break;
			case 2:
				menuConsulta();
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
	public void menuIngresa() {
		do {
		opc = Integer.parseInt((String)JOptionPane.showInputDialog(null, "1.- Futbolista\n"
				+ "2.- Masajista\n"
				+ "3.- Entrenador\n"
				+ "4.- Regresar", "Menu Altas",
				JOptionPane.INFORMATION_MESSAGE, menu, null, null
				));
		switch(opc) {
			case 1:
				i.ingresaFutbolista();
				break;
			case 2:
				i.ingresaMasajista();
				break;
			case 3:
				i.ingresaEntrenador();
				break;
			case 4:
				menuPrincipal();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion Invalida", 
						"ERROR", JOptionPane.ERROR_MESSAGE, error);
		}
		}while(opc != 4);
	}
	public void menuConsulta() {
		do {
			opc = Integer.parseInt((String)JOptionPane.showInputDialog(null,"1.- Futbolista\n"
					+ "2.- Masajista\n"
					+ "3.- Entrenador\n"
					+ "4.- Regresar", "Menu Consulta",
					JOptionPane.INFORMATION_MESSAGE, menu, null, null
					));
			switch(opc) {
				case 1:
					c.muestraFutbolista();
					break;
				case 2:
					c.muestraMasajista();
					break;
				case 3:
					c.muestraEntrenador();
					break;
				case 4:
					menuPrincipal();
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcion Invalida", 
							"ERROR", JOptionPane.ERROR_MESSAGE, error);
			}
			}while(opc != 4);
	}

}
