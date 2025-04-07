package composicion.empleados;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MuestraDatos {
	JTextArea salida = new JTextArea();
	
	Image imgEmp = new ImageIcon("src/general.icons/EMPLEADOS.png").getImage();
	ImageIcon emp= new ImageIcon(imgEmp.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	String datos = "Nombre\tApellido\tEdad\tSexo\tPeso\tEmpresa\tOcupacion\tOrigen\tSalario\tCorreo\n";
	public void muestraDatos(Empleado e) {
		
		datos += "------------------------------------------------------------"
				+ "-----------------------------------------------------------\n";
		//Concatenar los elementos del objeto e
		datos += e.nombre + "\t" + e.apellido + "\t" + e.edad + "\t" + e.sexo + "\t" + e.peso
				+ "\t" + e.empresa + "\t" + e.ocupacion + "\t" + e.origen + "\t" 
				+ e.salario + "\t" + e.correo + "\n";
		
		//Colocar la variable datos en el JTextArea
		salida.setText(datos);
		
		//Colocar Salida en JOptionPane
		JOptionPane.showMessageDialog(null, salida, "Reporte - Empleados", 
				JOptionPane.INFORMATION_MESSAGE, emp);
		
		e.atender();
		e.surtir();
		e.preparar();
		e.administrar();
		e.cobrar();
	}
}
