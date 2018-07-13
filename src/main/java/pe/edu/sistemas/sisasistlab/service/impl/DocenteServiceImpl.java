package pe.edu.sistemas.sisasistlab.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.sistemas.sisasistlab.domain.Docente;
import pe.edu.sistemas.sisasistlab.repository.DocenteRepository;
import pe.edu.sistemas.sisasistlab.repository.PeriodoRepository;
import pe.edu.sistemas.sisasistlab.service.DocenteService;

@Service
public class DocenteServiceImpl implements DocenteService {
	
	@Autowired
	DocenteRepository docRep;
	
	@Autowired
	PeriodoRepository periodoRep;
	
	@Override
	public List<Docente> obtenerListaDocentePeriodoActual(){
		String periodoActual = periodoRep.findFirstByOrderByIdperiodoDesc().getPeriodoNombre();
		
		List<Docente> listdoc = docRep.obtenerDocentesxPeriodoActual(periodoActual);
		
		return listdoc;
	}
}
