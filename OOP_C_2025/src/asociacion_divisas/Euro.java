package asociacion_divisas;

import javax.swing.JOptionPane;

public class Euro {
	double cambio, tasaCambio;
	public double pesoMx(double cantidad) {
		tasaCambio = getTasaCambio("Peso(s) Mx");
		cambio = cantidad*tasaCambio;
		return cambio;
	}
	public double dollar(double cantidad) {
		tasaCambio = getTasaCambio("Dolar(es)");
		cambio = cantidad*tasaCambio;
		return cambio;
	}
	public double libra(double cantidad) {
		tasaCambio = getTasaCambio("Libra(s)");
		cambio = cantidad*tasaCambio;
		return cambio;
	}
	public double pesoColom(double cantidad) {
		tasaCambio = getTasaCambio("Peso(s) Col");
		cambio = cantidad*tasaCambio;
		return cambio;
	}
	public double getTasaCambio(String divisa) {
		return Double.parseDouble(JOptionPane.showInputDialog(null,
		"Ingresa la Tasa de Cambio a " + divisa, 
		"Euro(s)-->" + divisa, JOptionPane.INFORMATION_MESSAGE));
	}
}
