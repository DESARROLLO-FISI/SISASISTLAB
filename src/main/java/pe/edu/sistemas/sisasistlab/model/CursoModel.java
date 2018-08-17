package pe.edu.sistemas.sisasistlab.model;

public class CursoModel {
	Integer idGrupo;
	String cursoPeriodoNombre;
	
	public CursoModel(Integer idGrupo, String cursoPeriodoNombre) {
		this.idGrupo = idGrupo;
		this.cursoPeriodoNombre = cursoPeriodoNombre;
	}
	
	public CursoModel(){}

	public Integer getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(Integer idCursoPeriodo) {
		this.idGrupo = idCursoPeriodo;
	}

	public String getCursoPeriodoNombre() {
		return cursoPeriodoNombre;
	}

	public void setCursoPeriodoNombre(String cursoPeriodoNombre) {
		this.cursoPeriodoNombre = cursoPeriodoNombre;
	}

	@Override
	public String toString() {
		return "CursoModel [idGrupo=" + idGrupo + ", cursoPeriodoNombre=" + cursoPeriodoNombre + "]";
	}
	
	
}
