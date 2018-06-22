package pe.edu.sistemas.sisasistlab.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.sistemas.sisasistlab.domain.LaboratorioAsist;
import pe.edu.sistemas.sisasistlab.repository.LaboratorioAsistRepository;
import pe.edu.sistemas.sisasistlab.service.LaboratorioAsistService;

@Service
public class LaboratorioAsistServiceImpl implements LaboratorioAsistService{

	@Autowired
	LaboratorioAsistRepository labAsistRep;
	
	@Override
	public boolean insertarLaboratorioAsist(LaboratorioAsist labAsist){
		LaboratorioAsist labAsistTemp = labAsistRep.save(labAsist);
		
		if(labAsistTemp != null)
			return true;
		
		return false;
	}
		
}
