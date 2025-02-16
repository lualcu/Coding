package asociacion_operaciones;

import javax.swing.JOptionPane;

public class MenuOperaciones {
	// Instanciar a las Clases Operaciones
	Suma sum = new Suma();
	Resta res = new Resta();
	Multiplicacion multi = new Multiplicacion();
	Division div = new Division();
	Residuo resi = new Residuo();
	
	int opc,a,b;
	public void menu() {
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESA UNA OPCION\n"
					+ "1.- Ingresar Datos\n"
					+ "2.- Suma\n"
					+ "3.- Resta\n"
					+ "4.- Multiplicacion\n"
					+ "5.- Division\n"
					+ "6.- Residuo\n"
					+ "7.- Salir",
					"Menu Operaciones", JOptionPane.INFORMATION_MESSAGE));
			switch(opc) {
				case 1:
					a = Integer.parseInt(JOptionPane.showInputDialog(null,
							"Ingresa Numero A", "Ingreso Datos - A",
							JOptionPane.INFORMATION_MESSAGE));
					b = Integer.parseInt(JOptionPane.showInputDialog(null,
							"Ingresa Numero B", "Ingreso Datos - B",
							JOptionPane.INFORMATION_MESSAGE));
					break;
				case 2:
					JOptionPane.showMessageDialog(null, a + " + " + b + " = " + 
					sum.suma(a, b), "Suma", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 3:
					JOptionPane.showMessageDialog(null, a + " - " + b + " = " + 
					res.resta(a, b), "Resta", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 4:
					JOptionPane.showMessageDialog(null, a + " * " + b + " = " + 
					multi.multiplicacion(a, b), "Multiplicacion", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 5:
					if(b!=0) {
					JOptionPane.showMessageDialog(null, a + " / " + b + " = " + 
					div.division(a, b), "Division", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "No se puede Realizar!!!",
								"Division / 0", JOptionPane.ERROR_MESSAGE);;
					}
					break;
				case 6:
					JOptionPane.showMessageDialog(null, a + " % " + b + " = " + 
					resi.residuo(a, b), "Residuo", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 7:
					JOptionPane.showMessageDialog(null, "Hasta la Vista Baby!!!", "Salir",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, "Entrada Invalida!!!", "ERROR",
							JOptionPane.ERROR_MESSAGE);
			}
		}while(opc!=7);
	}
	
}
