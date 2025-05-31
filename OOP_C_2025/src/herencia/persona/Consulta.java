package herencia.persona;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Consulta {
	
	JTextArea salida = new JTextArea();
	
	String datosEstudiante = "Nombre\tApellido\tEdad\tSexo\tEscuela\tPromedio\n";
	String datosMaestro = "Nombre\tApellido\tEdad\tSexo\tGrado\tSalario\n";
	String datosDirectivo = "Nombre\tApellido\tEdad\tSexo\tPuesto\tDepartamento\n";
	
	Image imgEst = new ImageIcon(getClass().getResource(
			"/general.icons/ESTUDIANTE.png")).getImage();
	ImageIcon est = new ImageIcon(imgEst.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Image imgMae = new ImageIcon(getClass().getResource(
			"/general.icons/MAESTRO.png")).getImage();
	ImageIcon mae= new ImageIcon(imgMae.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Image imgDir = new ImageIcon(getClass().getResource(
			"/general.icons/DIRECTIVO.png")).getImage();
	ImageIcon dir = new ImageIcon(imgDir.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	
	
	public void consultaEstudiante(Estudiante e) {
		if(e.getNombre() != null) {
			datosEstudiante += "-----------------------------------"
					+ "-------------------------------------------\n";
			
			datosEstudiante += e.getNombre() + "\t" + e.getApellido() +
					"\t" + e.getEdad() + "\t" + e.getSexo() + "\t" + 
					e.getEscuela() + "\t" + e.getPromedio() + "\n";
			
			
		}
		salida.setText(datosEstudiante);
		JOptionPane.showMessageDialog(null, salida, "Reporte - Estudiante", 
				JOptionPane.INFORMATION_MESSAGE, est);
				
	}
	
	public void consultaMaestro(Maestro m) {
		if(m.getNombre() != null) {
			datosMaestro += "-------------------------------------"
					+ "-------------------------------------------\n";
			
			datosMaestro += m.getNombre() + "\t" + m.getApellido() 
			+ "\t" + m.getEdad() + "\t" + m.getSexo() + "\t" + 
					m.getGrado() + "\t" + m.getSalario() + "\n";
			
			
		}
		salida.setText(datosMaestro);
		JOptionPane.showMessageDialog(null, salida, "Reporte - Maestro",
				JOptionPane.INFORMATION_MESSAGE, mae);
				
	}
	
	public void consultaDirectivo(Directivo d) {
		if(d.getNombre() != null) {
			datosDirectivo += "-----------------------------------"
					+ "-------------------------------------------\n";
			
			datosDirectivo += d.getNombre() + "\t" + d.getApellido()
			+ "\t" + d.getEdad() + "\t" + d.getSexo() + "\t" + 
					d.getPuesto() + "\t" + d.getDepartamento() + "\n";
			
			
		}
		salida.setText(datosDirectivo);
		JOptionPane.showMessageDialog(null, salida, "Reporte - Directivo",
				JOptionPane.INFORMATION_MESSAGE, dir);
				
	}
	
	
	
	

}
