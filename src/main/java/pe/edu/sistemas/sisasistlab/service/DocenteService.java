package pe.edu.sistemas.sisasistlab.service;

import java.util.List;

import pe.edu.sistemas.sisasistlab.domain.Docente;

public interface DocenteService {

	abstract List<Docente> obtenerListaDocentePeriodoActual();
	
}
