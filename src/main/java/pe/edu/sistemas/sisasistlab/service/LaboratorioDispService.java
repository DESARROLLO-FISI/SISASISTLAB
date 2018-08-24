package pe.edu.sistemas.sisasistlab.service;

import java.util.List;

import pe.edu.sistemas.sisasistlab.domain.LaboratorioDisp;

public interface LaboratorioDispService {
	
	public abstract List<LaboratorioDisp> obtenerListaLaboratoriosDisp();

	public abstract LaboratorioDisp obtenerLaboratorioxGrupoyDocente(Integer idgrupo, Integer iddocente); 
	
	public abstract LaboratorioDisp obtenerLaboratorioDispxId(Integer id);
}
