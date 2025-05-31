package herencia.seleccionfutbol;

import java.awt.Image;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class Consulta {
	Image img = new ImageIcon("src/general.icons/JUGADOR.png").getImage();
	ImageIcon icon= new ImageIcon(img.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	Image img2 = new ImageIcon("src/general.icons/ENTRENADOR.png").getImage();
	ImageIcon icon2= new ImageIcon(img2.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	Image img3 = new ImageIcon("src/general.icons/TERAPEUTA.png").getImage();
	ImageIcon icon3= new ImageIcon(img3.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	JTextArea salida=new JTextArea();
    
    public void consultaFutbolista(){
     String datos="Nombre\tApellido\tID\tEdad\tPeso\tPosicion\tNumero\n";
     datos+="------------------------------------------------------------------------------------------\n";
     try (ObjectInputStream fichero = new ObjectInputStream(new FileInputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/futbolista.txt"))){
        //EOF end of file
        while(true){
        Futbolista aux =(Futbolista)fichero.readObject();
        datos+=aux.getNombre() + "\t" + aux.getApellido() + "\t" + aux.getId() + "\t" + aux.getEdad() + "\t" + aux.getPeso() + "\t" + aux.getPosicion() + "\t" + aux.getNumero() + "\n";
        }
      }catch(ClassNotFoundException exc){ 
        JOptionPane.showMessageDialog(null,"error");
      }catch (EOFException exc) {
        salida.setText(datos);
        JOptionPane.showMessageDialog(null,salida,"Reporte - Futbolista",JOptionPane.INFORMATION_MESSAGE, icon);
     }catch(IOException exc){
        JOptionPane.showMessageDialog(null,"Error de apertura del archivo","ERROR",JOptionPane.ERROR_MESSAGE);
    }
    }
    
    public void consultaMasajista(){
        String datos="Nombre\tApellido\tID\tEdad\tPeso\tEspecialidad\tExperiencia\n";
        datos+="------------------------------------------------------------------------------------------\n";
        try (ObjectInputStream fichero = new ObjectInputStream(new FileInputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/masajista.txt"))){
           //EOF end of file
           while(true){
           Masajista aux =(Masajista)fichero.readObject();
           datos+=aux.getNombre() + "\t" + aux.getApellido() + "\t" + aux.getId() + "\t" + aux.getEdad() + "\t" + aux.getPeso() + "\t" + aux.getEspecialidad() + "\t" + aux.getExperiencia() + "\n";
           }
         }catch(ClassNotFoundException exc){ 
           JOptionPane.showMessageDialog(null,"error");
         }catch (EOFException exc) {
           salida.setText(datos);
           JOptionPane.showMessageDialog(null,salida,"Reporte - Masajista",JOptionPane.INFORMATION_MESSAGE, icon3);
        }catch(IOException exc){
           JOptionPane.showMessageDialog(null,"Error de apertura del archivo","ERROR",JOptionPane.ERROR_MESSAGE);
       }
       }
    
    public void consultaEntrenador(){
        String datos="Nombre\tApellido\tID\tEdad\tPeso\tIdFederacionn\n";
        datos+="------------------------------------------------------------------------------------------\n";
        try (ObjectInputStream fichero = new ObjectInputStream(new FileInputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/entrenador.txt"))){
           //EOF end of file
           while(true){
           Entrenador aux =(Entrenador)fichero.readObject();
           datos+=aux.getNombre() + "\t" + aux.getApellido() + "\t" + aux.getId() + "\t" + aux.getEdad() + "\t" + aux.getPeso() + "\t" + aux.getIdFederacion() + "\n";
           }
         }catch(ClassNotFoundException exc){ 
           JOptionPane.showMessageDialog(null,"error");
         }catch (EOFException exc) {
           salida.setText(datos);
           JOptionPane.showMessageDialog(null,salida,"Reporte - Entrenador",JOptionPane.INFORMATION_MESSAGE, icon2);
        }catch(IOException exc){
           JOptionPane.showMessageDialog(null,"Error de apertura del archivo","ERROR",JOptionPane.ERROR_MESSAGE);
       }
    }
}
