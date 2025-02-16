package asociacion_temperatura;

public class Celcius {
	public double fahrenheit(double temp) {
		return (temp * (9.0/5.0)) + 32;
	}
	public double kelvin(double temp) {
		return temp + 273.15;
	}
}
