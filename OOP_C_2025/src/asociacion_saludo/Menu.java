package asociacion_saludo;

import javax.swing.JOptionPane;

public class Menu {
	
	public void menu () {
		
		// Instanciar a las clases saludos
		SaludoMx smx = new SaludoMx();
		SaludoUsa susa = new SaludoUsa();
		SaludoItaly sita = new SaludoItaly();
		SaludoFrench sfre = new SaludoFrench();
		SaludoPortugues spor = new SaludoPortugues();
		int opc;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, 
					"1.- Mx\n"
					+ "2.- Usa\n"
					+ "3.- French\n"
					+ "4.- Italy\n"
					+ "5.- Portugues\n"
					+ "6.- Salir", 
					"Menu Saludos",
					JOptionPane.QUESTION_MESSAGE));
			switch(opc) {
				case 1:
					smx.saludoMx();
					break;
				case 2:
					susa.saludoUsa();
					break;
				case 3:
					sfre.saludoFrench();
					break;
				case 4:
					sita.saludoItaly();
					break;
				case 5:
					spor.saludoPortugues();
					break;
				case 6:
					JOptionPane.showMessageDialog(null, "Hasta la Vista Baby !!!", 
							"Salir", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
					
				default:
					JOptionPane.showMessageDialog(null, "Opcion Incorrecta!!!",
							"ERROR", JOptionPane.ERROR_MESSAGE);
			}	
		}while(opc != 6);
	}
}