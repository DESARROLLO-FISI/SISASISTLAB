package pe.edu.sistemas.sisasistlab.service.impl;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.sistemas.sisasistlab.domain.CursoPeriodo;
import pe.edu.sistemas.sisasistlab.domain.Grupo;
import pe.edu.sistemas.sisasistlab.model.CursoModel;
import pe.edu.sistemas.sisasistlab.repository.CursoPeriodoRepository;
import pe.edu.sistemas.sisasistlab.repository.GrupoRepository;
import pe.edu.sistemas.sisasistlab.repository.PeriodoRepository;
import pe.edu.sistemas.sisasistlab.service.CursoService;

@Service
public class CursoServiceImpl implements CursoService {
	
	@Autowired
	CursoPeriodoRepository cursoPerRep;
	
	@Autowired
	GrupoRepository grupoRep;
	
	@Autowired
	PeriodoRepository periodoRep;
	
	@Override
	public List<CursoModel> obtenerListaCursosPeriodoxDocente(Integer idDocente){
		//Obtener Periodo Actual
		String periodoActual = periodoRep.findFirstByOrderByIdperiodoDesc().getPeriodoNombre();
		
		return convertirListCursoPeriodoAListCursoModel(grupoRep.obtenerGruposxDocente(periodoActual, idDocente)); //SEPARAR EN UN FUTURO
		
	}
	
	@Override
	public List<CursoModel> convertirListCursoPeriodoAListCursoModel(List<Grupo> listGrupos){
		List<CursoModel> listCursoModel = new ArrayList<>();
		
		for(Grupo cp: listGrupos){
			listCursoModel.add(convertirGrupoACursoModel(cp));
		}
		
		return listCursoModel;
	}
	
	@Override
	public CursoModel convertirGrupoACursoModel(Grupo grupo){
		CursoModel cursoModel = new CursoModel();
		//Obtener "Nombre Curso - Escuela"
		String nombrePlan = grupo.getCursoPeriodo().getCursoConjunto().getCursoBase().getPlan().getPlanNombre();
		String cursoNombreEscuela = grupo.getCursoPeriodo().getCursoPeriodoNombre() + "-Grupo:" + grupo.getGrupoNumero() + nombrePlan.substring(4);
		
		
		cursoModel.setIdGrupo(grupo.getIdgrupo());
		cursoModel.setCursoPeriodoNombre(cursoNombreEscuela);
		System.out.println(grupo);
		return cursoModel;
	}
	
}
