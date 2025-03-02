package asociacion_examen;

public class Aleatorio {
	String datos = "";
	String linea = "----------------------------------------------------------------"
			+ "---------------------------------------------------------------------"
			+ "---------------------------------------------------------------------\n";
	String pares = "";
	String impares = "";
	int[] arreglo = new int[20];
	int numPar = 0, numImpar = 0, sumPar = 0, sumImpar = 0, numCeros = 0;
	public String aleatorio() {
		// Llenar Arreglo e ir Calculando
		for(int i = 0; i<20;i++) {
			arreglo[i] = (int)(Math.random()*101); // 0>=x<1 --> *101 --> 0>=x<101 | Numeros del 0 al 100
			if(arreglo[i] % 2 == 0) {
				numPar++;
				sumPar += arreglo[i];
				pares += arreglo[i] + "\t";
			}
			else {
				numImpar++;
				sumImpar += arreglo[i];
				impares += arreglo[i] + "\t";
			}
			if(arreglo[i] == 0) {
				numCeros++;
			}
		}
		// Acomodar Salida
		datos += "Arreglo\n" + linea;
		for(int i = 0; i<20; i++) {
			datos += arreglo[i] + "\t";
		}
		datos += "\n" + linea +"Numeros Pares = " + numPar + " || Suma: " + sumPar + "\n" + linea + pares;
		datos += "\n"+ linea +"Numeros Impares = " + numImpar + " || Suma: " + sumImpar + "\n" + linea + impares + "\n" + linea;
		if(sumPar == sumImpar) {
			datos += "SUMAS IGUALES\n";
		}
		else {
			datos += "SUMAS NO IGUALES\n";
		}
		datos += "Numero de Ceros: " + numCeros + "\n";
		
		return datos;
	}

}
