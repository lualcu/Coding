package herencia.empleado;

import java.awt.Image;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import herencia.vehiculo2.Acuatico;

public class Consulta {
	
	Image img = new ImageIcon("src/general.icons/MANTENIMIENTO.png").getImage();
	ImageIcon icon= new ImageIcon(img.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	Image img2 = new ImageIcon("src/general.icons/INFORMATICO.png").getImage();
	ImageIcon icon2= new ImageIcon(img2.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	Image img3 = new ImageIcon("src/general.icons/DIRECTIVO.png").getImage();
	ImageIcon icon3= new ImageIcon(img3.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	JTextArea salida = new JTextArea();
	
	public void consultaMantenimiento() {
		 String datos= "Id\tNombre\tAp. Paterno\tAp. Materno\tEdad\tSexo\tDireccion"
		 		+ "\tSalario\tArea\n";
	     datos+="-------------------------------------------------------------------"
	     		+ "--------------------------------------------------------------\n";
	     try (ObjectInputStream fichero = new ObjectInputStream(new FileInputStream
	    		 ("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/mantenimiento.txt"))){
	        //EOF end of file
	        while(true){
	        Mantenimiento aux =(Mantenimiento)fichero.readObject();
	        datos+=aux.getId() + "\t" + aux.getNombre() + "\t" + aux.getApaterno()
	        + "\t" + aux.getAmaterno() + "\t" + aux.getEdad() + "\t" + aux.getSexo()
	        + "\t " + aux.getDireccion() + 
	        		"\t" + aux.getSalario() + "\t" + aux.getArea()+  "\n";
	        }
	      }catch(ClassNotFoundException exc){ 
	        JOptionPane.showMessageDialog(null,"error");
	      }catch (EOFException exc) {
	    	salida.setTabSize(10);
	        salida.setText(datos);
	        JOptionPane.showMessageDialog(null,salida,"Reporte - Mantenimiento",
	        		JOptionPane.INFORMATION_MESSAGE, icon);
	     }catch(IOException exc){
	        JOptionPane.showMessageDialog(null,"Error de apertura del archivo",
	        		"ERROR",JOptionPane.ERROR_MESSAGE);
	     }
	 }
	
	public void consultaInformatico() {
		 String datos= "Id\tNombre\tAp. Paterno\tAp. Materno\tEdad\tSexo"
		 		+ "\tDireccion\tSalario\tCorreo\tTelefono\n";
	     datos+="--------------------------------------------------------"
	     		+ "-----------------------------------------------------"
	     		+ "---------------------------------------\n";
	     try (ObjectInputStream fichero = new ObjectInputStream(new FileInputStream
	    		 ("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/informatico.txt"))){
	        //EOF end of file
	        while(true){
	        Informatico aux =(Informatico)fichero.readObject();
	        datos+=aux.getId() + "\t" + aux.getNombre() + "\t" + aux.getApaterno() 
	        + "\t" + aux.getAmaterno() + "\t" + aux.getEdad() + "\t" 
	        		+ aux.getSexo() + "\t " + aux.getDireccion() + 
	        		"\t" + aux.getSalario() + "\t" + aux.getCorreo()
	        		+ "\t" + aux.getTelefono() + "\n";
	        }
	      }catch(ClassNotFoundException exc){ 
	        JOptionPane.showMessageDialog(null,"error");
	      }catch (EOFException exc) {
	    	salida.setTabSize(10);
	        salida.setText(datos);
	        JOptionPane.showMessageDialog(null,salida,"Reporte - Informatico",
	        		JOptionPane.INFORMATION_MESSAGE, icon2);
	     }catch(IOException exc){
	        JOptionPane.showMessageDialog(null,"Error de apertura del archivo",
	        		"ERROR",JOptionPane.ERROR_MESSAGE);
	     }
	 }
	
	public void consultaDirector() {
		 String datos= "Id\tNombre\tAp. Paterno\tAp. Materno\tEdad\tSexo"
		 		+ "\tDireccion\tSalario\tBono\n";
	     datos+="--------------------------------------------------------------"
	     		+ "-------------------------------------------------------------"
	     		+ "------\n";
		 try (ObjectInputStream fichero = new ObjectInputStream(new FileInputStream
				 ("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/director.txt"))){
	        //EOF end of file
	        while(true){
	        Director aux =(Director)fichero.readObject();
	        datos+=aux.getId() + "\t" + aux.getNombre() + "\t" + aux.getApaterno() 
	        + "\t" + aux.getAmaterno() + "\t" + aux.getEdad() + "\t" 
	        		+ aux.getSexo() + "\t " + aux.getDireccion() + 
	        		"\t" + aux.getSalario() + "\t" + aux.getBono()+  "\n";
	        }
	      }catch(ClassNotFoundException exc){ 
	        JOptionPane.showMessageDialog(null,"error");
	      }catch (EOFException exc) {
	    	  salida.setTabSize(10);
	        salida.setText(datos);
	        JOptionPane.showMessageDialog(null,salida,"Reporte - Director",
	        		JOptionPane.INFORMATION_MESSAGE, icon3);
	     }catch(IOException exc){
	        JOptionPane.showMessageDialog(null,"Error de apertura del archivo",
	        		"ERROR",JOptionPane.ERROR_MESSAGE);
	     }
	 }

}
