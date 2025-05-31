package polimorfismo.seleccionfutbol2;

import java.awt.Image;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import polimorfismo.vehiculo2.Deportivo;

public class Consulta {
	
	Image img = new ImageIcon("src/general.icons/JUGADOR.png").getImage();
	ImageIcon icon= new ImageIcon(img.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	Image img2 = new ImageIcon("src/general.icons/ENTRENADOR.png").getImage();
	ImageIcon icon2= new ImageIcon(img2.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	Image img3 = new ImageIcon("src/general.icons/TERAPEUTA.png").getImage();
	ImageIcon icon3= new ImageIcon(img3.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	JTextArea salida = new JTextArea();
	
	public void muestraFutbolista() {
		
		String datosDeportivo = "ID\tNombre\tApellido\tPeso\tEdad\tPosicion\tNumero\tSalario\tAltura\n";
		datosDeportivo += "----------------------------------------------------------"
				+ "---------------------------------------------------------------\n";
		
		try (ObjectInputStream fichero = new ObjectInputStream(new FileInputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/polifutbolista.txt"))){
	        //EOF end of file
	        while(true){
		        Futbolista aux =(Futbolista)fichero.readObject();
		        datosDeportivo += aux.getNombre() + "\t" + aux.getId() + "\t" + aux.getNombre()
		        + "\t" + aux.getApellido() + "\t" + aux.getPeso() + "\t" + aux.getEdad()
		        + "\t" + aux.getPosicion() + "\t" + aux.getNumero() + "\t" + aux.getSalario()
		        + "\t" + aux.getAltura() + "\n";
		    }
	      }catch(ClassNotFoundException exc){ 
	        JOptionPane.showMessageDialog(null,"error");
	      }catch (EOFException exc) {
	        salida.setText(datosDeportivo);
	        JOptionPane.showMessageDialog(null,salida,"Reporte - Futbolista",JOptionPane.INFORMATION_MESSAGE, icon);
	     }catch(IOException exc){
	        JOptionPane.showMessageDialog(null,"Error de apertura del archivo","ERROR",JOptionPane.ERROR_MESSAGE);
	     }	
	}
	
	public void muestraMasajista() {
		
		String datosDeportivo = "ID\tNombre\tApellido\tPeso\tEdad\tEspecialidad\tExperiencia\tEmail\tTelefono\n";
		datosDeportivo += "----------------------------------------------------------"
				+ "---------------------------------------------------------------\n";
		
		try (ObjectInputStream fichero = new ObjectInputStream(new FileInputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/polimasajista.txt"))){
	        //EOF end of file
	        while(true){
		        Masajista aux =(Masajista)fichero.readObject();
		        datosDeportivo += aux.getNombre() + "\t" + aux.getId() + "\t" + aux.getNombre()
		        + "\t" + aux.getApellido() + "\t" + aux.getPeso() + "\t" + aux.getEdad()
		        + "\t" + aux.getEspecialidad() + "\t" + aux.getExperiencia() + "\t" + aux.getEmail()
		        + "\t" + aux.getTelefono() + "\n";
		    }
	      }catch(ClassNotFoundException exc){ 
	        JOptionPane.showMessageDialog(null,"error");
	      }catch (EOFException exc) {
	        salida.setText(datosDeportivo);
	        JOptionPane.showMessageDialog(null,salida,"Reporte - Masajista",JOptionPane.INFORMATION_MESSAGE, icon2);
	     }catch(IOException exc){
	        JOptionPane.showMessageDialog(null,"Error de apertura del archivo","ERROR",JOptionPane.ERROR_MESSAGE);
	     }	
	}
	
	public void muestraEntrenador() {
		
		String datosDeportivo = "ID\tNombre\tApellido\tPeso\tEdad\tID Federacion\tCampeonatos\tEquipos\tAuxiliares\n";
		datosDeportivo += "----------------------------------------------------------"
				+ "---------------------------------------------------------------\n";
		
		try (ObjectInputStream fichero = new ObjectInputStream(new FileInputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/polientrenador.txt"))){
	        //EOF end of file
	        while(true){
		        Entrenador aux =(Entrenador)fichero.readObject();
		        datosDeportivo += aux.getNombre() + "\t" + aux.getId() + "\t" + aux.getNombre()
		        + "\t" + aux.getApellido() + "\t" + aux.getPeso() + "\t" + aux.getEdad()
		        + "\t" + aux.getIdFederacion() + "\t" + aux.getCampeonatos() + "\t" + aux.getEquipos()
		        + "\t" + aux.getAuxiliares() + "\n";
		    }
	      }catch(ClassNotFoundException exc){ 
	        JOptionPane.showMessageDialog(null,"error");
	      }catch (EOFException exc) {
	        salida.setText(datosDeportivo);
	        JOptionPane.showMessageDialog(null,salida,"Reporte - Entrenador",JOptionPane.INFORMATION_MESSAGE, icon3);
	     }catch(IOException exc){
	        JOptionPane.showMessageDialog(null,"Error de apertura del archivo","ERROR",JOptionPane.ERROR_MESSAGE);
	     }	
	}

}
