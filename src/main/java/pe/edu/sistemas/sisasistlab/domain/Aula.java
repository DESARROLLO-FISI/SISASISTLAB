package pe.edu.sistemas.sisasistlab.domain;
// Generated 24/08/2018 05:00:13 PM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Aula generated by hbm2java
 */
@Entity
@Table(name = "aula", catalog = "modelogeneralfisi")
public class Aula implements java.io.Serializable {

	private Integer idaula;
	private int capacidad;
	private String nombre;
	private Integer tipoAula;
	private Integer piso;
	private Set<LaboratorioDisp> laboratorioDisps = new HashSet<LaboratorioDisp>(0);
	private Set<HorarioClase> horarioClases = new HashSet<HorarioClase>(0);

	public Aula() {
	}

	public Aula(int capacidad, String nombre) {
		this.capacidad = capacidad;
		this.nombre = nombre;
	}

	public Aula(int capacidad, String nombre, Integer tipoAula, Integer piso, Set<LaboratorioDisp> laboratorioDisps,
			Set<HorarioClase> horarioClases) {
		this.capacidad = capacidad;
		this.nombre = nombre;
		this.tipoAula = tipoAula;
		this.piso = piso;
		this.laboratorioDisps = laboratorioDisps;
		this.horarioClases = horarioClases;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "IDAULA", unique = true, nullable = false)
	public Integer getIdaula() {
		return this.idaula;
	}

	public void setIdaula(Integer idaula) {
		this.idaula = idaula;
	}

	@Column(name = "CAPACIDAD", nullable = false)
	public int getCapacidad() {
		return this.capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Column(name = "NOMBRE", nullable = false, length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "TIPO_AULA")
	public Integer getTipoAula() {
		return this.tipoAula;
	}

	public void setTipoAula(Integer tipoAula) {
		this.tipoAula = tipoAula;
	}

	@Column(name = "PISO")
	public Integer getPiso() {
		return this.piso;
	}

	public void setPiso(Integer piso) {
		this.piso = piso;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "aula")
	public Set<LaboratorioDisp> getLaboratorioDisps() {
		return this.laboratorioDisps;
	}

	public void setLaboratorioDisps(Set<LaboratorioDisp> laboratorioDisps) {
		this.laboratorioDisps = laboratorioDisps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "aula")
	public Set<HorarioClase> getHorarioClases() {
		return this.horarioClases;
	}

	public void setHorarioClases(Set<HorarioClase> horarioClases) {
		this.horarioClases = horarioClases;
	}

}
