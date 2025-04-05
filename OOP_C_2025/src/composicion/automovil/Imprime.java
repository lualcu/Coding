package composicion.automovil;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Imprime {
	
	JTextArea salida = new JTextArea();
	String datosMot = "Cilindros\tCaballos\tPotencia\t"
			+ "Fabricante\tIdentificacion\tOrigen\n";
	String datosSte = "Serie\tMarca\tPuerto USB\tPotencia\n";
	String datosAu = "Marca\tModelo\tRendimiento\tCapacidad\t"
			+ "Num. Puertas\tCombustible\tBolsas Seguridad\n";
	
	Image imgMotor = new ImageIcon("src/general.icons/MOTOR.png").getImage();
	ImageIcon mot =  new ImageIcon(imgMotor.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Image imgSte = new ImageIcon("src/general.icons/STEREO.png").getImage();
	ImageIcon ste= new ImageIcon(imgSte.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Image imgAuto = new ImageIcon("src/general.icons/CARRO.png").getImage();
	ImageIcon au= new ImageIcon(imgAuto.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	
	
	public void datosMotor(Motor motor) {
		String datosMotor = datosMot;
		datosMotor += "----------------------------------"
				+ "------------------------------------\n";
		
		datosMotor += motor.getCilindros() + "\t" + motor.getCaballos() + "\t" 
		+ motor.getPotencia() + "\t" + motor.getFabricante() + "\t" + 
		motor.getIdentificacion() + "\t" + motor.getOrigen() + "\n";
		
		salida.setText(datosMotor);
		
		JOptionPane.showMessageDialog(null, salida, "Reporte - Motor",
		JOptionPane.INFORMATION_MESSAGE, mot);
		
		
	}
	
	public void datosStereo(Stereo stereo) {
		String datosStereo = datosSte;
		datosStereo += "----------------------------------"
				+ "-------------------------\n";
		
		datosStereo += stereo.getSerie() + "\t" + stereo.getMarca() + "\t"
		+ stereo.getPuertoUSB() + "\t" + stereo.getPotencia() + "\n";
		
		salida.setText(datosStereo);
		
		JOptionPane.showMessageDialog(null, salida, "Reporte - Stereo", 
				JOptionPane.INFORMATION_MESSAGE, ste);
	}
	
	public void datosAuto(Automovil auto) {
		
		
		
		String datosAuto = "Motor\n" + datosMot;
		
		datosAuto += "------------------------------------------------"
				+ "-----------------------------------------------\n";
		
		datosAuto += auto.getMotor().getCilindros() + "\t"
					+ auto.getMotor().getCaballos() + "\t"
					+ auto.getMotor().getPotencia() + "\t"
					+ auto.getMotor().getFabricante() + "\t"
					+ auto.getMotor().getIdentificacion() + "\t"
					+ auto.getMotor().getOrigen() + "\n";
		
		datosAuto += "---------------------------------------------------"
				+ "--------------------------------------------\n";
		
		datosAuto += "Stereo\n" + datosSte;
		
		datosAuto += "---------------------------------------------------"
				+ "--------------------------------------------\n";
		
		datosAuto += auto.getStereo().getSerie() + "\t"
				   + auto.getStereo().getMarca() + "\t"
				   + auto.getStereo().getPuertoUSB() + "\t"
				   + auto.getStereo().getPotencia() + "\n";
		
		datosAuto += "---------------------------------------------------"
				+ "--------------------------------------------\n";
		
		datosAuto += "Automóvil\n" + datosAu;
		
		datosAuto += "----------------------------------------------------"
				+ "-------------------------------------------\n";
		
		datosAuto += auto.getMarca() + "\t"
				   + auto.getModelo() + "\t"
				   + auto.getRendimiento() + "\t"
				   + auto.getCapacidad() + "\t"
				   + auto.getNumPuertas() + "\t"
				   + auto.getCombustible() + "\t"
				   + auto.getBolsasSeguridad() + "\n";
		
		salida.setText(datosAuto);
		
		JOptionPane.showMessageDialog(null, salida, "Reporte - Automóvil", 
				JOptionPane.INFORMATION_MESSAGE,au);
		
		
		
	}
	
}
