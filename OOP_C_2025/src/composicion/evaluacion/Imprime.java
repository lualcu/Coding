package composicion.evaluacion;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Imprime {
	
	JTextArea salida = new JTextArea();
	
	Image imgCic = new ImageIcon(getClass().getResource("/general.icons/CICLISTA.png")).getImage();
	ImageIcon cic= new ImageIcon(imgCic.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	Image imgEnt = new ImageIcon(getClass().getResource("/general.icons/ENTRENADOR.png")).getImage();
	ImageIcon ent = new ImageIcon(imgEnt.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	Image imgTer = new ImageIcon(getClass().getResource("/general.icons/TERAPEUTA.png")).getImage();
	ImageIcon ter= new ImageIcon(imgTer.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	Image imgPai = new ImageIcon(getClass().getResource("/general.icons/PAIS.png")).getImage();
	ImageIcon pai= new ImageIcon(imgPai.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	String datosCiclista = "Nombre\tApellido\tEdad\tEquipo\tNumero\tEmail\tPatrocinador\tSalario\n";
	String datosEntrenador = "Nombre\tApellido\tEdad\tSexo\tTelefono\tEmail\tDireccion\tEquipo\tSalario\n";
	String datosTerapeuta = "Nombre\tEdad\tEmail\tDireccion\tSalario\n";
	String datosPais = "Nombre\tEquipo\tEspectadores\tRuta\tWWW\n";
	
	public void imprimeCiclista(Ciclista ciclista) {
		String datos = datosCiclista;
		
		datos += "---------------------------------------------------------------------"
			+ "---------------------------------------------------------------------\n";
		
		datos += ciclista.getNombre() + "\t" + 
				 ciclista.getApellido() + "\t" + 
				 ciclista.getEdad() + "\t" + 
				 ciclista.getEquipo() + "\t" + 
				 ciclista.getNumero() + "\t" + 
				 ciclista.getEmail() + "\t" + 
				 ciclista.getPatrocinador() + "\t" + 
				 ciclista.getSalario() + "\n";
		salida.setTabSize(12);
		salida.setText(datos);
		
		JOptionPane.showMessageDialog(null, salida, "Reporte - Ciclista", 
				JOptionPane.INFORMATION_MESSAGE, cic);
	}
	
	public void imprimeEntrenador(Entrenador entrenador) {
		String datos = datosEntrenador;
		
		datos += "---------------------------------------------------------------------"
		+ "---------------------------------------------------------------------------------------\n";
		
		datos += entrenador.getNombre() + "\t" + 
				 entrenador.getApellido() + "\t" + 
				 entrenador.getEdad() + "\t" + 
				 entrenador.getSexo() + "\t" + 
				 entrenador.getTelefono() + "\t" + 
				 entrenador.getEmail() + "\t" + 
				 entrenador.getDireccion() + "\t" + 
				 entrenador.getEquipo() + "\t" + 
				 entrenador.getSalario() + "\n";
		
		salida.setText(datos);
		
		JOptionPane.showMessageDialog(null, salida, "Reporte - Entrenador",
				JOptionPane.INFORMATION_MESSAGE, ent);
	}
	
	public void imprimeTerapeuta(Terapeuta terapeuta) {
		String datos = datosTerapeuta;
		
		datos += "------------------------------------------------------------------"
				+ "------------------\n";
		
		datos += terapeuta.getNombre() + "\t" + 
				 terapeuta.getEdad() + "\t" + 
				 terapeuta.getEmail() + "\t" + 
				 terapeuta.getDireccion() + "\t" + 
				 terapeuta.getSalario() + "\n";
		
		salida.setText(datos);
		
		JOptionPane.showMessageDialog(null, salida, "Reporte - Terapeuta", 
				JOptionPane.INFORMATION_MESSAGE, ter);
	}
	
	public void imprimePais(Pais pais) {
		String datos = "\t\t\t|| Ciclista ||\n" + datosCiclista;
		String linea = "-----------------------------------------------------------------------"
		+ "-------------------------------------------------------------------------------------\n";
		
		datos += linea;
		
		datos += pais.getCiclista().getNombre() + "\t" + 
				 pais.getCiclista().getApellido() + "\t" + 
				 pais.getCiclista().getEdad() + "\t" + 
				 pais.getCiclista().getEquipo() + "\t" + 
				 pais.getCiclista().getNumero() + "\t" + 
				 pais.getCiclista().getEmail() + "\t" + 
				 pais.getCiclista().getPatrocinador() + "\t" + 
				 pais.getCiclista().getSalario() + "\n";
		
		datos += linea;
		
		datos += "\t\t\t|| Entrenador ||\n" + datosEntrenador;
		
		datos += linea;
		
		datos += pais.getEntrenador().getNombre() + "\t" + 
				 pais.getEntrenador().getApellido() + "\t" + 
				 pais.getEntrenador().getEdad() + "\t" + 
				 pais.getEntrenador().getSexo() + "\t" + 
				 pais.getEntrenador().getTelefono() + "\t" + 
				 pais.getEntrenador().getEmail() + "\t" + 
				 pais.getEntrenador().getDireccion() + "\t" + 
				 pais.getEntrenador().getEquipo() + "\t" + 
				 pais.getEntrenador().getSalario() + "\n";
		
		datos += linea;
		
		datos += "\t\t\t|| Terapeuta ||\n" + datosTerapeuta;
		
		datos += linea;
		
		datos += pais.getTerapeuta().getNombre() + "\t" + 
				 pais.getTerapeuta().getEdad() + "\t" + 
				 pais.getTerapeuta().getEmail() + "\t" + 
				 pais.getTerapeuta().getDireccion() + "\t" + 
				 pais.getTerapeuta().getSalario() + "\n";
		
		datos += linea;
		
		datos += "\t\t\t|| Pais ||\n" + datosPais;
		
		datos += linea;
		
		datos += pais.getNombre() + "\t" + 
				 pais.getEquipo() + "\t" + 
				 pais.getEspectadores() + "\t" + 
				 pais.getRuta() + "\t" + 
				 pais.getWww() + "\n";
		
		salida.setText(datos);
		
		JOptionPane.showMessageDialog(null, salida, "Reporte - Pais",
				JOptionPane.INFORMATION_MESSAGE, pai);
		
	}
	

}
