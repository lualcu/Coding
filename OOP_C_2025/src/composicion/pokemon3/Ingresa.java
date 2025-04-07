package composicion.pokemon3;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ingresa {
	
	Imprime i = new Imprime();
	
	Image imgPreg = new ImageIcon(getClass().getResource("/general.icons/PREGUNTA.png")).getImage();
	ImageIcon preg= new ImageIcon(imgPreg.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	public Entrenador ingresaEntrenador() {
		String nombre, apellido, sexo;
		int edad, telefono, numPokemons, numMedallas;
		
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre:", 
				"Entrenador", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		apellido = (String)JOptionPane.showInputDialog(null, "Ingresa Apellido:", 
				"Entrenador", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		sexo = (String)JOptionPane.showInputDialog(null, "Ingresa Sexo:", 
				"Entrenador", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		edad = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Edad:", 
				"Entrenador", JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		telefono = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Telefon:", 
				"Entrenador", JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		numPokemons = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Num. Pokemons: ", 
				"Entrenador", JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		numMedallas = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Num. Medallas", 
				"Entrenador", JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		
		
		Entrenador entrenador = new Entrenador(nombre,
											   apellido,
											   sexo,
											   edad,
											   telefono,
											   numPokemons,
											   numMedallas);
		
		i.datosEntrenador(entrenador);
		return entrenador;
	}
	
	public Gimnasio ingresaGimnasio() {
		String nombre, lugar, propietario, superficie;
		int capacidad;
		
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre:", 
				"Gimnasio", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		lugar = (String)JOptionPane.showInputDialog(null, "Ingresa Lugar:", 
				"Gimnasio", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		propietario = (String)JOptionPane.showInputDialog(null, "Ingresa Propietario:",
				"Gimnasio", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		superficie = (String)JOptionPane.showInputDialog(null, "Ingresa Superficie:", 
				"Gimnasio", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		capacidad = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Capacidad:", 
				"Gimnasio", JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		
		Gimnasio gimnasio = new Gimnasio(nombre,
										 lugar,
										 propietario,
										 superficie,
										 capacidad);
		
		i.datosGimnasio(gimnasio);
		return gimnasio;
	}
	
	public void ingresaPokemon(Entrenador entrenador, Gimnasio gimnasio) {
		String nombre, tipo, poder, habitat, especie, evolucion;
		double peso, altura;
		
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre:", 
				"Pokemon", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		tipo = (String)JOptionPane.showInputDialog(null, "Ingresa Tipo:", 
				"Pokemon", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		poder = (String)JOptionPane.showInputDialog(null, "Ingresa Poder:", 
				"Pokemon", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		habitat = (String)JOptionPane.showInputDialog(null, "Ingresa Habitat:",
				"Pokemon", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		especie = (String)JOptionPane.showInputDialog(null, "Ingresa Especie:", 
				"Pokemon", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		evolucion = (String)JOptionPane.showInputDialog(null, "Ingresa Evolucion:", 
				"Pokemon", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		peso = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Peso:", 
				"Pokemon", JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		altura = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Altura:", 
				"Pokemon", JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		
		Pokemon pokemon = new Pokemon(gimnasio,
									  entrenador,
									  nombre,
									  tipo,
									  poder,
									  habitat,
									  especie,
									  evolucion,
									  peso,
									  altura);
		
		i.datosPokemon(pokemon);
	}

}
