package serializable;

import javax.swing.JOptionPane;

public class Ingresa {
	
	String matricula,marca,modelo;
	Ficheros f = new Ficheros();
	public void ingresaDeportivo() {
		matricula = JOptionPane.showInputDialog(null, "Ingresa Matricula",
				"Deportivo", JOptionPane.INFORMATION_MESSAGE);
		marca = JOptionPane.showInputDialog(null, "Ingresa Marca",
				"Deportivo", JOptionPane.INFORMATION_MESSAGE);
		modelo = JOptionPane.showInputDialog(null, "Ingresa Modelo",
				"Deportivo", JOptionPane.INFORMATION_MESSAGE);

		Vehiculo v = new Vehiculo(matricula,marca,modelo);
		
		f.almacenaDatos(v);
	}

}
