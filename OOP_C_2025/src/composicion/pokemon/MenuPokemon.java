package composicion.pokemon;

import javax.swing.JOptionPane;

public class MenuPokemon {
		IngresaDatos ing = new IngresaDatos();
	public void menu() {
		int opc;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1.- Crear Pokemon\n"
					+ "2.- Salir\n", "Menu Pokemon", JOptionPane.QUESTION_MESSAGE));
			switch(opc) {
				case 1:
					ing.ingresaDatos();
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Hasta la Vista Baby!!!", "Salir",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, "Entrada Invalida", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}while(opc != 2);
	}

}
