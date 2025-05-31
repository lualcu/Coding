package polimorfismo.animal;

import java.awt.Image;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;



public class Consulta {
	
	Image img = new ImageIcon("src/general.icons/LOBO.png").getImage();
	ImageIcon icon= new ImageIcon(img.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	Image img2 = new ImageIcon("src/general.icons/ZORRO.png").getImage();
	ImageIcon icon2= new ImageIcon(img2.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

	
	JTextArea salida = new JTextArea();
	
	public void muestraLobo() {
		String datos = "Nombre\tPeso\tEdad\tHabitat\tAlimento\tRaza\tTamaño\tOrigen\n";
		datos += "-------------------------------------------------------------"
				+ "-----------------------------------\n";
		
		try (ObjectInputStream fichero = new ObjectInputStream(
				new FileInputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/polilobo.txt"))){
	        //EOF end of file
	        while(true){
		        Lobo aux =(Lobo)fichero.readObject();
		        datos += aux.getNombre() + "\t" + aux.getPeso() + "\t" + aux.getEdad() + "\t"
		        + aux.getHabitat() + "\t" + aux.getAlimento() + "\t" + aux.getRaza()+ "\t" + aux.getTamaño()
		        +"\t" + aux.getOrigen() + "\n";	
	        }
	      }catch(ClassNotFoundException exc){ 
	        JOptionPane.showMessageDialog(null,"error");
	      }catch (EOFException exc) {
	        salida.setText(datos);
	        JOptionPane.showMessageDialog(null,salida,"Reporte - Lobo",JOptionPane.INFORMATION_MESSAGE, icon);
	     }catch(IOException exc){
	        JOptionPane.showMessageDialog(null,"Error de apertura del archivo","ERROR",JOptionPane.ERROR_MESSAGE);
	     }
		
	}
	
	public void muestraZorro() {
		String datos = "Nombre\tPeso\tEdad\tHabitat\tAlimento\tRaza\tTamaño\tLongevidad\n";
		datos += "-------------------------------------------------------------"
				+ "-----------------------------------\n";
		
		try (ObjectInputStream fichero = new ObjectInputStream(
				new FileInputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/polizorro.txt"))){
	        //EOF end of file
	        while(true){
		        Zorro aux =(Zorro)fichero.readObject();
		        datos += aux.getNombre() + "\t" + aux.getPeso() + "\t" + aux.getEdad() + "\t"
		        + aux.getHabitat() + "\t" + aux.getAlimento() + "\t" + aux.getRaza()+ "\t" + aux.getTamaño()
		        +"\t" + aux.getLongevidad() + "\n";	
	        }
	      }catch(ClassNotFoundException exc){ 
	        JOptionPane.showMessageDialog(null,"error");
	      }catch (EOFException exc) {
	        salida.setText(datos);
	        JOptionPane.showMessageDialog(null,salida,"Reporte - Zorro",JOptionPane.INFORMATION_MESSAGE, icon2);
	     }catch(IOException exc){
	        JOptionPane.showMessageDialog(null,"Error de apertura del archivo","ERROR",JOptionPane.ERROR_MESSAGE);
	     }
		
	}

}
