package asociacion_divisas;

import javax.swing.JOptionPane;

public class MenuDivisas {
	int opc;
	double cantidad;
	
	PesoMx pmx = new PesoMx();
	PesoColom pcol = new PesoColom();
	Dollar dol = new Dollar();
	Euro eu = new Euro();
	Libra lib = new Libra();
	
	public void menuDivisas() {
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null,
					"1.- Dolar\n"
					+ "2.- Euro\n"
					+ "3.- Libra\n"
					+ "4.- Peso Mx\n"
					+ "5.- Peso Col\n"
					+ "6.- Salir\n",
					"Ingresa tu Divisa",
					JOptionPane.INFORMATION_MESSAGE));
			switch(opc) {
				case 1:
					menuDolar();
					break;
					
				case 2:
					menuEuro();
					break;
				case 3:
					menuLibra();
					break;
				case 4:
					menuPesoMx();
					break;
				case 5:
					menuPesoCol();
					break;
				case 6:
					JOptionPane.showMessageDialog(null, "Hasta la Vista Baby!!!",
							"Salir", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, "Entrada Invalida!!!",
							"ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}while(opc != 6);
	}
	private void menuDolar() {
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null,
					"1.- Ingresa Monto\n"
					+ "2.- Peso Mx\n"
					+ "3.- Euro\n"
					+ "4.- Libra\n"
					+ "5.- Peso Col\n"
					+ "6.- Regresar\n",
					"Ingresa el Cambio",
					JOptionPane.INFORMATION_MESSAGE));
			switch(opc) {
				case 1:
					cantidad = Double.parseDouble(JOptionPane.showInputDialog(null,
							"Ingresa tu Monto: ", "Dolares", 
							JOptionPane.INFORMATION_MESSAGE));
					
					break;
				case 2:
					JOptionPane.showMessageDialog(null, cantidad + " dolar(es) son "
							+ dol.pesoMx(cantidad) + " peso(s) Mx",
							"Dolar-PesoMx", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 3:
					JOptionPane.showMessageDialog(null, cantidad + " dolar(es) son "
							+ dol.euro(cantidad) + " euro(s)",
							"Dolar-Euro", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 4:
					JOptionPane.showMessageDialog(null, cantidad + " dolar(es) son "
							+ dol.libra(cantidad) + " libra(s)",
							"Dolar-Libra", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 5:
					JOptionPane.showMessageDialog(null, cantidad + " dolar(es) son "
							+ dol.pesoColom(cantidad) + " peso(s) Col",
							"Dolar-PesoCol", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 6:
					menuDivisas();
					break;
				default:
					JOptionPane.showMessageDialog(null, "Entrada Invalida!!!",
							"ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}while(opc != 6);
		
	}
	private void menuEuro() {
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null,
					"1.- Ingresa Monto\n"
					+ "2.- Dolar\n"
					+ "3.- Peso Mx\n"
					+ "4.- Libra\n"
					+ "5.- Peso Col\n"
					+ "6.- Regresar\n",
					"Ingresa el Cambio",
					JOptionPane.INFORMATION_MESSAGE));
			switch(opc) {
				case 1:
					cantidad = Double.parseDouble(JOptionPane.showInputDialog(null,
							"Ingresa tu Monto: ", "Euros", 
							JOptionPane.INFORMATION_MESSAGE));
					break;
				case 2:
					JOptionPane.showMessageDialog(null, cantidad + " euro(s) son "
							+ eu.dollar(cantidad) + " dolar(es)",
							"Euro-Dolar", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 3:
					JOptionPane.showMessageDialog(null, cantidad + " euro(s) son "
							+ eu.pesoMx(cantidad) + " peso(s) Mx",
							"Euro-PesosMx", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 4:
					JOptionPane.showMessageDialog(null, cantidad + " euro(s) son "
							+ eu.libra(cantidad) + " libra(s)",
							"Euro-Libra", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 5:
					JOptionPane.showMessageDialog(null, cantidad + " euro(s) son "
							+ eu.dollar(cantidad) + " peso(s) Col",
							"Euro-PesosCol", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 6:
					menuDivisas();
					break;
				default:
					JOptionPane.showMessageDialog(null, "Entrada Invalida!!!",
							"ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}while(opc != 6);
		
	}
	private void menuLibra() {
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null,
					"1.- Ingresa Monto\n"
					+ "2.- Dolar\n"
					+ "3.- Euro\n"
					+ "4.- Peso Mx\n"
					+ "5.- Peso Col\n"
					+ "6.- Regresar\n",
					"Ingresa el Cambio",
					JOptionPane.INFORMATION_MESSAGE));
			switch(opc) {
				case 1:
					cantidad = Double.parseDouble(JOptionPane.showInputDialog(null,
							"Ingresa tu Monto: ", "Libras", 
							JOptionPane.INFORMATION_MESSAGE));
					break;
				case 2:
					JOptionPane.showMessageDialog(null, cantidad + " libra(s) son "
							+ lib.dollar(cantidad) + " dolar(es)",
							"Libra-Dolar", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 3:
					JOptionPane.showMessageDialog(null, cantidad + " libra(s) son "
							+ lib.euro(cantidad) + " euro(s)",
							"Libra-Euros", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 4:
					JOptionPane.showMessageDialog(null, cantidad + " libra(s) son "
							+ lib.pesoMx(cantidad) + " peso(s) Mx",
							"Libra-PesoMx", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 5:
					JOptionPane.showMessageDialog(null, cantidad + " libra(s) son "
							+ lib.pesoColom(cantidad) + " peso(s) Col",
							"Libra-PesoCol", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 6:
					menuDivisas();
					break;
				default:
					JOptionPane.showMessageDialog(null, "Entrada Invalida!!!",
							"ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}while(opc != 6);
		
	}
	private void menuPesoMx() {
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null,
					"1.- Ingresa Monto\n"
					+ "2.- Dolar\n"
					+ "3.- Euro\n"
					+ "4.- Libra\n"
					+ "5.- Peso Col\n"
					+ "6.- Regresar\n",
					"Ingresa el Cambio",
					JOptionPane.INFORMATION_MESSAGE));
			switch(opc) {
				case 1:
					cantidad = Double.parseDouble(JOptionPane.showInputDialog(null,
							"Ingresa tu Monto: ", "Pesos Mx", 
							JOptionPane.INFORMATION_MESSAGE));
					break;
				case 2:
					JOptionPane.showMessageDialog(null, cantidad + " peso(s) Mx son "
							+ pmx.dollar(cantidad) + " dolar(es)",
							"PesoMx-Dolar", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 3:
					JOptionPane.showMessageDialog(null, cantidad + " peso(s) Mx son "
							+ pmx.euro(cantidad) + " euro(s)",
							"PesoMx-Euro", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 4:
					JOptionPane.showMessageDialog(null, cantidad + " peso(s) Mx son "
							+ pmx.libra(cantidad) + " libra(s)",
							"PesoMx-Libra", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 5:
					JOptionPane.showMessageDialog(null, cantidad + " peso(s) Mx son "
							+ pmx.pesoColom(cantidad) + " peso(s) Col",
							"PesoMx-PesoCol", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 6:
					menuDivisas();
					break;
				default:
					JOptionPane.showMessageDialog(null, "Entrada Invalida!!!",
							"ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}while(opc != 6);
		
	}
	private void menuPesoCol() {
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null,
					"1.- Ingresa Monto\n"
					+ "2.- Dolar\n"
					+ "3.- Euro\n"
					+ "4.- Libra\n"
					+ "5.- Peso Mx\n"
					+ "6.- Regresar\n",
					"Ingresa el Cambio",
					JOptionPane.INFORMATION_MESSAGE));
			switch(opc) {
				case 1:
					cantidad = Double.parseDouble(JOptionPane.showInputDialog(null,
							"Ingresa tu Monto: ", "Pesos Col", 
							JOptionPane.INFORMATION_MESSAGE));
					break;
				case 2:
					JOptionPane.showMessageDialog(null, cantidad + " peso(s) Col son "
							+ pcol.dollar(cantidad) + " dolar(es)",
							"PesoCol-Dolar", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 3:
					JOptionPane.showMessageDialog(null, cantidad + " peso(s) Col son "
							+ pcol.euro(cantidad) + " euro(s)",
							"PesoCol-Euro", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 4:
					JOptionPane.showMessageDialog(null, cantidad + " peso(s) Col son "
							+ pcol.libra(cantidad) + " libra(s)",
							"PesoCol-Libra", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 5:
					JOptionPane.showMessageDialog(null, cantidad + " peso(s) Col son "
							+ pcol.pesoMx(cantidad) + " peso(s) Mx",
							"PesoCol-PesoMx", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 6:
					menuDivisas();
					break;
				default:
					JOptionPane.showMessageDialog(null, "Entrada Invalida!!!",
							"ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}while(opc != 6);
		
	}
}