package pe.edu.sistemas.sisasistlab.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.sistemas.sisasistlab.domain.CursoPeriodo;
import pe.edu.sistemas.sisasistlab.model.CursoModel;
import pe.edu.sistemas.sisasistlab.repository.CursoPeriodoRepository;
import pe.edu.sistemas.sisasistlab.repository.PeriodoRepository;
import pe.edu.sistemas.sisasistlab.service.CursoService;

@Service
public class CursoServiceImpl implements CursoService {
	
	@Autowired
	CursoPeriodoRepository cursoPerRep;
	
	@Autowired
	PeriodoRepository periodoRep;
	
	@Override
	public CursoModel convertirCursoPeriodoACursoModel(CursoPeriodo cursoPeriodo){
		CursoModel cursoModel = new CursoModel();
		//Obtener "Nombre Curso - Escuela"
		String nombrePlan = cursoPeriodo.ge
		String cursoNombreEscuela = cursoPeriodo.getCursoPeriodoNombre() + nombrePlan.substring(4);
		
		//
		cursoModel.setIdCursoPeriodo(cursoPeriodo.getIdcursoPeriodo());
		cursoModel.setCursoPeriodoNombre(cursoNombreEscuela);
		
		return cursoModel;
	}
	
	@Override
	public List<CursoModel> obtenerListaCursosPeriodoxDocente(Integer idDocente){
		//Obtener Periodo Actual
		String periodoActual = periodoRep.findFirstByOrderByIdperiodoDesc().getPeriodoNombre();
		
		return convertirListCursoPeriodoAListCursoModel(cursoPerRep.obtenerCursosPeriodoxDocente(periodoActual, idDocente)); //SEPARAR EN UN FUTURO
		
	}
	
	@Override
	public List<CursoModel> convertirListCursoPeriodoAListCursoModel(List<CursoPeriodo> listCursoPeriodo){
		List<CursoModel> listCursoModel = new ArrayList<>();
		
		for(CursoPeriodo cp: listCursoPeriodo){
			listCursoModel.add(convertirCursoPeriodoACursoModel(cp));
		}
		
		return listCursoModel;
	}
	
	
	
}
