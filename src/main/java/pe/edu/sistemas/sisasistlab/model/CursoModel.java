package pe.edu.sistemas.sisasistlab.model;

public class CursoModel {
	Integer idCursoPeriodo;
	String cursoPeriodoNombre;
	
	public CursoModel(Integer idCursoPeriodo, String cursoPeriodoNombre) {
		this.idCursoPeriodo = idCursoPeriodo;
		this.cursoPeriodoNombre = cursoPeriodoNombre;
	}
	
	public CursoModel(){}

	public Integer getIdCursoPeriodo() {
		return idCursoPeriodo;
	}

	public void setIdCursoPeriodo(Integer idCursoPeriodo) {
		this.idCursoPeriodo = idCursoPeriodo;
	}

	public String getCursoPeriodoNombre() {
		return cursoPeriodoNombre;
	}

	public void setCursoPeriodoNombre(String cursoPeriodoNombre) {
		this.cursoPeriodoNombre = cursoPeriodoNombre;
	}

	@Override
	public String toString() {
		return "CursoModel [idCursoPeriodo=" + idCursoPeriodo + ", cursoPeriodoNombre=" + cursoPeriodoNombre + "]";
	}
	
	
}
