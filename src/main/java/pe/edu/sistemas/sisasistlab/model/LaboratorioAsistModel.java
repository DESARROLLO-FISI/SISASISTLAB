package pe.edu.sistemas.sisasistlab.model;

import java.util.Date;

public class LaboratorioAsistModel {
	private int idLaboratorioAsist;
	private int idcurso;
	private int iddocente;
	private Date laboratorioAsistApertura;
	private Date laboratorioAsistCierre;
	private Date laboratorioAsistFecha;
	private int aulaIdaula;
	private String InvolucradoApertura;
	private String InvolucradoCierre;
	
	
	public int getIdLaboratorioAsist() {
		return idLaboratorioAsist;
	}
	public void setIdLaboratorioAsist(int idLaboratorioAsist) {
		this.idLaboratorioAsist = idLaboratorioAsist;
	}
	public int getIdcurso() {
		return idcurso;
	}
	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}
	public int getIddocente() {
		return iddocente;
	}
	public void setIddocente(int iddocente) {
		this.iddocente = iddocente;
	}
	public Date getLaboratorioAsistApertura() {
		return laboratorioAsistApertura;
	}
	public void setLaboratorioAsistApertura(Date laboratorioAsistApertura) {
		this.laboratorioAsistApertura = laboratorioAsistApertura;
	}
	public Date getLaboratorioAsistCierre() {
		return laboratorioAsistCierre;
	}
	public void setLaboratorioAsistCierre(Date laboratorioAsistCierre) {
		this.laboratorioAsistCierre = laboratorioAsistCierre;
	}
	public Date getLaboratorioAsistFecha() {
		return laboratorioAsistFecha;
	}
	public void setLaboratorioAsistFecha(Date laboratorioAsistFecha) {
		this.laboratorioAsistFecha = laboratorioAsistFecha;
	}
	public int getAulaIdaula() {
		return aulaIdaula;
	}
	public void setAulaIdaula(int aulaIdaula) {
		this.aulaIdaula = aulaIdaula;
	}
	public String getInvolucradoApertura() {
		return InvolucradoApertura;
	}
	public void setInvolucradoApertura(String laboratorioAsistInvolucradoApertura) {
		this.InvolucradoApertura = laboratorioAsistInvolucradoApertura;
	}
	public String getInvolucradoCierre() {
		return InvolucradoCierre;
	}
	public void setInvolucradoCierre(String laboratorioAsistInvolucradoCierre) {
		this.InvolucradoCierre = laboratorioAsistInvolucradoCierre;
	}
	
}
