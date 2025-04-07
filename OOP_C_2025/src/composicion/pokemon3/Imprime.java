package composicion.pokemon3;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Imprime {
	
	JTextArea salida = new JTextArea();
	String datosEntrenador = "Nombre\tApellido\tEdad\tSexo\tTelefono\tN. Pokemons\tN. Medallas\n";
	String datosGimnasio = "Nombre\tLugar\tPropietario\tSuperficie\tCapacidad\n";
	String datosPokemon = "Nombre\tTipo\tPoder\tPeso\tAltura\tHabitat\tEspecie\tEvolucion\n";
	
	Image imgPok = new ImageIcon(getClass().getResource("/general.icons/POKEMON.png")).getImage();
	ImageIcon pok =  new ImageIcon(imgPok.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Image imgEnt = new ImageIcon(getClass().getResource("/general.icons/ENTRENADOR.png")).getImage();
	ImageIcon ent= new ImageIcon(imgEnt.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Image imgGym = new ImageIcon(getClass().getResource("/general.icons/GIMNASIO.png")).getImage();
	ImageIcon gym= new ImageIcon(imgGym.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	public void datosEntrenador(Entrenador entrenador) {
		String datosEnt = datosEntrenador;
		datosEnt += "-------------------------------------------"
				+ "--------------------------------------------------\n";
		datosEnt += entrenador.getNombre() + "\t" +
					entrenador.getApellido() + "\t" +
					entrenador.getEdad() + "\t" +
					entrenador.getSexo() + "\t" +
					entrenador.getTelefono() + "\t" +
					entrenador.getNumPokemons() + "\t" +
					entrenador.getNumMedallas() + "\n";
		
		salida.setText(datosEnt);
		
		JOptionPane.showMessageDialog(null, salida, "Reporte - Entrenador", 
				JOptionPane.INFORMATION_MESSAGE, ent);
	}
	
	public void datosGimnasio(Gimnasio gimnasio) {
		String datosGym = datosGimnasio;
		datosGym += "-----------------------------------------------------------------\n";
		datosGym += gimnasio.getNombre() + "\t" +
					gimnasio.getLugar() + "\t" +
					gimnasio.getPropietario() + "\t" +
					gimnasio.getSuperficie() + "\t" +
					gimnasio.getCapacidad() + "\n";
		
		salida.setText(datosGym);
		
		JOptionPane.showMessageDialog(null, salida, "Reporte - Gimnasio", 
				JOptionPane.INFORMATION_MESSAGE, gym);
	}
	
	public void datosPokemon(Pokemon pokemon) {
		String datosPok = datosEntrenador;
		datosPok +="-------------------------------------------"
				+ "--------------------------------------------------\n";
		datosPok += pokemon.getEntrenador().getNombre() + "\t" +
					pokemon.getEntrenador().getApellido() + "\t" +
					pokemon.getEntrenador().getEdad() + "\t" +
					pokemon.getEntrenador().getSexo() + "\t" +
					pokemon.getEntrenador().getTelefono() + "\t" +
					pokemon.getEntrenador().getNumPokemons() + "\t" +
					pokemon.getEntrenador().getNumMedallas() + "\n";
		
		datosPok += "-------------------------------------------"
				+ "--------------------------------------------------\n";
		datosPok += datosGimnasio;
		datosPok +="-------------------------------------------"
				+ "--------------------------------------------------\n";
		datosPok += pokemon.getGimnasio().getNombre() + "\t" +
					pokemon.getGimnasio().getLugar() + "\t" +
					pokemon.getGimnasio().getPropietario() + "\t" +
					pokemon.getGimnasio().getSuperficie() + "\t" +
					pokemon.getGimnasio().getCapacidad() + "\n";
		
		datosPok +="-------------------------------------------"
				+ "--------------------------------------------------\n";
		datosPok += datosPokemon;
		datosPok +="-------------------------------------------"
				+ "--------------------------------------------------\n";
		datosPok += pokemon.getNombre() + "\t" +
					pokemon.getTipo() + "\t" +
					pokemon.getPoder() + "\t" +
					pokemon.getPeso() + "\t" +
					pokemon.getAltura() + "\t" +
					pokemon.getHabitat() + "\t" +
					pokemon.getEspecie() + "\t" +
					pokemon.getEvolucion() + "\n";
		
		salida.setText(datosPok);
		
		JOptionPane.showMessageDialog(null, salida, "Reporte - Pokemon",
				JOptionPane.INFORMATION_MESSAGE, pok);
	}
	
	

}
