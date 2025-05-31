package polimorfismo.vehiculo2;

public class Familiar extends Vehiculo {
	
	private int nPuertas;

	public Familiar(String matricula, String marca, String modelo, int nPuertas) {
		super(matricula, marca, modelo);
		this.nPuertas = nPuertas;
	}

	public int getnPuertas() {
		return nPuertas;
	}

	public void setnPuertas(int nPuertas) {
		this.nPuertas = nPuertas;
	}
	
	

}
