package herencia.animal;

import java.awt.Image;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Consulta {
	Image img = new ImageIcon("src/general.icons/MASCOTA.png").getImage();
	ImageIcon icon= new ImageIcon(img.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	JTextArea salida=new JTextArea();
    
    public void consultaCan(){
     String datos="Nombre\tPeso\tEdad\tAlimento\tHabitat\n";
     datos+="------------------------------------------------------------\n";
     try (ObjectInputStream fichero = new ObjectInputStream(new FileInputStream
    		 ("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/canino.txt"))){
        //EOF end of file
        while(true){
        Canino aux =(Canino)fichero.readObject();
        datos+=aux.getNombre() + "\t" + aux.getPeso() + "\t" + aux.getEdad() 
        + "\t" + aux.getAlimento() + "\t" + aux.getHabitat() + "\n";
        }
      }catch(ClassNotFoundException exc){ 
        JOptionPane.showMessageDialog(null,"error");
      }catch (EOFException exc) {
        salida.setText(datos);
        JOptionPane.showMessageDialog(null,salida,"Reporte - Caninos",
        		JOptionPane.INFORMATION_MESSAGE, icon);
     }catch(IOException exc){
        JOptionPane.showMessageDialog(null,"Error de apertura del archivo"
        		,"ERROR",JOptionPane.ERROR_MESSAGE);
    }
    }

}
