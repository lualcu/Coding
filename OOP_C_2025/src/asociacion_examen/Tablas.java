package asociacion_examen;

public class Tablas {
	String datos = "";
	String linea = "----------------------------------------------------------------"
			+ "---------------------------------------------------------------------"
			+ "---------------------------------------------------------------------\n";
	public String tablas() {
		//Generar Num Aleatorio 1-10
		int num = (int)(Math.random()*10+1);
		// Acomodar Salida y Multiplicaciones
		datos += "\t\t\t\tFormato\tNormal\n" + linea;
		for(int i = 1; i<=10; i++) {
			datos += i + " X " + num + " = " + (i*num) + "\t";
		}
		datos += "\n" + linea + "\t\t\t\tFormato\tInverso\n" + linea;
		for(int i = 1; i<=10; i++) {
			datos += num + " X " + i + " = " + (num*i) + "\t";
		}
		datos += "\n" + linea;
		return datos;
	}

}
