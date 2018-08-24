package pe.edu.sistemas.sisasistlab.domain;
// Generated 24-ago-2018 0:28:55 by Hibernate Tools 4.0.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Periodo generated by hbm2java
 */
@Entity
@Table(name = "periodo", catalog = "modelogeneralfisi")
public class Periodo implements java.io.Serializable {

	private int idperiodo;
	private String periodoNombre;
	private Date periodoFechaInicio;
	private Date periodoFechaFin;
	private Set<CursoPeriodo> cursoPeriodos = new HashSet<CursoPeriodo>(0);

	public Periodo() {
	}

	public Periodo(int idperiodo, String periodoNombre) {
		this.idperiodo = idperiodo;
		this.periodoNombre = periodoNombre;
	}

	public Periodo(int idperiodo, String periodoNombre, Date periodoFechaInicio, Date periodoFechaFin,
			Set<CursoPeriodo> cursoPeriodos) {
		this.idperiodo = idperiodo;
		this.periodoNombre = periodoNombre;
		this.periodoFechaInicio = periodoFechaInicio;
		this.periodoFechaFin = periodoFechaFin;
		this.cursoPeriodos = cursoPeriodos;
	}

	@Id

	@Column(name = "IDPERIODO", unique = true, nullable = false)
	public int getIdperiodo() {
		return this.idperiodo;
	}

	public void setIdperiodo(int idperiodo) {
		this.idperiodo = idperiodo;
	}

	@Column(name = "PERIODO_NOMBRE", nullable = false, length = 45)
	public String getPeriodoNombre() {
		return this.periodoNombre;
	}

	public void setPeriodoNombre(String periodoNombre) {
		this.periodoNombre = periodoNombre;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "PERIODO_FECHA_INICIO", length = 10)
	public Date getPeriodoFechaInicio() {
		return this.periodoFechaInicio;
	}

	public void setPeriodoFechaInicio(Date periodoFechaInicio) {
		this.periodoFechaInicio = periodoFechaInicio;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "PERIODO_FECHA_FIN", length = 10)
	public Date getPeriodoFechaFin() {
		return this.periodoFechaFin;
	}

	public void setPeriodoFechaFin(Date periodoFechaFin) {
		this.periodoFechaFin = periodoFechaFin;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "periodo")
	public Set<CursoPeriodo> getCursoPeriodos() {
		return this.cursoPeriodos;
	}

	public void setCursoPeriodos(Set<CursoPeriodo> cursoPeriodos) {
		this.cursoPeriodos = cursoPeriodos;
	}

}
