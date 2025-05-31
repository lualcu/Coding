package serializable;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Consulta {
    JTextArea salida=new JTextArea();
    String datos="Matricula\tMarca\tModelo\n";
    public void consultaDeportivo(){
     datos+="---------------------------------\n";
     try (ObjectInputStream fichero = new ObjectInputStream(new FileInputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/deportivo.txt"))){
        //EOF end of file
        while(true){
        Vehiculo aux =(Vehiculo)fichero.readObject();
        datos+=aux.getMatricula()+"\t"+aux.getMarca()+"\t"+aux.getModelo()+"\n";
        }
      }catch(ClassNotFoundException exc){ 
        JOptionPane.showMessageDialog(null,"error");
      }catch (EOFException exc) {
        salida.setText(datos);
        JOptionPane.showMessageDialog(null,salida,"Datos Vehiculo",JOptionPane.INFORMATION_MESSAGE);
     }catch(IOException exc){
        JOptionPane.showMessageDialog(null,"Error de apertura del archivo","ERROR",JOptionPane.ERROR_MESSAGE);
    }
    }
}
