package pe.edu.sistemas.sisasistlab.service;

import java.util.List;

import pe.edu.sistemas.sisasistlab.domain.CursoPeriodo;
import pe.edu.sistemas.sisasistlab.domain.Grupo;
import pe.edu.sistemas.sisasistlab.model.CursoModel;

public interface CursoService {


	public abstract List<CursoModel> obtenerListaCursosPeriodoxDocente(Integer idDocente);

	public abstract List<CursoModel> convertirListCursoPeriodoAListCursoModel(List<Grupo> listGrupo);

	public abstract CursoModel convertirGrupoACursoModel(Grupo grupo);

}
