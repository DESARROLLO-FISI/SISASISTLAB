package pe.edu.sistemas.sisasistlab.domain;
// Generated 13/07/2018 02:11:42 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Persona generated by hbm2java
 */
@Entity
@Table(name = "persona", catalog = "modelogeneralfisi")
public class Persona implements java.io.Serializable {

	private Integer idPersona;
	private String personaCodigo;
	private String personaNombre;
	private String personaAppaterno;
	private String personaApmaterno;
	private String personaTelefono;
	private String personaCorreo;
	private String personaDireccion;
	private String personaDni;
	private Date personaFechaNacimiento;
	private String personaSexo;
	private String personaEstadoCivil;
	private String personaCodigoSistema;
	private String personaPasswordSistema;
	private String personaPasswordSistema2;
	private Set<Usuario> usuarios = new HashSet<Usuario>(0);
	private Set<Usuario> usuarios_1 = new HashSet<Usuario>(0);
	private Set<Docente> docentes = new HashSet<Docente>(0);
	private Set<Docente> docentes_1 = new HashSet<Docente>(0);

	public Persona() {
	}

	public Persona(String personaCodigoSistema, String personaPasswordSistema, String personaPasswordSistema2) {
		this.personaCodigoSistema = personaCodigoSistema;
		this.personaPasswordSistema = personaPasswordSistema;
		this.personaPasswordSistema2 = personaPasswordSistema2;
	}

	public Persona(String personaCodigo, String personaNombre, String personaAppaterno, String personaApmaterno,
			String personaTelefono, String personaCorreo, String personaDireccion, String personaDni,
			Date personaFechaNacimiento, String personaSexo, String personaEstadoCivil, String personaCodigoSistema,
			String personaPasswordSistema, String personaPasswordSistema2, Set<Usuario> usuarios,
			Set<Usuario> usuarios_1, Set<Docente> docentes, Set<Docente> docentes_1) {
		this.personaCodigo = personaCodigo;
		this.personaNombre = personaNombre;
		this.personaAppaterno = personaAppaterno;
		this.personaApmaterno = personaApmaterno;
		this.personaTelefono = personaTelefono;
		this.personaCorreo = personaCorreo;
		this.personaDireccion = personaDireccion;
		this.personaDni = personaDni;
		this.personaFechaNacimiento = personaFechaNacimiento;
		this.personaSexo = personaSexo;
		this.personaEstadoCivil = personaEstadoCivil;
		this.personaCodigoSistema = personaCodigoSistema;
		this.personaPasswordSistema = personaPasswordSistema;
		this.personaPasswordSistema2 = personaPasswordSistema2;
		this.usuarios = usuarios;
		this.usuarios_1 = usuarios_1;
		this.docentes = docentes;
		this.docentes_1 = docentes_1;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID_PERSONA", unique = true, nullable = false)
	public Integer getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	@Column(name = "PERSONA_CODIGO", length = 45)
	public String getPersonaCodigo() {
		return this.personaCodigo;
	}

	public void setPersonaCodigo(String personaCodigo) {
		this.personaCodigo = personaCodigo;
	}

	@Column(name = "PERSONA_NOMBRE", length = 45)
	public String getPersonaNombre() {
		return this.personaNombre;
	}

	public void setPersonaNombre(String personaNombre) {
		this.personaNombre = personaNombre;
	}

	@Column(name = "PERSONA_APPATERNO", length = 45)
	public String getPersonaAppaterno() {
		return this.personaAppaterno;
	}

	public void setPersonaAppaterno(String personaAppaterno) {
		this.personaAppaterno = personaAppaterno;
	}

	@Column(name = "PERSONA_APMATERNO", length = 45)
	public String getPersonaApmaterno() {
		return this.personaApmaterno;
	}

	public void setPersonaApmaterno(String personaApmaterno) {
		this.personaApmaterno = personaApmaterno;
	}

	@Column(name = "PERSONA_TELEFONO", length = 45)
	public String getPersonaTelefono() {
		return this.personaTelefono;
	}

	public void setPersonaTelefono(String personaTelefono) {
		this.personaTelefono = personaTelefono;
	}

	@Column(name = "PERSONA_CORREO", length = 45)
	public String getPersonaCorreo() {
		return this.personaCorreo;
	}

	public void setPersonaCorreo(String personaCorreo) {
		this.personaCorreo = personaCorreo;
	}

	@Column(name = "PERSONA_DIRECCION", length = 100)
	public String getPersonaDireccion() {
		return this.personaDireccion;
	}

	public void setPersonaDireccion(String personaDireccion) {
		this.personaDireccion = personaDireccion;
	}

	@Column(name = "PERSONA_DNI", length = 10)
	public String getPersonaDni() {
		return this.personaDni;
	}

	public void setPersonaDni(String personaDni) {
		this.personaDni = personaDni;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "PERSONA_FECHA_NACIMIENTO", length = 10)
	public Date getPersonaFechaNacimiento() {
		return this.personaFechaNacimiento;
	}

	public void setPersonaFechaNacimiento(Date personaFechaNacimiento) {
		this.personaFechaNacimiento = personaFechaNacimiento;
	}

	@Column(name = "PERSONA_SEXO", length = 10)
	public String getPersonaSexo() {
		return this.personaSexo;
	}

	public void setPersonaSexo(String personaSexo) {
		this.personaSexo = personaSexo;
	}

	@Column(name = "PERSONA_ESTADO_CIVIL", length = 10)
	public String getPersonaEstadoCivil() {
		return this.personaEstadoCivil;
	}

	public void setPersonaEstadoCivil(String personaEstadoCivil) {
		this.personaEstadoCivil = personaEstadoCivil;
	}

	@Column(name = "PERSONA_CODIGO_SISTEMA", nullable = false, length = 45)
	public String getPersonaCodigoSistema() {
		return this.personaCodigoSistema;
	}

	public void setPersonaCodigoSistema(String personaCodigoSistema) {
		this.personaCodigoSistema = personaCodigoSistema;
	}

	@Column(name = "PERSONA_PASSWORD_SISTEMA", nullable = false, length = 45)
	public String getPersonaPasswordSistema() {
		return this.personaPasswordSistema;
	}

	public void setPersonaPasswordSistema(String personaPasswordSistema) {
		this.personaPasswordSistema = personaPasswordSistema;
	}

	@Column(name = "PERSONA_PASSWORD_SISTEMA2", nullable = false, length = 100)
	public String getPersonaPasswordSistema2() {
		return this.personaPasswordSistema2;
	}

	public void setPersonaPasswordSistema2(String personaPasswordSistema2) {
		this.personaPasswordSistema2 = personaPasswordSistema2;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persona")
	public Set<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persona")
	public Set<Usuario> getUsuarios_1() {
		return this.usuarios_1;
	}

	public void setUsuarios_1(Set<Usuario> usuarios_1) {
		this.usuarios_1 = usuarios_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persona")
	public Set<Docente> getDocentes() {
		return this.docentes;
	}

	public void setDocentes(Set<Docente> docentes) {
		this.docentes = docentes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persona")
	public Set<Docente> getDocentes_1() {
		return this.docentes_1;
	}

	public void setDocentes_1(Set<Docente> docentes_1) {
		this.docentes_1 = docentes_1;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", personaCodigo=" + personaCodigo + ", personaNombre="
				+ personaNombre + ", personaAppaterno=" + personaAppaterno + ", personaApmaterno=" + personaApmaterno
				+ "]";
	}
	
	

}
