package composicion.pokemon3;

import javax.swing.JOptionPane;

public class Menu {
	
	Ingresa i = new Ingresa();
	Gimnasio gimnasio;
	Entrenador entrenador;
	
	public void menu() {
		int opc;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1.- Alta Gimnasio\n"
					+ "2.- Alta Entrenador\n3.- Alta Pokemon\n4.- Salir", "Menu Principal", JOptionPane.INFORMATION_MESSAGE));
			switch(opc) {
				case 1:
					gimnasio = i.ingresaGimnasio();
					break;
				case 2:
					entrenador = i.ingresaEntrenador();
					break;
				case 3:
					i.ingresaPokemon(entrenador,gimnasio);
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
