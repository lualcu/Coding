package polimorfismo.seleccionfutbol;

import java.util.ArrayList;

public class PruebaSeleccionFutbol {
	
	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

	public static void main(String[] args) {
		
		SeleccionFutbol delBosque = new Entrenador(1,60,"Vicente", "Del Bosque",28439);
		SeleccionFutbol iniesta = new Futbolista(2, 29, "Andres", "Iniesta", 6, "Interior Derecho");
		SeleccionFutbol raulMartinez = new Masajista(3, 41, "Raúl", "Martínez", "Licenciado en Fisioterapia", 18);
		
		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);
		
		System.out.println("Todos los Integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
		
		// CONCENTRACIÓN
		for(SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.concentrarse();
		}
		
		// VIAJE
		System.out.println("Todos los Integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
		for(SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.viajar();
		}
		
		// ENTRENAMIENTO
		
		System.out.println("Todos los integrantes tienen su funcion de un entrenamiento (Especialización)");
		for(SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.entrenamiento();
		}
		
		// PARTIDO DE FUTBOL
		System.out.println("Todos los integrantes tiene su función en un partido (Especialización)");
		for(SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.partidoFutbol();
		}
		
		// PLANIFICAR ENTRENAMIENTO
		System.out.println("Solo el entrenador tiene el método para planificar un entrenamiento");
		System.out.print(delBosque.getNombre() + " " + delBosque.getApellidos() + " -> ");
		((Entrenador) delBosque).planificarEntrenamiento();
		
		// ENTREVISTA
		System.out.println("Solo el futbolista tiene el método para dar una entrevista");
		System.out.print(iniesta.getNombre() + " " + iniesta.getApellidos() + " -> ");
		((Futbolista) iniesta).entrevista();
		
		// MASAJE
		System.out.println("Solo el entrenador tiene el método para dar un masaje");
		System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellidos() + " -> ");
		((Masajista) raulMartinez).darMasaje();

	}

}
