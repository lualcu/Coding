package asociacion_arreglos;

public class Multiplicacion {

	int z[] = new int[10];
	String datos = "";
	String multiplica (int[] A, int B[]) {
		//Realizar la Suma de los Arreglos A y B en Z
		for(int i = 0; i < z.length; i++) {
			z[i] = A[i]*B[i]; 
		}
		//Colocar los Datos de los Arreglos en la variable String
		for(int i = 0; i<z.length;i++) {
			datos += A[i] + "\t*\t" + B[i] + "\t=\t" + z[i] + "\n";
		}
		return datos;
	}
}
