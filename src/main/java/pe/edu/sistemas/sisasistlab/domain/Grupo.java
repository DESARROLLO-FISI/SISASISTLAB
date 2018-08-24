package pe.edu.sistemas.sisasistlab.domain;
// Generated 24-ago-2018 0:28:55 by Hibernate Tools 4.0.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Grupo generated by hbm2java
 */
@Entity
@Table(name = "grupo", catalog = "modelogeneralfisi")
public class Grupo implements java.io.Serializable {

	private Integer idgrupo;
	private CursoPeriodo cursoPeriodo;
	private int grupoNumero;
	private Set<HorarioClase> horarioClases = new HashSet<HorarioClase>(0);

	public Grupo() {
	}

	public Grupo(CursoPeriodo cursoPeriodo, int grupoNumero) {
		this.cursoPeriodo = cursoPeriodo;
		this.grupoNumero = grupoNumero;
	}

	public Grupo(CursoPeriodo cursoPeriodo, int grupoNumero, Set<HorarioClase> horarioClases) {
		this.cursoPeriodo = cursoPeriodo;
		this.grupoNumero = grupoNumero;
		this.horarioClases = horarioClases;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "IDGRUPO", unique = true, nullable = false)
	public Integer getIdgrupo() {
		return this.idgrupo;
	}

	public void setIdgrupo(Integer idgrupo) {
		this.idgrupo = idgrupo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CURSO_IDCURSO", nullable = false)
	public CursoPeriodo getCursoPeriodo() {
		return this.cursoPeriodo;
	}

	public void setCursoPeriodo(CursoPeriodo cursoPeriodo) {
		this.cursoPeriodo = cursoPeriodo;
	}

	@Column(name = "GRUPO_NUMERO", nullable = false)
	public int getGrupoNumero() {
		return this.grupoNumero;
	}

	public void setGrupoNumero(int grupoNumero) {
		this.grupoNumero = grupoNumero;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "grupo")
	public Set<HorarioClase> getHorarioClases() {
		return this.horarioClases;
	}

	public void setHorarioClases(Set<HorarioClase> horarioClases) {
		this.horarioClases = horarioClases;
	}

}
