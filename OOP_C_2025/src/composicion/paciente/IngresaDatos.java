package composicion.paciente;

import javax.swing.JOptionPane;

public class IngresaDatos {
	MuestraDatos m = new MuestraDatos();
	
	public Medico ingresaMedico() {
		String name, apellido, direccion, email, especialidad;
		int edad,cedula;
		double salario;
		
		name = JOptionPane.showInputDialog(null, "Ingresa Nombre: ", "Nombre - Medico", JOptionPane.INFORMATION_MESSAGE);
		apellido = JOptionPane.showInputDialog(null, "Ingresa Apellido: ", "Apellido - Medico", JOptionPane.INFORMATION_MESSAGE);
		direccion = JOptionPane.showInputDialog(null, "Ingresa Direccion: ", "Direccion - Medico", JOptionPane.INFORMATION_MESSAGE);
		email = JOptionPane.showInputDialog(null, "Ingresa Email: ", "Email - Medico", JOptionPane.INFORMATION_MESSAGE);
		especialidad = JOptionPane.showInputDialog(null, "Ingresa Especialidad: ", "Especialidad - Medico", JOptionPane.INFORMATION_MESSAGE);
		
		edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Edad: ", "Edad - Medico", JOptionPane.INFORMATION_MESSAGE));
		cedula = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Cedula: ", "Cedula - Medico", JOptionPane.INFORMATION_MESSAGE));
		
		salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa Salario: ", "Salario - Medico", JOptionPane.INFORMATION_MESSAGE));
		
		Medico med = new Medico(name,apellido,direccion,email,edad,salario,cedula,especialidad);
		
		m.datosMedico(med);
		
		return med;
	}
	public Hospital ingresaHospital() {
		String name, rfc, direccion, www, telefono;
		
		
		name = JOptionPane.showInputDialog(null, "Ingresa Nombre: ", "Nombre - Hospital", JOptionPane.INFORMATION_MESSAGE);
		rfc = JOptionPane.showInputDialog(null, "Ingresa RFC: ", "RFC - Hospital", JOptionPane.INFORMATION_MESSAGE);
		direccion = JOptionPane.showInputDialog(null, "Ingresa Direccion: ", "Direccion - Hospital", JOptionPane.INFORMATION_MESSAGE);
		www = JOptionPane.showInputDialog(null, "Ingresa WWW: ", "WWW - Hospital", JOptionPane.INFORMATION_MESSAGE);
		telefono = JOptionPane.showInputDialog(null, "Ingresa Telefono: ", "Telefono - Hospital", JOptionPane.INFORMATION_MESSAGE);
		
		Hospital h = new Hospital(name,direccion,rfc,www,telefono);
		
		m.datosHospital(h);
		
		return h;
	}
	public Paciente ingresaPaciente(Medico medico, Hospital hospital) {
		String name, padecimiento, direccion, nss, email, phone;
		
		
		name = JOptionPane.showInputDialog(null, "Ingresa Nombre: ", "Nombre - Paciente", JOptionPane.INFORMATION_MESSAGE);
		padecimiento = JOptionPane.showInputDialog(null, "Ingresa Apellido: ", "RFC - Paciente", JOptionPane.INFORMATION_MESSAGE);
		direccion = JOptionPane.showInputDialog(null, "Ingresa Direccion: ", "Direccion - Paciente", JOptionPane.INFORMATION_MESSAGE);
		nss = JOptionPane.showInputDialog(null, "Ingresa NSS: ", "NSS - Paciente", JOptionPane.INFORMATION_MESSAGE);
		email = JOptionPane.showInputDialog(null, "Ingresa Email: ", "Email - Paciente", JOptionPane.INFORMATION_MESSAGE);
		phone = JOptionPane.showInputDialog(null, "Ingresa Telefono: ", "Telefono - Paciente", JOptionPane.INFORMATION_MESSAGE);
		
		
		Paciente pac = new Paciente(medico, hospital, name, direccion, padecimiento, nss, email, phone);
		
		m.datosPaciente(pac);
		
		return pac;
	}
	

}
