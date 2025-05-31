package polimorfismo.persona;

import java.awt.Image;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class Fichero {
	
	public void almacenaEstudiante(Estudiante e) {
		
		Image img = new ImageIcon("src/general.icons/AVISO.png").getImage();
		ImageIcon icon= new ImageIcon(img.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
			
			FileOutputStream fichero = null;
			File arch = new File("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/poliestudiante.txt");
			ObjectOutputStream archivo = null;
			
			try {
				
				//TODO ES ABRIR EL FLUJO 
				if(arch.exists()) 
				{
					// True -> Agrega la Nueva Información al Archivo
					fichero = new FileOutputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/poliestudiante.txt", true);
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
					fichero = new FileOutputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/poliestudiante.txt");
					// Cambia el Archivo a Objeto para Serializar 
					archivo = new ObjectOutputStream(fichero);
				}
				
				//Con el Flujo Abierto guarda la información del Objeto
				
				archivo.writeObject(e);
				
				//Cierra el Fichero para evitar dañarlo
				archivo.close();
				
				JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente", "Ingresa Datos", JOptionPane.INFORMATION_MESSAGE, icon);
			}catch(IOException exc) {
				JOptionPane.showMessageDialog(null, exc.getMessage(), "Error de Archivo", JOptionPane.INFORMATION_MESSAGE);
				
			}
				
	}
	
	public void almacenaMaestro(Maestro m) {
		
		Image img = new ImageIcon("src/general.icons/AVISO.png").getImage();
		ImageIcon icon= new ImageIcon(img.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
			
			FileOutputStream fichero = null;
			File arch = new File("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/polimaestro.txt");
			ObjectOutputStream archivo = null;
			
			try {
				
				//TODO ES ABRIR EL FLUJO 
				if(arch.exists()) 
				{
					// True -> Agrega la Nueva Información al Archivo
					fichero = new FileOutputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/polimaestro.txt", true);
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
					fichero = new FileOutputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/polimaestro.txt");
					// Cambia el Archivo a Objeto para Serializar 
					archivo = new ObjectOutputStream(fichero);
				}
				
				//Con el Flujo Abierto guarda la información del Objeto
				
				archivo.writeObject(m);
				
				//Cierra el Fichero para evitar dañarlo
				archivo.close();
				
				JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente", "Ingresa Datos", JOptionPane.INFORMATION_MESSAGE, icon);
			}catch(IOException exc) {
				JOptionPane.showMessageDialog(null, exc.getMessage(), "Error de Archivo", JOptionPane.INFORMATION_MESSAGE);
				
			}
				
	}
	
	public void almacenaDirectivo(Directivo d) {
		
		Image img = new ImageIcon("src/general.icons/AVISO.png").getImage();
		ImageIcon icon= new ImageIcon(img.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
			
			FileOutputStream fichero = null;
			File arch = new File("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/polidirectivo.txt");
			ObjectOutputStream archivo = null;
			
			try {
				
				//TODO ES ABRIR EL FLUJO 
				if(arch.exists()) 
				{
					// True -> Agrega la Nueva Información al Archivo
					fichero = new FileOutputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/polidirectivo.txt", true);
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
					fichero = new FileOutputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/polidirectivo.txt");
					// Cambia el Archivo a Objeto para Serializar 
					archivo = new ObjectOutputStream(fichero);
				}
				
				//Con el Flujo Abierto guarda la información del Objeto
				
				archivo.writeObject(d);
				
				//Cierra el Fichero para evitar dañarlo
				archivo.close();
				
				JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente", "Ingresa Datos", JOptionPane.INFORMATION_MESSAGE, icon);
			}catch(IOException exc) {
				JOptionPane.showMessageDialog(null, exc.getMessage(), "Error de Archivo", JOptionPane.INFORMATION_MESSAGE);
				
			}
				
	}

}
