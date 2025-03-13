package composicion.empleados;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MuestraDatos {
	JTextArea salida = new JTextArea();
	String datos = "Nombre\tApellido\tEdad\tSexo\tPeso\tEmpresa\tOcupacion\tOrigen\tSalario\tCorreo\n";
	public void muestraDatos(Empleado e) {
		
		datos += "----------------------------------------------------"
				+ "---------------------------------------------------\n";
		//Concatenar los elementos del objeto e
		datos += e.nombre + "\t" + e.apellido + "\t" + e.edad + "\t" + e.sexo + "\t" + e.peso
				+ "\t" + e.empresa + "\t" + e.ocupacion + "\t" + e.origen + "\t" + e.salario + "\t" + e.correo + "\n";
		
		//Colocar la variable datos en el JTextArea
		salida.setText(datos);
		
		//Colocar Salida en JOptionPane
		JOptionPane.showMessageDialog(null, salida, "Reporte - Empleados", JOptionPane.INFORMATION_MESSAGE);
		
	}
}
