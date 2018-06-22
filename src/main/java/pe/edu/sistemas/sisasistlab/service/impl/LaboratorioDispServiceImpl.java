package pe.edu.sistemas.sisasistlab.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.sistemas.sisasistlab.domain.LaboratorioDisp;
import pe.edu.sistemas.sisasistlab.repository.LaboratorioDispRepository;
import pe.edu.sistemas.sisasistlab.service.LaboratorioDispService;

@Service
public class LaboratorioDispServiceImpl implements LaboratorioDispService{
	
	@Autowired
	LaboratorioDispRepository labDispRep;
	
	
	@Override
	public List<LaboratorioDisp> obtenerListaLaboratoriosDisp() {
		return labDispRep.obtenerLaboratoriosDisponibles();
	}

}
