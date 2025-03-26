package composicion.paciente;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MuestraDatos {
	
	JTextArea salida = new JTextArea();
	String datosMedico = "Nombre\tApellido\tDireccion\tEdad\tCedula\tEspecialidad\tSalario\tEmail";
	String datosHospital = "Nombre\tDireccion\tRFC\tWWW\tTelefono";
	
	
	public void datosMedico(Medico medico) {
		datosMedico+="\n-------------------------------------------------------------------------------"
				+ "-----------------------------------------------------\n";
		datosMedico += medico.getName() + "\t" + medico.getApellido() + "\t" + medico.getDireccion() + "\t" + medico.getEdad() + "\t" + medico.getCedula() + "\t" + medico.getEspecialidad() + "\t" + medico.getSalario() + "\t" + medico.getEmail() + "\n";
		salida.setText(datosMedico);
		
		JOptionPane.showMessageDialog(null, salida, "Reporte - Medico", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void datosHospital(Hospital hospital) {
		datosHospital += "\n-------------------------------------------------------------------------------"
				+ "-----------------------------------------------------\n";
		datosHospital += hospital.getName() + "\t" + hospital.getDireccion() + "\t" + hospital.getRfc() + "\t" + hospital.getWeb() + "\t" + hospital.getPhone() + "\n";
		salida.setText(datosHospital);
		
		JOptionPane.showMessageDialog(null, salida, "Reporte - Hospital", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void datosPaciente(Paciente paciente) {
		String datosPaciente = "Nombre\tDireccion\tRFC\tWWW\tTelefono";
				
		datosPaciente += "\n-------------------------------------------------------------------------------"
				+ "--------------------------------------------------\n";
		
		datosPaciente += paciente.getHospital().getName() + "\t"
				   	   + paciente.getHospital().getDireccion() + "\t"
				   	   + paciente.getHospital().getRfc() + "\t"
				   	   + paciente.getHospital().getWeb() + "\t"
				   	   + paciente.getHospital().getPhone() + "\n";
		
		datosPaciente += "\n-------------------------------------------------------------------------------"
				+ "--------------------------------------------------\n";
		
		datosPaciente += "Nombre\tApellido\tDireccion\tEdad\tCedula\tEspecialidad\tSalario\tEmail";
		
		datosPaciente += paciente.getMedico().getName() + "\t"
					   + paciente.getMedico().getApellido() + "\t"
					   + paciente.getMedico().getDireccion() + "\t"
					   + paciente.getMedico().getEdad() + "\t"
					   + paciente.getMedico().getCedula() + "\t"
					   + paciente.getMedico().getEspecialidad() + "\t"
					   + paciente.getMedico().getSalario() + "\t"
					   + paciente.getMedico().getEmail() + "\n";
		
		datosPaciente += "\n-------------------------------------------------------------------------------"
				+ "--------------------------------------------------\n";
		
		datosPaciente += "\tNombre\tDireccion\tPadecimiento\tNSS\tEmail\tTelefono";
					   
				
					   
		datosPaciente += paciente.getName() + "\t"
					   + paciente.getDireccion() + "\t"
					   + paciente.getPadecimiento() + "\t"
					   + paciente.getNss() + "\t"
					   + paciente.getEmail() + "\t"
					   + paciente.getPhone() + "\n";
		
		
		
		salida.setText(datosPaciente);
		
		JOptionPane.showMessageDialog(null, salida, "Reporte - Paciente", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
