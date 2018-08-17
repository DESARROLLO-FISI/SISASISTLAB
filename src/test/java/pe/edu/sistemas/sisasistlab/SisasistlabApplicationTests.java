package pe.edu.sistemas.sisasistlab;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.sistemas.sisasistlab.domain.Aula;
import pe.edu.sistemas.sisasistlab.domain.CursoPeriodo;
import pe.edu.sistemas.sisasistlab.domain.Docente;
import pe.edu.sistemas.sisasistlab.domain.LaboratorioDisp;
import pe.edu.sistemas.sisasistlab.domain.Periodo;
import pe.edu.sistemas.sisasistlab.model.CursoModel;
import pe.edu.sistemas.sisasistlab.repository.AulaRepository;
import pe.edu.sistemas.sisasistlab.repository.CursoPeriodoRepository;
import pe.edu.sistemas.sisasistlab.repository.DocenteRepository;
import pe.edu.sistemas.sisasistlab.repository.LaboratorioDispRepository;
import pe.edu.sistemas.sisasistlab.repository.PeriodoRepository;
import pe.edu.sistemas.sisasistlab.service.CursoService;
import pe.edu.sistemas.sisasistlab.service.LaboratorioDispService;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class SisasistlabApplicationTests {
	
	protected final Log logger = LogFactory.getLog(SisasistlabApplicationTests.class);
	
	@Autowired
	AulaRepository aulaRepTest;
	
	@Autowired
	DocenteRepository docRepTest;
	
	@Autowired
	PeriodoRepository perRepTest;
	
	@Autowired
	CursoPeriodoRepository curPerRepTest;
	
	@Autowired
	LaboratorioDispRepository labDispRepTest;
	
	@Autowired
	CursoService cursoServTest;
	
	@Autowired
	LaboratorioDispService labDispServTest;

	@Test
	@Ignore
	public void listaDocentes() {
		List<Docente> listDoc = docRepTest.findAll();
		logger.info("MOSTRAR LISTA DE DOCENTE");
		for(Docente d: listDoc){
			logger.info("----");
			logger.info(d.getPersona().toString());
		}
		
	}
	
	@Test
	@Ignore
	public void obtenerDocente() {
		Integer idDocente = 1;
		Docente doc = docRepTest.findByIddocente(idDocente);
		logger.info("MOSTRAR DOCENTE");
		logger.info("----");
		logger.info(doc.getPersona().toString());
		
	}
	
	@Test
	@Ignore
	public void obtenerUltimoPeriodo() {
		Periodo per = perRepTest.findFirstByOrderByIdperiodoDesc();
		logger.info("MOSTRAR PERIODO ACTUAL");
		logger.info("----");
		logger.info(per.getPeriodoNombre());
		
	}
	
	@Test
	@Ignore
	public void listaDocentesActual() {
		Periodo per = perRepTest.findFirstByOrderByIdperiodoDesc();
		List<Docente> listDoc = docRepTest.obtenerDocentesxPeriodoActual(per.getPeriodoNombre());
		logger.info("MOSTRAR LISTA DE DOCENTE ACTUAL");
		for(Docente d: listDoc){
			logger.info("----");
			logger.info(d.getPersona().toString());
			
		}
		logger.info("TAMAÑO DE LA LISTA: " + listDoc.size());
		
		
	}
	
	@Test
	@Ignore
	public void listaCursosxDocentesActual() {
		Periodo per = perRepTest.findFirstByOrderByIdperiodoDesc();
		Integer idDocente = 1;
		List<CursoPeriodo> listCurPer = curPerRepTest.obtenerCursosPeriodoxDocente(per.getPeriodoNombre(), idDocente);
		logger.info("MOSTRAR LISTA DE CURSOS X DOCENTE ACTUAL");
		for(CursoPeriodo cp: listCurPer){
			logger.info("----");
			logger.info(cp.toString());
			
		}
		logger.info("TAMAÑO DE LA LISTA: " + listCurPer.size());
		
		
	}
	
	@Test
	@Ignore
	public void listaLaboratoriosDisp() {
		List<LaboratorioDisp> listLabDisp = labDispRepTest.obtenerLaboratoriosDisponibles();
		
		logger.info("MOSTRAR LISTA LABOS DISPONIBLES");
		for(LaboratorioDisp ld: listLabDisp){
			logger.info("----");
			logger.info(ld.toString());
			
		}
		logger.info("TAMAÑO DE LA LISTA: " + listLabDisp.size());
		
		
	}
	
	@Test
	@Ignore
	public void listaCursoModelPorDocente() {
		List<CursoModel> listCursoModel = cursoServTest.obtenerListaCursosPeriodoxDocente(1);
		
		logger.info("MOSTRAR LISTA CURSOS POR DOCENTE");
		for(CursoModel lcm: listCursoModel){
			logger.info("----");
			logger.info(lcm.toString());
			
		}
		logger.info("TAMAÑO DE LA LISTA: " + listCursoModel.size());
		
	}
	
	
	@Test
	@Ignore
	public void obtenerLaboratorioxCursoyDocente() {
		Aula aula_grupo = labDispRepTest.obtenerLaboratorioxGrupoyDocente(3662, 43);
		
		
		LaboratorioDisp labdisp = labDispRepTest.findByAula(aula_grupo);
		
		logger.info("MOSTRAR LABORATORIO DE UN DOCENTE Y CURSO");
		
		logger.info("NOMBRE AULA: " + labdisp.getAula().getNombre());
		
	}
	
	@Test
	public void obtenerLaboratorioxCursoyDocenteService() {
		
		
		LaboratorioDisp labdisp = labDispServTest.obtenerLaboratorioxGrupoyDocente(3662, 43);
		
		logger.info("MOSTRAR LABORATORIO DE UN DOCENTE Y CURSO");
		
		logger.info("NOMBRE AULA: " + labdisp.getAula().getNombre());
		
	}
	
	
	

}
