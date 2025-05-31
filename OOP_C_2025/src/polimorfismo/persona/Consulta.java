package polimorfismo.persona;

import java.awt.Image;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class Consulta {
	
	Image img = new ImageIcon("src/general.icons/DEPORTIVO.png").getImage();
	ImageIcon icon= new ImageIcon(img.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	Image img2 = new ImageIcon("src/general.icons/CARRO.png").getImage();
	ImageIcon icon2= new ImageIcon(img2.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	Image img3 = new ImageIcon("src/general.icons/FURGONETA.png").getImage();
	ImageIcon icon3= new ImageIcon(img3.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	JTextArea salida = new JTextArea();
	
	public void muestraEstudiante() {
		
		String datos = "Nombre\tNacionalidad\tEdad\tSexo\tEscuela\tPromedio\tEmail\n";
		datos += "-----------------------------------------------------------------------------\n";
		
		try (ObjectInputStream fichero = new ObjectInputStream(
				new FileInputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/poliestudiante.txt"))){
	        //EOF end of file
	        while(true){
		        Estudiante aux =(Estudiante)fichero.readObject();
		        datos += aux.getNombre() + "\t" + aux.getNacionalidad() + "\t" + aux.getEdad() + "\t"
		        + aux.getSexo() + "\t" + aux.getEscuela() + "\t" + aux.getPromedio()+ "\t" + aux.getEmail() + "\n";	
	        }
	      }catch(ClassNotFoundException exc){ 
	        JOptionPane.showMessageDialog(null,"error");
	      }catch (EOFException exc) {
	        salida.setText(datos);
	        JOptionPane.showMessageDialog(null,salida,"Reporte - Estudiante",JOptionPane.INFORMATION_MESSAGE, icon);
	     }catch(IOException exc){
	        JOptionPane.showMessageDialog(null,"Error de apertura del archivo","ERROR",JOptionPane.ERROR_MESSAGE);
	     }
	}
	
	public void muestraMaestro() {
		
		String datos = "Nombre\tNacionalidad\tEdad\tSexo\tGrado\tSalario\tDireccion\tTelefono\n";
		datos += "-----------------------------------------------------------------------------\n";
		
		try (ObjectInputStream fichero = new ObjectInputStream(
				new FileInputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/polimaestro.txt"))){
	        //EOF end of file
	        while(true){
		        Maestro aux =(Maestro)fichero.readObject();
		        datos += aux.getNombre() + "\t" + aux.getNacionalidad() + "\t" + aux.getEdad() + "\t"
		        + aux.getSexo() + "\t" + aux.getGrado() + "\t" + aux.getSalario()+ "\t" + aux.getDireccion() + "\t" + 
		        		aux.getTelefono()+ "\n";	
	        }
	      }catch(ClassNotFoundException exc){ 
	        JOptionPane.showMessageDialog(null,"error");
	      }catch (EOFException exc) {
	        salida.setText(datos);
	        JOptionPane.showMessageDialog(null,salida,"Reporte - Maestro",JOptionPane.INFORMATION_MESSAGE, icon);
	     }catch(IOException exc){
	        JOptionPane.showMessageDialog(null,"Error de apertura del archivo","ERROR",JOptionPane.ERROR_MESSAGE);
	     }
	}
	
	public void muestraDirectivo() {
		
		String datos = "Nombre\tNacionalidad\tEdad\tSexo\tPuesto\tDepartamento\tTurno\tAntiguedad\n";
		datos += "-----------------------------------------------------------------------------\n";
		
		try (ObjectInputStream fichero = new ObjectInputStream(
				new FileInputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/polidirectivo.txt"))){
	        //EOF end of file
	        while(true){
		        Directivo aux =(Directivo)fichero.readObject();
		        datos += aux.getNombre() + "\t" + aux.getNacionalidad() + "\t" + aux.getEdad() + "\t"
		        + aux.getSexo() + "\t" + aux.getPuesto() + "\t" + aux.getDepartamento()+ "\t" + aux.getTurno() + "\t" + 
		        		aux.getAntiguedad()+ "\n";	
	        }
	      }catch(ClassNotFoundException exc){ 
	        JOptionPane.showMessageDialog(null,"error");
	      }catch (EOFException exc) {
	        salida.setText(datos);
	        JOptionPane.showMessageDialog(null,salida,"Reporte - Directivo",JOptionPane.INFORMATION_MESSAGE, icon);
	     }catch(IOException exc){
	        JOptionPane.showMessageDialog(null,"Error de apertura del archivo","ERROR",JOptionPane.ERROR_MESSAGE);
	     }
	}
	
	

}
