package asociacion_arreglos;

public class Ecuacion {
	
	public String ecuacion (int[] A, int B[]) {
		int sumA = 0, sumB = 0, sumB2 = 0, sumAB =0, sumA2B = 0, sumA2B2 = 0;
		int sumA_B = 0, sumAB2 = 0, w = 0, x = 0, y = 0, z = 0;
		String datos = "";
		String linea = "---------------------------------------------------------------------"
				+ "--------------------------------------------------------------------------\n";
		// Obtener las Sumatorias
		for(int i = 0; i<A.length; i++) {
			sumA += A[i];
			sumB += B[i];
			sumB2 += Math.pow(B[i], 2);
			sumAB += A[i]*B[i];
			sumA2B += Math.pow(A[i], 2)*B[i];
			sumA2B2 += Math.pow(A[i], 2) * Math.pow(B[i], 2);
			sumAB2 += A[i]*Math.pow(B[i], 2);
			sumA_B += A[i]-B[i];
		}
		//Concatenar el resultado de los arreglos
		datos += "A[]\tB[]\tB2[]\tA[]*B[]\tA2[]*B[]\tA2[]*B2[]\t"
				+ "A[]-B[]\tA[]*B2[]\n";
		datos += linea;
		for(int i = 0; i<A.length; i++) {
			datos += A[i] + "\t" + B[i] + "\t" + Math.pow(B[i], 2) + "\t";
			datos += A[i]*B[i] + "\t" + Math.pow(A[i], 2)*B[i] + "\t";
			datos += Math.pow(A[i], 2)*Math.pow(B[i], 2) + "\t";
			datos += (A[i]-B[i]) + "\t" + A[i]*Math.pow(B[i], 2) + "\n";
			
		}
		// Concatenar las Sumatorias
		datos += linea;
		datos += sumA + "\t" + sumB + "\t" + sumB2 + "\t" + sumAB + "\t";
		datos += sumA2B + "\t" + sumA2B2 + "\t" + sumA_B + "\t" + sumAB2 + "\n";
		// Sustituir los valores en la formula
		w = sumA + sumB2 + sumAB;
		x = sumA2B + sumA2B2 + sumA_B + w;
		y = sumAB2 + sumB + w - x;
		
		z = w+x-y;
		datos += linea;
		datos += "Resultado de z = " + z;
		
		return datos;
	}
}
