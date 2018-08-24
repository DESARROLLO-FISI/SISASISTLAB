package pe.edu.sistemas.sisasistlab.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.sistemas.sisasistlab.domain.LaboratorioAsist;
import pe.edu.sistemas.sisasistlab.model.LaboratorioAsistModel;
import pe.edu.sistemas.sisasistlab.repository.DocenteRepository;
import pe.edu.sistemas.sisasistlab.repository.GrupoRepository;
import pe.edu.sistemas.sisasistlab.repository.LaboratorioAsistRepository;
import pe.edu.sistemas.sisasistlab.service.LaboratorioAsistService;
import pe.edu.sistemas.sisasistlab.service.LaboratorioDispService;

@Service
public class LaboratorioAsistServiceImpl implements LaboratorioAsistService{

	@Autowired
	LaboratorioAsistRepository labAsistRep;
	@Autowired
	LaboratorioDispService labDispServ;
	@Autowired
	DocenteRepository docRep;
	@Autowired
	GrupoRepository grupoRep;
	
	@Override
	public boolean insertarLaboratorioAsist(LaboratorioAsistModel labAsistModel){
		LaboratorioAsist labAsist = new LaboratorioAsist();
		
		labAsist.setLaboratorioDisp(labDispServ.obtenerLaboratorioDispxId(labAsistModel.getAulaIdaula()));
		System.out.println(labAsistModel.getIddocente());
		labAsist.setDocente(docRep.findByIddocente(labAsistModel.getIddocente()));
		labAsist.setGrupo(grupoRep.findByidgrupo(labAsistModel.getIdcurso()));
		labAsist.setLaboratorioAsistInvolucradoApertura(labAsistModel.getInvolucradoApertura());
		Date fechaActual= new Date();
		labAsist.setLaboratorioAsistApertura(fechaActual);	//Hora de apertura
		labAsist.setLaboratorioAsistFecha(fechaActual);		//Fecha
		
		LaboratorioAsist labAsistTemp = labAsistRep.save(labAsist);
		
		if(labAsistTemp != null)
			return true;
		
		return false;
	}
		
}
