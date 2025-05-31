package polimorfismo.vehiculo2;

import java.awt.Image;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import herencia.vehiculo2.Acuatico;

public class ImprimeDatos {
	
	
	Image img = new ImageIcon("src/general.icons/DEPORTIVO.png").getImage();
	ImageIcon icon= new ImageIcon(img.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	Image img2 = new ImageIcon("src/general.icons/CARRO.png").getImage();
	ImageIcon icon2= new ImageIcon(img2.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	Image img3 = new ImageIcon("src/general.icons/FURGONETA.png").getImage();
	ImageIcon icon3= new ImageIcon(img3.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	JTextArea salida = new JTextArea();
	
	
	
	
	public void muestraDeportivo() {
		
		String datosDeportivo = "Marca\tModelo\tMatricula\tCilindros\n";
		datosDeportivo += "---------------------------------------------\n";
		
		try (ObjectInputStream fichero = new ObjectInputStream(new FileInputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/polideportivo.txt"))){
	        //EOF end of file
	        while(true){
		        Deportivo aux =(Deportivo)fichero.readObject();
		        datosDeportivo += aux.getMarca() + "\t" + aux.getModelo() + "\t" + aux.getMatricula() + "\t"
		        + aux.getNcilindros() + "\n";	
	        }
	      }catch(ClassNotFoundException exc){ 
	        JOptionPane.showMessageDialog(null,"error");
	      }catch (EOFException exc) {
	        salida.setText(datosDeportivo);
	        JOptionPane.showMessageDialog(null,salida,"Reporte - Deportivo",JOptionPane.INFORMATION_MESSAGE, icon);
	     }catch(IOException exc){
	        JOptionPane.showMessageDialog(null,"Error de apertura del archivo","ERROR",JOptionPane.ERROR_MESSAGE);
	     }
	
		
	}
	
	public void muestraFamiliar() {
		
		String datosFamiliar = "Marca\tModelo\tMatricula\tPuertas\n";
		datosFamiliar += "---------------------------------------------\n";
		try (ObjectInputStream fichero = new ObjectInputStream(new FileInputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/polifamiliar.txt"))){
	        //EOF end of file
	        while(true){
		        Familiar aux =(Familiar)fichero.readObject();
		        datosFamiliar += aux.getMarca() + "\t" + aux.getModelo() + "\t" + aux.getMatricula() + "\t"
		        + aux.getnPuertas() + "\n";	
	        }
	      }catch(ClassNotFoundException exc){ 
	        JOptionPane.showMessageDialog(null,"error");
	      }catch (EOFException exc) {
	        salida.setText(datosFamiliar);
	        JOptionPane.showMessageDialog(null,salida,"Reporte - Familiar",JOptionPane.INFORMATION_MESSAGE, icon2);
	     }catch(IOException exc){
	        JOptionPane.showMessageDialog(null,"Error de apertura del archivo","ERROR",JOptionPane.ERROR_MESSAGE);
	     }
	
		
	}
	
	public void muestraCarga() {
		
		String datosCarga = "Marca\tModelo\tMatricula\tCarga\tDepartamento\n";
		datosCarga += "----------------------------------------------------------\n";
		
		try (ObjectInputStream fichero = new ObjectInputStream(new FileInputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/policarga.txt"))){
	        //EOF end of file
	        while(true){
		        Carga aux =(Carga)fichero.readObject();
		        datosCarga += aux.getMarca() + "\t" + aux.getModelo() + "\t" + aux.getMatricula() + "\t"
		        + aux.getCapacidadCarga() + "\t" + aux.getDepartamento() + "\n";
	        }
	      }catch(ClassNotFoundException exc){ 
	        JOptionPane.showMessageDialog(null,"error");
	      }catch (EOFException exc) {
	        salida.setText(datosCarga);
	        JOptionPane.showMessageDialog(null,salida,"Reporte - Carga",JOptionPane.INFORMATION_MESSAGE, icon3);
	     }catch(IOException exc){
	        JOptionPane.showMessageDialog(null,"Error de apertura del archivo","ERROR",JOptionPane.ERROR_MESSAGE);
	     }
		

		
	}
	
	


}
