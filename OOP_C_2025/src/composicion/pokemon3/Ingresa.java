package composicion.pokemon3;

import javax.swing.JOptionPane;

public class Ingresa {
	
	Imprime i = new Imprime();
	
	public Entrenador ingresaEntrenador() {
		String nombre, apellido, sexo;
		int edad, telefono, numPokemons, numMedallas;
		
		nombre = JOptionPane.showInputDialog(null, "Ingresa Nombre:", "Entrenador", JOptionPane.INFORMATION_MESSAGE);
		apellido = JOptionPane.showInputDialog(null, "Ingresa Apellido:", "Entrenador", JOptionPane.INFORMATION_MESSAGE);
		sexo = JOptionPane.showInputDialog(null, "Ingresa Sexo:", "Entrenador", JOptionPane.INFORMATION_MESSAGE);
		edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Edad:", "Entrenador", JOptionPane.INFORMATION_MESSAGE));
		telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Telefon:", "Entrenador", JOptionPane.INFORMATION_MESSAGE));
		numPokemons = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Num. Pokemons: ", "Entrenador", JOptionPane.INFORMATION_MESSAGE));
		numMedallas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Num. Medallas", "Entrenador", JOptionPane.INFORMATION_MESSAGE));
		
		
		Entrenador entrenador = new Entrenador(nombre,apellido,sexo,edad,telefono,numPokemons,numMedallas);
		
		i.datosEntrenador(entrenador);
		return entrenador;
	}
	
	public Gimnasio ingresaGimnasio() {
		String nombre, lugar, propietario, superficie;
		int capacidad;
		
		nombre = JOptionPane.showInputDialog(null, "Ingresa Nombre:", "Gimnasio", JOptionPane.INFORMATION_MESSAGE);
		lugar = JOptionPane.showInputDialog(null, "Ingresa Lugar:", "Gimnasio", JOptionPane.INFORMATION_MESSAGE);
		propietario = JOptionPane.showInputDialog(null, "Ingresa Propietario:", "Gimnasio", JOptionPane.INFORMATION_MESSAGE);
		superficie = JOptionPane.showInputDialog(null, "Ingresa Superficie:", "Gimnasio", JOptionPane.INFORMATION_MESSAGE);
		capacidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Capacidad:", "Gimnasio", JOptionPane.INFORMATION_MESSAGE));
		
		Gimnasio gimnasio = new Gimnasio(nombre,lugar,propietario,superficie,capacidad);
		
		i.datosGimnasio(gimnasio);
		return gimnasio;
	}
	
	public void ingresaPokemon(Entrenador entrenador, Gimnasio gimnasio) {
		String nombre, tipo, poder, habitat, especie, evolucion;
		double peso, altura;
		
		nombre = JOptionPane.showInputDialog(null, "Ingresa Nombre:", "Pokemon", JOptionPane.INFORMATION_MESSAGE);
		tipo = JOptionPane.showInputDialog(null, "Ingresa Tipo:", "Pokemon", JOptionPane.INFORMATION_MESSAGE);
		poder = JOptionPane.showInputDialog(null, "Ingresa Poder:", "Pokemon", JOptionPane.INFORMATION_MESSAGE);
		habitat = JOptionPane.showInputDialog(null, "Ingresa Habitat:", "Pokemon", JOptionPane.INFORMATION_MESSAGE);
		especie = JOptionPane.showInputDialog(null, "Ingresa Especie:", "Pokemon", JOptionPane.INFORMATION_MESSAGE);
		evolucion = JOptionPane.showInputDialog(null, "Ingresa Evolucion:", "Pokemon", JOptionPane.INFORMATION_MESSAGE);
		peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa Peso:", "Pokemon", JOptionPane.INFORMATION_MESSAGE));
		altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa Altura:", "Pokemon", JOptionPane.INFORMATION_MESSAGE));
		
		Pokemon pokemon = new Pokemon(gimnasio,entrenador,nombre,tipo,poder,habitat,especie,evolucion,peso,altura);
		
		i.datosPokemon(pokemon);
	}

}
