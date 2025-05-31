package polimorfismo.animales;

import java.awt.Image;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Consulta {
	
	Image img = new ImageIcon("src/general.icons/AGUILA.png").getImage();
	ImageIcon icon= new ImageIcon(img.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	Image img2 = new ImageIcon("src/general.icons/TORTUGA.png").getImage();
	ImageIcon icon2= new ImageIcon(img2.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	Image img3 = new ImageIcon("src/general.icons/DELFIN.png").getImage();
	ImageIcon icon3= new ImageIcon(img3.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	Image img4 = new ImageIcon("src/general.icons/PERRO.png").getImage();
	ImageIcon icon4= new ImageIcon(img4.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

	
	JTextArea salida = new JTextArea();
	
	public void muestraAguila() {
		String datos = "Nombre\tPeso\tEdad\tSexo\tHabitat\tTamaño\tEspecie\tGarras\tVista\n";
		datos += "-------------------------------------------------------------------"
				+ "-----------------------------------------\n";
		
		try (ObjectInputStream fichero = new ObjectInputStream(
				new FileInputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/poliaguila.txt"))){
	        //EOF end of file
	        while(true){
		        Aguila aux =(Aguila)fichero.readObject();
		        datos += aux.getNombre() + "\t" + aux.getPeso() + "\t" + aux.getEdad() + "\t"
		        + aux.getSexo() + "\t" + aux.getHabitat() + "\t" + aux.getTamaño()+ "\t" + aux.getEspecie()
		        +"\t" + aux.getGarras() +  "\t" + aux.getVista() + "\n";	
	        }
	      }catch(ClassNotFoundException exc){ 
	        JOptionPane.showMessageDialog(null,"error");
	      }catch (EOFException exc) {
	        salida.setText(datos);
	        JOptionPane.showMessageDialog(null,salida,"Reporte - Aguila",JOptionPane.INFORMATION_MESSAGE, icon);
	     }catch(IOException exc){
	        JOptionPane.showMessageDialog(null,"Error de apertura del archivo","ERROR",JOptionPane.ERROR_MESSAGE);
	     }
		
	}
	
	public void muestraTortuga() {
		String datos = "Nombre\tPeso\tEdad\tSexo\tHabitat\tTamaño\tEspecie\tLongevidad\n";
		datos += "-------------------------------------------------------------------"
				+ "-----------------------------------------\n";
		
		try (ObjectInputStream fichero = new ObjectInputStream(
				new FileInputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/politortuga.txt"))){
	        //EOF end of file
	        while(true){
		        Tortuga aux =(Tortuga)fichero.readObject();
		        datos += aux.getNombre() + "\t" + aux.getPeso() + "\t" + aux.getEdad() + "\t"
		        + aux.getSexo() + "\t" + aux.getHabitat() + "\t" + aux.getTamaño()+ "\t" + aux.getEspecie()
		        +"\t" + aux.getLongevidad() + "\n";	
	        }
	      }catch(ClassNotFoundException exc){ 
	        JOptionPane.showMessageDialog(null,"error");
	      }catch (EOFException exc) {
	        salida.setText(datos);
	        JOptionPane.showMessageDialog(null,salida,"Reporte - Tortuga",JOptionPane.INFORMATION_MESSAGE, icon2);
	     }catch(IOException exc){
	        JOptionPane.showMessageDialog(null,"Error de apertura del archivo","ERROR",JOptionPane.ERROR_MESSAGE);
	     }
		
	}
	
	public void muestraDelfin() {
		String datos = "Nombre\tPeso\tEdad\tSexo\tHabitat\tAlimentacion\tColor de Piel\tRegión\n";
		datos += "-------------------------------------------------------------------"
				+ "---------------------------------------\n";
		
		try (ObjectInputStream fichero = new ObjectInputStream(
				new FileInputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/polidelfin.txt"))){
	        //EOF end of file
	        while(true){
		        Delfin aux =(Delfin)fichero.readObject();
		        datos += aux.getNombre() + "\t" + aux.getPeso() + "\t" + aux.getEdad() + "\t"
		        + aux.getSexo() + "\t" + aux.getHabitat() + "\t" + aux.getAlimentacion()+ "\t" + aux.getColorPiel()
		        +"\t" + aux.getRegion() + "\n";	
	        }
	      }catch(ClassNotFoundException exc){ 
	        JOptionPane.showMessageDialog(null,"error");
	      }catch (EOFException exc) {
	        salida.setText(datos);
	        JOptionPane.showMessageDialog(null,salida,"Reporte - Delfin",JOptionPane.INFORMATION_MESSAGE, icon3);
	     }catch(IOException exc){
	        JOptionPane.showMessageDialog(null,"Error de apertura del archivo","ERROR",JOptionPane.ERROR_MESSAGE);
	     }
		
	}
	
	public void muestraPerro() {
		String datos = "Nombre\tPeso\tEdad\tSexo\tHabitat\tAlimentacion\tColor de Pelo\tRaza\n";
		datos += "-------------------------------------------------------------------"
				+ "-------------------------------------\n";
		
		try (ObjectInputStream fichero = new ObjectInputStream(
				new FileInputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/poliperro.txt"))){
	        //EOF end of file
	        while(true){
		        Perro aux =(Perro)fichero.readObject();
		        datos += aux.getNombre() + "\t" + aux.getPeso() + "\t" + aux.getEdad() + "\t"
		        + aux.getSexo() + "\t" + aux.getHabitat() + "\t" + aux.getAlimentacion()+ "\t" + aux.getColorPelo()
		        +"\t" + aux.getRaza() + "\n";	
	        }
	      }catch(ClassNotFoundException exc){ 
	        JOptionPane.showMessageDialog(null,"error");
	      }catch (EOFException exc) {
	        salida.setText(datos);
	        JOptionPane.showMessageDialog(null,salida,"Reporte - Perro",JOptionPane.INFORMATION_MESSAGE, icon4);
	     }catch(IOException exc){
	        JOptionPane.showMessageDialog(null,"Error de apertura del archivo","ERROR",JOptionPane.ERROR_MESSAGE);
	     }
		
	}

}
