package asociacion_arreglos;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Menu {
	int opc;
	//Instanciar un Objeto de la Clase JTextArea
	JTextArea salida = new JTextArea();
	//Declarar una Variable Sring para Concatenar
	String data = "";
	//Declaracion de Arreglos
	int A[] = new int[10];
	int B[] = new int[10];
	
	
	Suma s = new Suma();
	Resta r = new Resta();
	Multiplicacion m = new Multiplicacion();
	Division d = new Division();
	Residuo re = new Residuo();
	Intercalacion i = new Intercalacion();
	Ecuacion e = new Ecuacion();
	
	public void menu() {
	do {
		salida.setTabSize(5);
		opc = Integer.parseInt(JOptionPane.showInputDialog(null, 
				"1.- Inicializar Arreglos\n"
				+ "2.- Suma\n"
				+ "3.- Resta\n"
				+ "4.- Multiplicacion\n"
				+ "5.- Division\n"
				+ "6.- Residuo\n"
				+ "7.- Intercalacion\n"
				+ "8.- Ecuacion\n"
				+ "9.- Salir\n",
				"Menu", JOptionPane.INFORMATION_MESSAGE));
		switch(opc) {
			case 1:
			{ // Inicializar arreglos con Numeros Random (1-20)
				for(int i = 0; i<A.length; i++) {
					A[i] = (int)(Math.random()*20+1);
					B[i] = (int)(Math.random()*20+1);
				}
				JOptionPane.showMessageDialog(null, "Arreglos Inicializados",
						"Inicializacion de Arreglos", JOptionPane.INFORMATION_MESSAGE);
			}
				break;
			case 2:
				data = s.suma(A, B); // data recibe los datos de la clase suma
				// Colocar la Información en una Caja de Texto
				salida.setText(data);
				// Colocar la Informacion en JOptionPane
				JOptionPane.showMessageDialog(null, salida,
						"Resultado - Suma", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 3:
				data = r.resta(A, B); // data recibe los datos de la clase Resta
				// Colocar la Información en una Caja de Texto
				salida.setText(data);
				// Colocar la Informacion en JOptionPane
				JOptionPane.showMessageDialog(null, salida,
						"Resultado - Resta", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 4:
				data = m.multiplica(A, B); // data recibe los datos de la clase Multiplicacion
				// Colocar la Información en una Caja de Texto
				salida.setText(data);
				// Colocar la Informacion en JOptionPane
				JOptionPane.showMessageDialog(null, salida,
						"Resultado - Multiplicacion", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 5:
				data = d.division(A, B); // data recibe los datos de la clase Division
				// Colocar la Información en una Caja de Texto
				salida.setText(data);
				// Colocar la Informacion en JOptionPane
				JOptionPane.showMessageDialog(null, salida,
						"Resultado - Division", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 6:
				data = re.residuo(A, B); // data recibe los datos de la clase Residuo
				// Colocar la Información en una Caja de Texto
				salida.setText(data);
				// Colocar la Informacion en JOptionPane
				JOptionPane.showMessageDialog(null, salida,
						"Resultado - Residuo", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 7: 
				data = i.intercala(A, B);
				salida.setText(data);
				JOptionPane.showMessageDialog(null, salida, "Arreglos Intercalados",
						JOptionPane.INFORMATION_MESSAGE);
				
				break;
			case 8:
				salida.setTabSize(7);
				data = e.ecuacion(A, B);
				salida.setText(data);
				JOptionPane.showMessageDialog(null, salida, 
						"Resultado - Ecuacion", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Hasta la Vista Baby!!!",
						"Salir", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			default:
				JOptionPane.showMessageDialog(null, "Entrada Invalidad!!!",
						"ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}while(opc!=9);
	}

}
