package pe.edu.sistemas.sisasistlab.model;

public class Search {
	public String iddocente;
	public String idlaboratorio;
	public String idcurso;
	public String involucrado;
	

	public Search() {
	}

	public Search(String iddocente, String idlaboratorio, String idcurso, String involucrado) {
		this.iddocente = iddocente;
		this.idlaboratorio = idlaboratorio;
		this.idcurso = idcurso;
		this.involucrado = involucrado;
	}
	
	public String getIdlaboratorio() {
		return idlaboratorio;
	}

	public void setIdlaboratorio(String idlaboratorio) {
		this.idlaboratorio = idlaboratorio;
	}

	public String getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(String idcurso) {
		this.idcurso = idcurso;
	}

	public String getInvolucrado() {
		return involucrado;
	}

	public void setInvolucrado(String involucrado) {
		this.involucrado = involucrado;
	}

	public String getIddocente() {
		return iddocente;
	}

	public void setIddocente(String iddocente) {
		this.iddocente = iddocente;
	}

	@Override
	public String toString() {
		return "Search [iddocente=" + iddocente + ", idlaboratorio=" + idlaboratorio + ", idcurso=" + idcurso
				+ ", involucrado=" + involucrado + "]";
	}

	
	
	
}
