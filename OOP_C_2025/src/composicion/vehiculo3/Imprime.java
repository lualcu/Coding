package composicion.vehiculo3;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Imprime {
	
	JTextArea salida = new JTextArea();
	String datosChofer = "Nombre\tApellido\tDireccion\tSalario\tEdad\tEmail";
	String datosEmpresa = "Empresa\tDireccion\tRFC\tWWW";
	String datosVehiculo = "Marca\tModelo\tMatricula\tColor";
	
	Image imgEmp = new ImageIcon(getClass().getResource("/general.icons/EMPRESA.png")).getImage();
	ImageIcon emp =  new ImageIcon(imgEmp.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Image imgCho = new ImageIcon(getClass().getResource("/general.icons/CHOFER.png")).getImage();
	ImageIcon cho= new ImageIcon(imgCho.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Image imgAuto = new ImageIcon(getClass().getResource("/general.icons/CARRO.png")).getImage();
	ImageIcon au= new ImageIcon(imgAuto.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	public void datosChofer(Chofer chofer) {
		String datosChofe = datosChofer;
		datosChofe+="\n-------------------------------------------------------"
				+ "-----------------------------------\n";
		// Concatenar la Información de Objetos Chofer
		datosChofe += chofer.getnNombre() + "\t" + chofer.getApellido() + "\t"
		+ chofer.getDireccion() + "\t" + chofer.getSalario() + "\t" + chofer.getEdad() + 
		"\t" + chofer.getEmail() + "\n";
		
		// Colocar la Informacion de datosChofer en salida
		
		salida.setText(datosChofe);
		
		// Colocar la informacion de Salida en JOptionpane
		
		JOptionPane.showMessageDialog(null, salida, "Reporte - Chofer", 
				JOptionPane.INFORMATION_MESSAGE, cho);
				
	}
	
	public void datosEmpresa(Empresa empresa) {
		String datosEmpres = datosEmpresa;
		datosEmpres+="\n-------------------------------------------------------"
				+ "-----------------------------------\n";
		datosEmpres+=empresa.getNombre() + "\t" + empresa.getDireccion() + "\t" +
				empresa.getRfc() + "\t" + empresa.getWww() + "\n";
		
		salida.setText(datosEmpres);
		
		JOptionPane.showMessageDialog(null, salida, "Reporte - Empresa" , 
				JOptionPane.INFORMATION_MESSAGE, emp);
	}
	
	public void datosVehiculo(Vehiculo vehiculo) {
		String linea ="-------------------------------------------------------"
				+ "-----------------------------------\n";
		
		// Concatenar la información de Vehiculo
		String datoVehiculo = datosChofer+ "\n" + linea 
					   + vehiculo.getChofer().getnNombre() + "\t"  
					   + vehiculo.getChofer().getApellido() + "\t"  
					   + vehiculo.getChofer().getDireccion() + "\t"  
					   + vehiculo.getChofer().getSalario() + "\t"  
					   + vehiculo.getChofer().getEdad() + "\t"  
					   + vehiculo.getChofer().getEmail() + "\n\n"
					   + datosEmpresa + "\n" + linea
					   + vehiculo.getEmpresa().getNombre() + "\t"
					   + vehiculo.getEmpresa().getDireccion() + "\t"
					   + vehiculo.getEmpresa().getRfc() + "\t"
					   + vehiculo.getEmpresa().getWww() + "\n\n"
					   + datosVehiculo + "\n" + linea
					   + vehiculo.getMarca() + "\t"
					   + vehiculo.getModelo() + "\t"
					   + vehiculo.getMatricula() + "\t"
					   + vehiculo.getColor() + "\n";
		
		// Colocar la informacion de datosVehiculo en salida
		
		salida.setText(datoVehiculo);
		
		// Colocar la información de salida en JOptionPane
		
		JOptionPane.showMessageDialog(null, salida, "Reporte - Vehiculo",
				JOptionPane.INFORMATION_MESSAGE,au);
		
		
	}

}
