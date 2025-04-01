package composicion.automovil;

import javax.swing.JOptionPane;

public class Ingresa {
	
	Imprime i = new Imprime();
	
	public Motor ingresaMotor() {
		String cilindros, caballos, potencia, fabricante, origen;
		int identificacion;
		
		cilindros = JOptionPane.showInputDialog(null, "Ingresa Cilindros: ", "Motor", JOptionPane.INFORMATION_MESSAGE);
		caballos = JOptionPane.showInputDialog(null, "Ingresa Caballos: ", "Motor", JOptionPane.INFORMATION_MESSAGE);
		potencia = JOptionPane.showInputDialog(null, "Ingresa Potencia: ", "Motor", JOptionPane.INFORMATION_MESSAGE);
		fabricante = JOptionPane.showInputDialog(null, "Ingresa Fabricante: ", "Motor", JOptionPane.INFORMATION_MESSAGE);
		origen = JOptionPane.showInputDialog(null, "Ingresa Origen: ", "Motor", JOptionPane.INFORMATION_MESSAGE);
		
		identificacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Identificacion: ", "Motor", JOptionPane.INFORMATION_MESSAGE));
		
		
		Motor motor = new Motor(cilindros,caballos,potencia,fabricante,origen,identificacion);
		
		i.datosMotor(motor);
		
		return motor;
	}
	
	public Stereo ingresaStereo() {
		int serie;
		String marca, puertoUSB, potencia;
		
		serie = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Serie: ", "Stereo", JOptionPane.INFORMATION_MESSAGE));
		
		marca = JOptionPane.showInputDialog(null, "Ingresa Marca: ", "Stereo", JOptionPane.INFORMATION_MESSAGE);
		puertoUSB = JOptionPane.showInputDialog(null, "Ingresa Puerto USB: ", "Stereo", JOptionPane.INFORMATION_MESSAGE);
		potencia = JOptionPane.showInputDialog(null, "Ingresa Potencia: ", "Stereo", JOptionPane.INFORMATION_MESSAGE);
		
		Stereo stereo = new Stereo(serie,marca,puertoUSB,potencia);
		
		i.datosStereo(stereo);
		
		return stereo;
		
	}
	
	public Automovil ingresaAutomovil(Motor motor, Stereo stereo) {
		String marca,modelo,rendimiento,combustible;
		int capacidad,numPuertas,bolsasSeguridad;
		
		marca = JOptionPane.showInputDialog(null, "Ingresa Marca: ", "Automóvil", JOptionPane.INFORMATION_MESSAGE);
		modelo = JOptionPane.showInputDialog(null, "Ingresa Modelo: ", "Automóvil", JOptionPane.INFORMATION_MESSAGE);
		rendimiento = JOptionPane.showInputDialog(null, "Ingresa Rendimiento: ", "Automóvil", JOptionPane.INFORMATION_MESSAGE);
		combustible = JOptionPane.showInputDialog(null, "Ingresa Combustible: ", "Automóvil", JOptionPane.INFORMATION_MESSAGE);
		
		capacidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Capacidad: ", "Automóvil", JOptionPane.INFORMATION_MESSAGE));
		numPuertas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Numero de Puertas: ", "Automóvil", JOptionPane.INFORMATION_MESSAGE));
		bolsasSeguridad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Bolsas de Seguridad: ", "Automóvil", JOptionPane.INFORMATION_MESSAGE));
		
		Automovil auto = new Automovil(motor, stereo, marca,modelo,rendimiento,combustible,capacidad,numPuertas,bolsasSeguridad);
		
		i.datosAuto(auto);
		
		return auto;
		
	}

}
