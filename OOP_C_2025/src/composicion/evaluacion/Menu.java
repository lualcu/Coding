package composicion.evaluacion;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Menu {
	
	Imprime i = new Imprime();
	Ingresa in = new Ingresa();
	
	Ciclista ciclista;
	Terapeuta terapeuta;
	Entrenador entrenador;
	Pais pais;
	
	// Crear Iconos
	Image imgMenu = new ImageIcon("src/general.icons/MENU.png").getImage();
	ImageIcon menu= new ImageIcon(imgMenu.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	Image imgError = new ImageIcon("src/general.icons/ERROR.png").getImage();
	ImageIcon error= new ImageIcon(imgError.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	Image imgSalir = new ImageIcon("src/general.icons/SALIR.png").getImage();
	ImageIcon salir= new ImageIcon(imgSalir.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	public void menu() {
		int opc;
		do {
			opc = Integer.parseInt((String)JOptionPane.showInputDialog(null, "1.- Ingresa\n" + "2.- Consulta\n"
					+ "3.- Salir\n","Menu", JOptionPane.INFORMATION_MESSAGE, menu, null, null));
			switch(opc) {
				case 1:
					menuIngresa();
					break;
				case 2:
					menuConsulta();
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Hasta la Vista Baby!!!", "Salir", JOptionPane.INFORMATION_MESSAGE, salir);
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, "Entrada Invalida", "ERROR", JOptionPane.INFORMATION_MESSAGE,error);
			}
		}while(opc != 3);
	}
	
	public void menuIngresa() {
		int opc;
		do {
			opc = Integer.parseInt((String)JOptionPane.showInputDialog(null, "1.- Alta Ciclista\n"
					+ "2.- Alta Entrenador\n3.- Alta Terapeuta\n4.- Alta Pais\n5.- Regresar", "Menu Ingresa", JOptionPane.INFORMATION_MESSAGE,menu,null,null));
			switch(opc) {
				case 1:
					ciclista = in.ingresaCiclista();
					break;
				case 2:
					entrenador = in.ingresaEntrenador();
					break;
				case 3:
					terapeuta = in.ingresaTerapeuta();
					break;
				case 4:
					pais = in.ingresaPais(terapeuta, ciclista, entrenador);
					break;
				case 5:
					menu();
				default:
					JOptionPane.showMessageDialog(null, "Entrada Invalida!!!", "Error", JOptionPane.INFORMATION_MESSAGE,error);
			}
		}while(opc != 5);
	}
	
	public void menuConsulta() {
		int opc;
		do {
			opc = Integer.parseInt((String)JOptionPane.showInputDialog(null, "1.- Ve Ciclista\n"
					+ "2.- Ve Entrenador\n3.- Ve Terapeuta\n4.- Ve Pais\n5.- Regresar", "Menu Consulta", JOptionPane.INFORMATION_MESSAGE,menu,null,null));
			switch(opc) {
				case 1:
					i.imprimeCiclista(ciclista);
					break;
				case 2:
					i.imprimeEntrenador(entrenador);
					break;
				case 3:
					i.imprimeTerapeuta(terapeuta);
					break;
				case 4:
					i.imprimePais(pais);
					break;
				case 5:
					menu();
				default:
					JOptionPane.showMessageDialog(null, "Entrada Invalida!!!", "Error", JOptionPane.INFORMATION_MESSAGE,error);
			}
		}while(opc != 5);
	}

}
