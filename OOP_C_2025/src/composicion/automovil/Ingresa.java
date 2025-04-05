package composicion.automovil;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ingresa {
	
	Imprime i = new Imprime();
	
	Image imgPreg = new ImageIcon("src/general.icons/PREGUNTA.png").getImage();
	ImageIcon preg= new ImageIcon(imgPreg.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	public Motor ingresaMotor() {
		String cilindros, caballos, potencia, fabricante, origen;
		int identificacion;
		
		cilindros = (String)JOptionPane.showInputDialog(null, "Ingresa Cilindros: ", "Motor", 
							JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		caballos = (String)JOptionPane.showInputDialog(null, "Ingresa Caballos: ", "Motor", 
							JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		potencia = (String)JOptionPane.showInputDialog(null, "Ingresa Potencia: ", "Motor", 
							JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		fabricante = (String)JOptionPane.showInputDialog(null, "Ingresa Fabricante: ", "Motor", 
							JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		origen = (String)JOptionPane.showInputDialog(null, "Ingresa Origen: ", "Motor", 
							JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		
		identificacion = Integer.parseInt((String)JOptionPane.showInputDialog(null, 
				"Ingresa Identificacion: ", "Motor", JOptionPane.INFORMATION_MESSAGE, 
				preg, null,null));
		
		
		Motor motor = new Motor(cilindros,caballos,potencia,fabricante,origen,identificacion);
		
		i.datosMotor(motor);
		
		return motor;
	}
	
	public Stereo ingresaStereo() {
		int serie;
		String marca, puertoUSB, potencia;
		
		serie = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Serie: ", 
						"Stereo", JOptionPane.INFORMATION_MESSAGE, preg, null,null));
		
		marca = (String)JOptionPane.showInputDialog(null, "Ingresa Marca: ", "Stereo", 
						JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		puertoUSB = (String)JOptionPane.showInputDialog(null, "Ingresa Puerto USB: ", "Stereo", 
							JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		potencia = (String)JOptionPane.showInputDialog(null, "Ingresa Potencia: ", "Stereo", 
							JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		
		Stereo stereo = new Stereo(serie,marca,puertoUSB,potencia);
		
		i.datosStereo(stereo);
		
		return stereo;
		
	}
	
	public Automovil ingresaAutomovil(Motor motor, Stereo stereo) {
		String marca,modelo,rendimiento,combustible;
		int capacidad,numPuertas,bolsasSeguridad;
		
		marca = (String)JOptionPane.showInputDialog(null, "Ingresa Marca: ", "Automóvil", 
						JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		modelo = (String)JOptionPane.showInputDialog(null, "Ingresa Modelo: ", "Automóvil", 
						JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		rendimiento = (String)JOptionPane.showInputDialog(null, "Ingresa Rendimiento: ", 
						"Automóvil", JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		combustible = (String)JOptionPane.showInputDialog(null, "Ingresa Combustible: ", 
						"Automóvil", JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		
		capacidad = Integer.parseInt((String)JOptionPane.showInputDialog(null, 
				"Ingresa Capacidad: ", "Automóvil", JOptionPane.INFORMATION_MESSAGE, 
				preg, null,null));
		numPuertas = Integer.parseInt((String)JOptionPane.showInputDialog(null, 
				"Ingresa Numero de Puertas: ", "Automóvil", JOptionPane.INFORMATION_MESSAGE, 
				preg, null,null));
		bolsasSeguridad = Integer.parseInt((String)JOptionPane.showInputDialog(null, 
				"Ingresa Bolsas de Seguridad: ", "Automóvil", JOptionPane.INFORMATION_MESSAGE, 
				preg, null,null));
		
		Automovil auto = new Automovil(motor, 
									   stereo, 
									   marca,
									   modelo,
									   rendimiento,
									   combustible,
									   capacidad,
									   numPuertas,
									   bolsasSeguridad);
		
		i.datosAuto(auto);
		
		return auto;
		
	}

}
