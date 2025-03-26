package composicion.perros;

public class PruebaPerros {

	public static void main(String[] args) {
		
		// Instanciar a la clase MuestraDatos
		
		MuestraDatos m = new MuestraDatos();
		
		Perro p1 = new Perro("Poncho", "Labrador", 1.10, 12.5, "12-Dic-2015");
		Perro p2 = new Perro("F	qido", "Bulldog", 0.50, 25.50, "14-Abr-2013");
		Perro p3 = new Perro("Rosty", "Coquer Spanish", 0.40, 15.50, "9-Ene-2017");
		
		m.muestraDatos(p1);
		m.muestraDatos(p2);

	}

}



