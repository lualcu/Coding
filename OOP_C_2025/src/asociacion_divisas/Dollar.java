package asociacion_divisas;

import javax.swing.JOptionPane;

public class Dollar {
	double cambio, tasaCambio;

	
	public double pesoMx(double cantidad) {
		tasaCambio = getTasaCambio("Peso(s) Mx");
		cambio = cantidad*tasaCambio;
		return cambio;
	}
	public double euro(double cantidad) {
		tasaCambio = getTasaCambio("Euro(s)");
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
		"Dolar(es)-->" + divisa, JOptionPane.INFORMATION_MESSAGE));
	}
}
