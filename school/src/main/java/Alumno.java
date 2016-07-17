
public class Alumno {
	
	String Nombre;
	String ApePaterno;
	String ApeMaterno;
	String Semestre;
	String letra;
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApePaterno() {
		return ApePaterno;
	}
	public void setApePaterno(String apePaterno) {
		ApePaterno = apePaterno;
	}
	public String getApeMaterno() {
		return ApeMaterno;
	}
	public void setApeMaterno(String apeMaterno) {
		ApeMaterno = apeMaterno;
	}
	public String getSemestre() {
		return Semestre;
	}
	public void setSemestre(String semestre) {
		Semestre = semestre;
	}
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
	}
	
	public Alumno(String nombre, String apePaterno, String apeMaterno, String semestre, String letra) {
		super();
		Nombre = nombre;
		ApePaterno = apePaterno;
		ApeMaterno = apeMaterno;
		Semestre = semestre;
		this.letra = letra;
	}

}
