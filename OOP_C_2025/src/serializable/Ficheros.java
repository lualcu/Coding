package serializable;

import java.io.*;

import javax.swing.JOptionPane;


public class Ficheros {
	
	public void almacenaDatos(Vehiculo v) {
		
		
		FileOutputStream fichero = null;
		File arch = new File("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/deportivo.txt");
		ObjectOutputStream archivo = null;
		
		try {
			
			//TODO ES ABRIR EL FLUJO 
			if(arch.exists()) 
			{
				// True -> Agrega la Nueva Información al Archivo
				fichero = new FileOutputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/deportivo.txt", true);
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
				fichero = new FileOutputStream("/Users/alexdelacueva/Desktop/JAVA/OOP/Ficheros/deportivo.txt");
				// Cambia el Archivo a Objeto para Serializar 
				archivo = new ObjectOutputStream(fichero);
			}
			
			//Con el Flujo Abierto guarda la información del Objeto
			
			archivo.writeObject(v);
			
			//Cierra el Fichero para evitar dañarlo
			archivo.close();
			
			JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente", "Ingresa Datos", JOptionPane.INFORMATION_MESSAGE);
		}catch(IOException exc) {
			JOptionPane.showMessageDialog(null, exc.getMessage(), "Error de Archivo", JOptionPane.INFORMATION_MESSAGE);
			
		}
			
	}
				
}


