package polimorfismo.seleccionfutbol2;

public class Futbolista extends SeleccionFutbol{
	
	private String posicion;
	private int numero;
	private double salario;
	private String altura;
	
	public Futbolista(int id, String nombre, String apellido, double peso, int edad, String posicion, int numero,
			double salario, String altura) {
		super(id, nombre, apellido, peso, edad);
		this.posicion = posicion;
		this.numero = numero;
		this.salario = salario;
		this.altura = altura;
	}

	public String getPosicion() {
		return posicion;
	}

	public int getNumero() {
		return numero;
	}

	public double getSalario() {
		return salario;
	}

	public String getAltura() {
		return altura;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}
	
	
	

}
