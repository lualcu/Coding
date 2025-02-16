package asociacion_temperatura;

import javax.swing.JOptionPane;

public class MenuTemperatura {
	int opc;
	double temperatura;
	
	Celcius c = new Celcius();
	Fahrenheit f = new Fahrenheit();
	Kelvin k = new Kelvin();
	Tabla t = new Tabla();
	
	public void menuTemperatura() {
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, 
					"1.- Celcius\n"
					+ "2.- Fahrenheit\n"
					+ "3.- Kelvin\n"
					+ "4.- Salir\n",
					"Temperatura Original", JOptionPane.INFORMATION_MESSAGE));
			switch(opc) {
				case 1:
					menuCelcius();
					break;
				case 2:
					menuFahrenheit();
					break;
				case 3:
					menuKelvin();
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Hasta la Vista Baby!!!",
							"Salir", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, "Entrada Invalida!!!", 
							"ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}while(opc != 4);
	}
	public void menuCelcius() {
		temperatura = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Ingresa Temperatura: ", "Celcius", JOptionPane.INFORMATION_MESSAGE));
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, 
					 "1.- Fahrenheit\n"
					+ "2.- Kelvin\n"
					+ "3.- TABLA\n"
					+ "4.- Regresar\n",
					"Temperatura a Convertir", JOptionPane.INFORMATION_MESSAGE));
			switch(opc) {
				case 1:
					JOptionPane.showMessageDialog(null, temperatura + " C° son " + c.fahrenheit(temperatura) + " F°",
							"Celcius --> Fahrenheit", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 2:
					JOptionPane.showMessageDialog(null, temperatura + " C° son " + c.kelvin(temperatura) + " K°",
							"Celcius --> Kelvin", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 3:
					t.celtemp = temperatura;
					t.fahrtemp = c.fahrenheit(temperatura);
					t.keltemp = c.kelvin(temperatura);
					t.tabla();
					break;
				case 4:
					menuTemperatura();
					break;
				default:
					JOptionPane.showMessageDialog(null, "Entrada Invalida!!!", 
							"ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}while(opc != 3);
	}
	public void menuFahrenheit() {
		temperatura = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Ingresa Temperatura: ", "Fahrenheit", JOptionPane.INFORMATION_MESSAGE));
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, 
					 "1.- Celcius\n"
					+ "2.- Kelvin\n"
					+ "3.- Tabla\n"
					+ "4.- Regresar\n",
					"Temperatura a Convertir", JOptionPane.INFORMATION_MESSAGE));
			switch(opc) {
				case 1:
					JOptionPane.showMessageDialog(null, temperatura + " F° son " + f.celcius(temperatura) + " C°",
							"Fahrenheit --> Celcius", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 2:
					JOptionPane.showMessageDialog(null, temperatura + " F° son " + f.kelvin(temperatura) + " K°",
							"Fahrenheit --> Kelvin", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 3:
					t.celtemp = f.celcius(temperatura);
					t.fahrtemp = temperatura;
					t.keltemp = f.kelvin(temperatura);
					t.tabla();
					break;
				case 4:
					menuTemperatura();
					break;
				default:
					JOptionPane.showMessageDialog(null, "Entrada Invalida!!!", 
							"ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}while(opc != 3);
		
	}
	public void menuKelvin() {
		temperatura = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Ingresa Temperatura: ", "Kelvin", JOptionPane.INFORMATION_MESSAGE));
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, 
					 "1.- Celcius\n"
					+ "2.- Fahrenheit\n"
					+ "3.- Tabla\n"
					+ "4.- Regresar\n",
					"Temperatura a Convertir", JOptionPane.INFORMATION_MESSAGE));
			switch(opc) {
				case 1:
					JOptionPane.showMessageDialog(null, temperatura + " K° son " + k.celcius(temperatura) + " C°",
							"Kelvin --> Celcius", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 2:
					JOptionPane.showMessageDialog(null, temperatura + " K° son " + k.fahrenheit(temperatura) + " F°",
							"Kelvin --> Fahrenheit", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 3:
					t.celtemp = k.celcius(temperatura);
					t.fahrtemp = k.fahrenheit(temperatura);
					t.keltemp = temperatura;
					t.tabla();
					break;
				case 4:
					menuTemperatura();
					break;
				default:
					JOptionPane.showMessageDialog(null, "Entrada Invalida!!!", 
							"ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}while(opc != 3);
	}
}
