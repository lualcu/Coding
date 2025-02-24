package asociacion_arreglos;

public class Intercalacion {
	int[] z = new int[20];
	String datos = "";
	String intercala (int[] A, int B[]) {
		for(int i = 0,j= 0; j<z.length; i++,j+=2) {
			z[j] = A[i];
			z[j+1] = B[i];
		}
		//Concatenar los datos en la variable String
		datos += "\t\t\t\tArreglo A[]\n";
		datos += "---------------------------------------------------------------------";
		datos += "------------------------------------------------------\n";
		for(int i = 0; i<A.length;i++) {
			datos += A[i] + "\t";
		}
		datos += "\n";
		datos += "\t\t\t\tArreglo B[]\n";
		datos += "---------------------------------------------------------------------";
		datos += "------------------------------------------------------\n";
		for(int i = 0; i<B.length;i++) {
			datos += B[i] + "\t";
		}
		datos += "\n";
		datos += "\t\t\t\tArreglo Z[]\n";
		datos +="----------------------------------------------------------------------";
		datos += "------------------------------------------------------\n";
		for(int i = 0; i<20; i++) {
			datos += z[i] + "\t";
			if((i+1) % 10 == 0) {
				datos += "\n";
			}
		}
		return datos;
	}
}
