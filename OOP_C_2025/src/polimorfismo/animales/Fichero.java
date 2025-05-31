package polimorfismo.animales;

import java.awt.Image;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Fichero {
	
	public void almacenaAguila(Aguila a) {
		
		Image img = new ImageIcon("src/general.icons/AVISO.png").getImage();
		ImageIcon icon= new ImageIcon(img.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
			
			FileOutputStream fichero = null;
			File arch = new File("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/poliaguila.txt");
			ObjectOutputStream archivo = null;
			
			try {
				
				//TODO ES ABRIR EL FLUJO 
				if(arch.exists()) 
				{
					// True -> Agrega la Nueva Información al Archivo
					fichero = new FileOutputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/poliaguila.txt", true);
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
					fichero = new FileOutputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/poliaguila.txt");
					// Cambia el Archivo a Objeto para Serializar 
					archivo = new ObjectOutputStream(fichero);
				}
				
				//Con el Flujo Abierto guarda la información del Objeto
				
				archivo.writeObject(a);
				
				//Cierra el Fichero para evitar dañarlo
				archivo.close();
				
				JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente", "Ingresa Datos", JOptionPane.INFORMATION_MESSAGE, icon);
			}catch(IOException exc) {
				JOptionPane.showMessageDialog(null, exc.getMessage(), "Error de Archivo", JOptionPane.INFORMATION_MESSAGE);
				
			}
				
	}
	
	public void almacenaTortuga(Tortuga t) {
		
		Image img = new ImageIcon("src/general.icons/AVISO.png").getImage();
		ImageIcon icon= new ImageIcon(img.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
			
			FileOutputStream fichero = null;
			File arch = new File("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/politortuga.txt");
			ObjectOutputStream archivo = null;
			
			try {
				
				//TODO ES ABRIR EL FLUJO 
				if(arch.exists()) 
				{
					// True -> Agrega la Nueva Información al Archivo
					fichero = new FileOutputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/politortuga.txt", true);
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
					fichero = new FileOutputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/politortuga.txt");
					// Cambia el Archivo a Objeto para Serializar 
					archivo = new ObjectOutputStream(fichero);
				}
				
				//Con el Flujo Abierto guarda la información del Objeto
				
				archivo.writeObject(t);
				
				//Cierra el Fichero para evitar dañarlo
				archivo.close();
				
				JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente", "Ingresa Datos", JOptionPane.INFORMATION_MESSAGE, icon);
			}catch(IOException exc) {
				JOptionPane.showMessageDialog(null, exc.getMessage(), "Error de Archivo", JOptionPane.INFORMATION_MESSAGE);
				
			}
				
	}
	
	public void almacenaDelfin(Delfin d) {
		
		Image img = new ImageIcon("src/general.icons/AVISO.png").getImage();
		ImageIcon icon= new ImageIcon(img.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
			
			FileOutputStream fichero = null;
			File arch = new File("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/polidelfin.txt");
			ObjectOutputStream archivo = null;
			
			try {
				
				//TODO ES ABRIR EL FLUJO 
				if(arch.exists()) 
				{
					// True -> Agrega la Nueva Información al Archivo
					fichero = new FileOutputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/polidelfin.txt", true);
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
					fichero = new FileOutputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/polidelfin.txt");
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
	
	public void almacenaPerro(Perro p) {
		
		Image img = new ImageIcon("src/general.icons/AVISO.png").getImage();
		ImageIcon icon= new ImageIcon(img.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
			
			FileOutputStream fichero = null;
			File arch = new File("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/poliperro.txt");
			ObjectOutputStream archivo = null;
			
			try {
				
				//TODO ES ABRIR EL FLUJO 
				if(arch.exists()) 
				{
					// True -> Agrega la Nueva Información al Archivo
					fichero = new FileOutputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/poliperro.txt", true);
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
					fichero = new FileOutputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/poliperro.txt");
					// Cambia el Archivo a Objeto para Serializar 
					archivo = new ObjectOutputStream(fichero);
				}
				
				//Con el Flujo Abierto guarda la información del Objeto
				
				archivo.writeObject(p);
				
				//Cierra el Fichero para evitar dañarlo
				archivo.close();
				
				JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente", "Ingresa Datos", JOptionPane.INFORMATION_MESSAGE, icon);
			}catch(IOException exc) {
				JOptionPane.showMessageDialog(null, exc.getMessage(), "Error de Archivo", JOptionPane.INFORMATION_MESSAGE);
				
			}
				
	}
	

}
