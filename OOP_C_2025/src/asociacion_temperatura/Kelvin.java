package asociacion_temperatura;

public class Kelvin {
	public double fahrenheit(double temp) {
		return ((temp - 273.15) * (9.0/5.0)) + 32;
	}
	public double celcius(double temp) {
		return temp - 273.15;
	}
}
