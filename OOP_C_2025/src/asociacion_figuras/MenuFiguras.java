package asociacion_figuras;

import javax.swing.JOptionPane;

public class MenuFiguras {
	int opc;
	// Instanciar a las clases figuras
	Circulo cir = new Circulo();
	Triangulo tri = new Triangulo();
	Cuadrado cua = new Cuadrado();
	Rombo rom = new Rombo();
	Rectangulo rec = new Rectangulo();
	public void menuFiguras() {
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, 
					"1.- Menu Areas\n"
					+ "2.- Menu Perimetros\n"
					+ "3.- Salir", 
					"Menu Figuras", 
					JOptionPane.INFORMATION_MESSAGE));
			switch (opc) {
				case 1:
					menuAreas();
					break;
				case 2:
					menuPerimetros();
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Hasta la Vista Baby!!!", "Salir",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, "Entrada Invalida!!!", "ERROR",
							JOptionPane.ERROR_MESSAGE);
			}
			
		}while(opc != 3);
	}
	public void menuAreas() {
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, 
					"1.- Circulo\n"
					+ "2.- Triangulo\n"
					+ "3.- Cuadrado\n"
					+ "4.- Rectangulo\n"
					+ "5.- Rombo\n"
					+ "6.- Regresar\n", 
					"Menu Areas", 
					JOptionPane.INFORMATION_MESSAGE));
			switch(opc) {
				case 1:
					cir.area();
					break;
				case 2:
					tri.area();
					break;
				case 3:
					cua.area();
					break;
				case 4:
					rec.area();
					break;
				case 5:
					rom.area();
					break;
				case 6:
					menuFiguras();
					break;
				default:
					JOptionPane.showMessageDialog(null, "Entrada Invalida!!!", "ERROR",
							JOptionPane.ERROR_MESSAGE);		
			}
		}while(opc!=6);
	}
	public void menuPerimetros() {
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, 
					"1.- Circulo\n"
					+ "2.- Triangulo\n"
					+ "3.- Cuadrado\n"
					+ "4.- Rectangulo\n"
					+ "5.- Rombo\n"
					+ "6.- Regresar\n", 
					"Menu Perimetros", 
					JOptionPane.INFORMATION_MESSAGE));
			switch(opc) {
				case 1:
					cir.perimetro();
					break;
				case 2:
					tri.perimetro();
					break;
				case 3:
					cua.perimetro();
					break;
				case 4:
					rec.perimetro();
					break;
				case 5:
					rom.perimetro();
					break;
				case 6:
					menuFiguras();
					break;
				default:
					JOptionPane.showMessageDialog(null, "Entrada Invalida!!!", "ERROR",
							JOptionPane.ERROR_MESSAGE);		
			}
		}while(opc!=6);
	}
}
