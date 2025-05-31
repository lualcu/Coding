package polimorfismo.vehiculo2;

public class Deportivo extends Vehiculo {
	
	private int nCilindros;

	public Deportivo(String matricula, String marca, String modelo, int ncilindros) {
		super(matricula, marca, modelo);
		this.nCilindros = ncilindros;
	}

	public int getNcilindros() {
		return nCilindros;
	}

	public void setNcilindros(int ncilindros) {
		this.nCilindros = ncilindros;
	}
	
	

}
