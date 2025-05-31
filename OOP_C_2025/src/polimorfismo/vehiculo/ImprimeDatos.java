package polimorfismo.vehiculo;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ImprimeDatos {
	
	JTextArea salida = new JTextArea();
	String datosDeportivo = "Marca\tModelo\tMatricula\tCilindros\n";
	String datosFamiliar = "Marca\tModelo\tMatricula\tPuertas\n";
	String datosCarga = "Marca\tModelo\tMatricula\tCarga\tDepartamento\n";
	
	public void muestraDeportivo(Deportivo d) {
		
		
		datosDeportivo += "---------------------------------------------\n";
		datosDeportivo += d.getMarca() + "\t" + d.getModelo() + "\t" + d.getMatricula() + "\t"
		+ d.getNcilindros() + "\n";
		
		salida.setText(datosDeportivo);
		
		JOptionPane.showMessageDialog(null, salida, "Vehiculos - Deportivos", 
					JOptionPane.INFORMATION_MESSAGE);
	
		
	}
	
	public void muestraFamiliar(Familiar f) {
		
		
		datosFamiliar += "---------------------------------------------\n";
		datosFamiliar += f.getMarca() + "\t" + f.getModelo() + "\t" + f.getMatricula() + "\t"
		+ f.getnPuertas() + "\n";
		
		salida.setText(datosFamiliar);
		
		JOptionPane.showMessageDialog(null, salida, "Vehiculos - Familiares", 
					JOptionPane.INFORMATION_MESSAGE);
	
		
	}
	
	public void muestraCarga(Carga c) {
		
		
		datosCarga += "----------------------------------------------------------\n";
		datosCarga += c.getMarca() + "\t" + c.getModelo() + "\t" + c.getMatricula() + "\t"
		+ c.getCapacidadCarga() + "\t" + c.getDepartamento() + "\n";
		
		salida.setText(datosCarga);
		
		JOptionPane.showMessageDialog(null, salida, "Vehiculos - Carga", 
					JOptionPane.INFORMATION_MESSAGE);
	
		
	}
	
	


}
