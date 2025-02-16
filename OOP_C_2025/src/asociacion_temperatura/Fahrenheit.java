package asociacion_temperatura;

public class Fahrenheit {
	public double kelvin(double temp) {
		return ((temp - 32) * (5.0/9.0)) + 273.15;
	}
	public double celcius(double temp) {
		return (temp - 32) * (5.0/9.0);
	}

}
