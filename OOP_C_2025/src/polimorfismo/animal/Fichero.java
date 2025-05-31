package polimorfismo.animal;

import java.awt.Image;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class Fichero {
	
	public void almacenaLobo(Lobo l) {
		
		Image img = new ImageIcon("src/general.icons/AVISO.png").getImage();
		ImageIcon icon= new ImageIcon(img.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
			
			FileOutputStream fichero = null;
			File arch = new File("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/polilobo.txt");
			ObjectOutputStream archivo = null;
			
			try {
				
				//TODO ES ABRIR EL FLUJO 
				if(arch.exists()) 
				{
					// True -> Agrega la Nueva Información al Archivo
					fichero = new FileOutputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/polilobo.txt", true);
					// Cambia el Archivo a Objeto para Serializar 
					archivo = new ObjectOutputStream(fichero) 
					{@Override 
						protected void writeStreamHeader() throws IOException
						{
						}
					};
				}
				else {
					// NO True -> Destruye y Pone un Nuevo deportivo.txt
					fichero = new FileOutputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/polilobo.txt");
					// Cambia el Archivo a Objeto para Serializar 
					archivo = new ObjectOutputStream(fichero);
				}
				
				//Con el Flujo Abierto guarda la información del Objeto
				
				archivo.writeObject(l);
				
				//Cierra el Fichero para evitar dañarlo
				archivo.close();
				
				JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente", "Ingresa Datos", JOptionPane.INFORMATION_MESSAGE, icon);
			}catch(IOException exc) {
				JOptionPane.showMessageDialog(null, exc.getMessage(), "Error de Archivo", JOptionPane.INFORMATION_MESSAGE);
				
			}
				
	}
	
	public void almacenaZorro(Zorro z) {
		
		Image img = new ImageIcon("src/general.icons/AVISO.png").getImage();
		ImageIcon icon= new ImageIcon(img.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
			
			FileOutputStream fichero = null;
			File arch = new File("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/polizorro.txt");
			ObjectOutputStream archivo = null;
			
			try {
				
				//TODO ES ABRIR EL FLUJO 
				if(arch.exists()) 
				{
					// True -> Agrega la Nueva Información al Archivo
					fichero = new FileOutputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/polizorro.txt", true);
					// Cambia el Archivo a Objeto para Serializar 
					archivo = new ObjectOutputStream(fichero) 
					{@Override 
						protected void writeStreamHeader() throws IOException
						{
						}
					};
				}
				else {
					// NO True -> Destruye y Pone un Nuevo deportivo.txt
					fichero = new FileOutputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/polizorro.txt");
					// Cambia el Archivo a Objeto para Serializar 
					archivo = new ObjectOutputStream(fichero);
				}
				
				//Con el Flujo Abierto guarda la información del Objeto
				
				archivo.writeObject(z);
				
				//Cierra el Fichero para evitar dañarlo
				archivo.close();
				
				JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente", "Ingresa Datos", JOptionPane.INFORMATION_MESSAGE, icon);
			}catch(IOException exc) {
				JOptionPane.showMessageDialog(null, exc.getMessage(), "Error de Archivo", JOptionPane.INFORMATION_MESSAGE);
				
			}
				
	}

}
