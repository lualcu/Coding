package herencia.vehiculo2;

import java.awt.Image;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;



public class Consulta {
	
	Image img = new ImageIcon("src/general.icons/LANCHA.png").getImage();
	ImageIcon icon= new ImageIcon(img.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	Image img2 = new ImageIcon("src/general.icons/AVION.png").getImage();
	ImageIcon icon2= new ImageIcon(img2.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	Image img3 = new ImageIcon("src/general.icons/JEEP.png").getImage();
	ImageIcon icon3= new ImageIcon(img3.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	JTextArea salida = new JTextArea();
	
	public void consultaAcuatico() {
		 String datos= "Nombre\tMarca\tModelo\tColor\tPrecio\tVelocidad\tEmpresa\tRuta\n";
	     datos+="------------------------------------------------------------------------------------------\n";
	     try (ObjectInputStream fichero = new ObjectInputStream(new FileInputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/acuatico.txt"))){
	        //EOF end of file
	        while(true){
	        Acuatico aux =(Acuatico)fichero.readObject();
	        datos+=aux.getNombre() + "\t" + aux.getMarca() + "\t" + aux.getModelo() + "\t" + aux.getColor() + "\t" + aux.getPrecio() + "\t" + aux.getVelocidad() + "\t" + aux.getEmpresa() + "\t " + aux.getRuta() + "\n";
	        }
	      }catch(ClassNotFoundException exc){ 
	        JOptionPane.showMessageDialog(null,"error");
	      }catch (EOFException exc) {
	        salida.setText(datos);
	        JOptionPane.showMessageDialog(null,salida,"Reporte - Acuatico",JOptionPane.INFORMATION_MESSAGE, icon);
	     }catch(IOException exc){
	        JOptionPane.showMessageDialog(null,"Error de apertura del archivo","ERROR",JOptionPane.ERROR_MESSAGE);
	     }
	 }
	
	public void consultaAereo() {
		 String datos= "Nombre\tMarca\tModelo\tColor\tPrecio\tVelocidad\tCapacidad\tCategoria\n";
	     datos+="------------------------------------------------------------------------------------------\n";
	     try (ObjectInputStream fichero = new ObjectInputStream(new FileInputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/aereo.txt"))){
	        //EOF end of file
	        while(true){
	        Aereo aux =(Aereo)fichero.readObject();
	        datos+=aux.getNombre() + "\t" + aux.getMarca() + "\t" + aux.getModelo() + "\t" + aux.getColor() + "\t" + aux.getPrecio() + "\t" + aux.getVelocidad() + "\t" + aux.getCapacidad() + "\t " + aux.getCategoria()  + "\n";
	        }
	      }catch(ClassNotFoundException exc){ 
	        JOptionPane.showMessageDialog(null,"error");
	      }catch (EOFException exc) {
	        salida.setText(datos);
	        JOptionPane.showMessageDialog(null,salida,"Reporte - Aereo",JOptionPane.INFORMATION_MESSAGE, icon2);
	     }catch(IOException exc){
	        JOptionPane.showMessageDialog(null,"Error de apertura del archivo","ERROR",JOptionPane.ERROR_MESSAGE);
	     }
	 }
	
	public void consultaTerrestre() {
		 String datos= "Nombre\tMarca\tModelo\tColor\tPrecio\tVelocidad\tTipo\n";
	     datos+="------------------------------------------------------------------------------------------\n";
	     try (ObjectInputStream fichero = new ObjectInputStream(new FileInputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/terrestre.txt"))){
	        //EOF end of file
	        while(true){
	        Terrestre aux =(Terrestre)fichero.readObject();
	        datos+=aux.getNombre() + "\t" + aux.getMarca() + "\t" + aux.getModelo() + "\t" + aux.getColor() + "\t" + aux.getPrecio() + "\t" + aux.getVelocidad() + "\t" + aux.getTipo() + "\n";
	        }
	      }catch(ClassNotFoundException exc){ 
	        JOptionPane.showMessageDialog(null,"error");
	      }catch (EOFException exc) {
	        salida.setText(datos);
	        JOptionPane.showMessageDialog(null,salida,"Reporte - Terrestre",JOptionPane.INFORMATION_MESSAGE, icon3);
	     }catch(IOException exc){
	        JOptionPane.showMessageDialog(null,"Error de apertura del archivo","ERROR",JOptionPane.ERROR_MESSAGE);
	     }
	 }
	

}
