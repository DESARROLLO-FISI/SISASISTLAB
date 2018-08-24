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
 * TipoUsuario generated by hbm2java
 */
@Entity
@Table(name = "tipo_usuario", catalog = "modelogeneralfisi")
public class TipoUsuario implements java.io.Serializable {

	private Integer idtipoUsuario;
	private String nombreTipoUsuario;
	private String tipoUsuarioDescripcion;
	private Set<Usuario> usuarios = new HashSet<Usuario>(0);
	private Set<Usuario> usuarios_1 = new HashSet<Usuario>(0);

	public TipoUsuario() {
	}

	public TipoUsuario(String nombreTipoUsuario) {
		this.nombreTipoUsuario = nombreTipoUsuario;
	}

	public TipoUsuario(String nombreTipoUsuario, String tipoUsuarioDescripcion, Set<Usuario> usuarios,
			Set<Usuario> usuarios_1) {
		this.nombreTipoUsuario = nombreTipoUsuario;
		this.tipoUsuarioDescripcion = tipoUsuarioDescripcion;
		this.usuarios = usuarios;
		this.usuarios_1 = usuarios_1;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "IDTIPO_USUARIO", unique = true, nullable = false)
	public Integer getIdtipoUsuario() {
		return this.idtipoUsuario;
	}

	public void setIdtipoUsuario(Integer idtipoUsuario) {
		this.idtipoUsuario = idtipoUsuario;
	}

	@Column(name = "NOMBRE_TIPO_USUARIO", nullable = false, length = 45)
	public String getNombreTipoUsuario() {
		return this.nombreTipoUsuario;
	}

	public void setNombreTipoUsuario(String nombreTipoUsuario) {
		this.nombreTipoUsuario = nombreTipoUsuario;
	}

	@Column(name = "TIPO_USUARIO_DESCRIPCION", length = 100)
	public String getTipoUsuarioDescripcion() {
		return this.tipoUsuarioDescripcion;
	}

	public void setTipoUsuarioDescripcion(String tipoUsuarioDescripcion) {
		this.tipoUsuarioDescripcion = tipoUsuarioDescripcion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoUsuario")
	public Set<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoUsuario")
	public Set<Usuario> getUsuarios_1() {
		return this.usuarios_1;
	}

	public void setUsuarios_1(Set<Usuario> usuarios_1) {
		this.usuarios_1 = usuarios_1;
	}

}
