package composicion.paciente;

public class Paciente {
	// Definicion de los Atributos de la Clase
	private Medico medico;
	private Hospital hospital;
	private String name;
	private String direccion;
	private String padecimiento;
	private String nss;
	private String email;
	private String phone;
	
	public Paciente(Medico medico, Hospital hospital, String name, String direccion, String padecimiento, String nss,
			String email, String phone) {
		
		this.medico = medico;
		this.hospital = hospital;
		this.name = name;
		this.direccion = direccion;
		this.padecimiento = padecimiento;
		this.nss = nss;
		this.email = email;
		this.phone = phone;
	}

	public Medico getMedico() {
		return medico;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public String getName() {
		return name;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getPadecimiento() {
		return padecimiento;
	}

	public String getNss() {
		return nss;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setPadecimiento(String padecimiento) {
		this.padecimiento = padecimiento;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	

}
