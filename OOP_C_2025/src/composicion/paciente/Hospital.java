package composicion.paciente;

public class Hospital {
	// Definicion de los Atributos de la Clase
	private String name;
	private String direccion;
	private String rfc;
	private String web;
	private String phone;
	
	public Hospital(String name, String direccion, String rfc, String web, String phone) {
		
		this.name = name;
		this.direccion = direccion;
		this.rfc = rfc;
		this.web = web;
		this.phone = phone;
	}
	

	public Hospital() {
		
	}


	public String getName() {
		return name;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getRfc() {
		return rfc;
	}

	public String getWeb() {
		return web;
	}

	public String getPhone() {
		return phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
