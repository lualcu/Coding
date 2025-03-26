package composicion.vehiculo3;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Imprime {
	
	JTextArea salida = new JTextArea();
	String datosChofer = "Nombre\tApellido\tDireccion\tSalario\tEdad\tEmail";
	String datosEmpresa = "Empresa\tDireccion\tRFC\tWWW";
	String datosVehiculo = datosChofer + "\t" + datosEmpresa + "\t" + "Marca\tModelo\tMatricula\tColor";
	
	public void datosChofer(Chofer chofer) {
		datosChofer+="\n-------------------------------------------------------------------------------"
				+ "-----------------------------------------------------\n";
		// Concatenar la Información de Objetos Chofer
		datosChofer += chofer.getnNombre() + "\t" + chofer.getApellido() + "\t"
		+ chofer.getDireccion() + "\t" + chofer.getSalario() + "\t" + chofer.getEdad() + "\t" + chofer.getEmail() + "\n";
		
		// Colocar la Informacion de datosChofer en salida
		
		salida.setText(datosChofer);
		
		// Colocar la informacion de Salida en JOptionpane
		
		JOptionPane.showMessageDialog(null, salida, "Reporte - Chofer", JOptionPane.INFORMATION_MESSAGE);
				
	}
	
	public void datosEmpresa(Empresa empresa) {
		datosEmpresa+="\n-------------------------------------------------------------------------------"
				+ "-----------------------------------------------------\n";
		datosEmpresa+=empresa.getNombre() + "\t" + empresa.getDireccion() + "\t" + empresa.getRfc() + "\t" + empresa.getWww() + "\n";
		
		salida.setText(datosEmpresa);
		
		JOptionPane.showMessageDialog(null, salida, "Reporte - Empresa" , JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void datosVehiculo(Vehiculo vehiculo) {
		datosVehiculo+="\n-------------------------------------------------------------------------------"
				+ "------------------------------------------------------------------------------------"
				+ "------------------------------------------------------------------------------------\n";
		
		// Concatenar la información de Vehiculo
		datosVehiculo += vehiculo.getChofer().getnNombre() + "\t"  
					   + vehiculo.getChofer().getApellido() + "\t"  
					   + vehiculo.getChofer().getDireccion() + "\t"  
					   + vehiculo.getChofer().getSalario() + "\t"  
					   + vehiculo.getChofer().getEdad() + "\t"  
					   + vehiculo.getChofer().getEmail() + "\t"
					   + vehiculo.getEmpresa().getNombre() + "\t"
					   + vehiculo.getEmpresa().getDireccion() + "\t"
					   + vehiculo.getEmpresa().getRfc() + "\t"
					   + vehiculo.getEmpresa().getWww() + "\t"
					   + vehiculo.getMarca() + "\t"
					   + vehiculo.getModelo() + "\t"
					   + vehiculo.getMatricula() + "\t"
					   + vehiculo.getColor() + "\n";
		
		// Colocar la informacion de datosVehiculo en salida
		
		salida.setText(datosVehiculo);
		
		// Colocar la información de salida en JOptionPane
		
		JOptionPane.showMessageDialog(null, salida, "Reporte - Vehiculo", JOptionPane.INFORMATION_MESSAGE);
		
		
	}

}
