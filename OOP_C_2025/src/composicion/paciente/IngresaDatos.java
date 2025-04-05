package composicion.paciente;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class IngresaDatos {
	MuestraDatos m = new MuestraDatos();
	
	Image imgPreg = new ImageIcon("src/general.icons/PREGUNTA.png").getImage();
	ImageIcon preg= new ImageIcon(imgPreg.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	public Medico ingresaMedico() {
		String name, apellido, direccion, email, especialidad;
		int edad,cedula;
		double salario;
		
		
		name = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre: ", 
				"Nombre - Medico", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		apellido = (String)JOptionPane.showInputDialog(null, "Ingresa Apellido: ", 
				"Apellido - Medico", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		direccion = (String)JOptionPane.showInputDialog(null, "Ingresa Direccion: ",
				"Direccion - Medico", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		email = (String)JOptionPane.showInputDialog(null, "Ingresa Email: ",
				"Email - Medico", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		especialidad = (String)JOptionPane.showInputDialog(null, "Ingresa Especialidad: ",
				"Especialidad - Medico", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		
		edad = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Edad: ",
				"Edad - Medico", JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		cedula = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Cedula: ", 
				"Cedula - Medico", JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		
		salario = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Salario: ",
				"Salario - Medico", JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		
		Medico med = new Medico(name,apellido,direccion,email,edad,salario,cedula,especialidad);
		
		m.datosMedico(med);
		
		return med;
	}
	public Hospital ingresaHospital() {
		String name, rfc, direccion, www, telefono;
		
		
		name = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre: ", 
				"Nombre - Hospital", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		rfc = (String)JOptionPane.showInputDialog(null, "Ingresa RFC: ", 
				"RFC - Hospital", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		direccion = (String)JOptionPane.showInputDialog(null, "Ingresa Direccion: ", 
				"Direccion - Hospital", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		www = (String)JOptionPane.showInputDialog(null, "Ingresa WWW: ",
				"WWW - Hospital", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		telefono = (String)JOptionPane.showInputDialog(null, "Ingresa Telefono: ", 
				"Telefono - Hospital", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		
		Hospital h = new Hospital(name,direccion,rfc,www,telefono);
		
		m.datosHospital(h);
		
		return h;
	}
	public Paciente ingresaPaciente(Medico medico, Hospital hospital) {
		String name, padecimiento, direccion, nss, email, phone;
		
		
		name = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre: ", 
				"Nombre - Paciente", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		padecimiento = (String)JOptionPane.showInputDialog(null, "Ingresa Apellido: ",
				"RFC - Paciente", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		direccion = (String)JOptionPane.showInputDialog(null, "Ingresa Direccion: ", 
				"Direccion - Paciente", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		nss = (String)JOptionPane.showInputDialog(null, "Ingresa NSS: ", 
				"NSS - Paciente", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		email = (String)JOptionPane.showInputDialog(null, "Ingresa Email: ",
				"Email - Paciente", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		phone = (String)JOptionPane.showInputDialog(null, "Ingresa Telefono: ",
				"Telefono - Paciente", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		
		
		Paciente pac = new Paciente(medico, 
									hospital, 
									name, 
									direccion,
									padecimiento,
									nss, 
									email, 
									phone);
		
		m.datosPaciente(pac);
		
		return pac;
	}
	

}
