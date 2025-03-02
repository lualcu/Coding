package asociacion_examen;

public class Intercalacion {
	int[] A = new int[10];
	int[] B = new int[10];
	int[] C = new int[20];
	
	String datos = "";
	String linea = "---------------------------------------------------------------------"
			+ "--------------------------------------------------------------------------\n";
	String intercalacion () {
		//LLenar arreglos
		for(int i = 0; i<10; i++) {
			A[i] = (int)(Math.random()*10+1);
			B[i] = (int)(Math.random()*10+1);
		}
		//Intercala
		for(int i = 0,j= 0; j<C.length; i++,j+=2) {
			C[j] = A[i];
			C[j+1] = B[i];
		}
		//Concatenar los datos en la variable C en forma Normal
		datos += "\t\t\t\tArreglo A[] Normal\n";
		datos += linea;
		for(int i = 0; i<A.length;i++) {
			datos += A[i] + "\t";
		}
		datos += "\n" + linea;
		datos += "\t\t\t\tArreglo B[] Normal\n";
		datos += linea;
		for(int i = 0; i<B.length;i++) {
			datos += B[i] + "\t";
		}
		datos += "\n" + linea;
		datos += "\t\t\t\tArreglo C[] Normal\n";
		datos += linea;
		
		for(int i = 0; i<20; i++) {
			datos += C[i] + "\t";
			if((i+1) % 10 == 0) {
				datos += "\n";
			}
		}
		datos += "\n" + linea;
		//Concatenar los datos en la variable C en forma Inversa
		datos += "\t\t\t\tArreglo A[] Inverso\n";
		datos += linea;
		for(int i = 9; i>=0;i--) {
			datos += A[i] + "\t";
		}
		datos += "\n" + linea;
		datos += "\t\t\t\tArreglo B[] Inverso\n";
		datos += linea;
		for(int i = 9; i>=0;i--) {
			datos += B[i] + "\t";
		}
		datos += "\n" + linea;
		datos += "\t\t\t\tArreglo C[] Inverso\n";
		datos += linea;
		
		for(int i = 19; i>=0;i--) {
			datos += C[i] + "\t";
			if((i) % 10 == 0) {
				datos += "\n";
			}
		}
		return datos;
	}
}

