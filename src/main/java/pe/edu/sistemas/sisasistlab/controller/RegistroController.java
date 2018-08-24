package pe.edu.sistemas.sisasistlab.controller;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pe.edu.sistemas.sisasistlab.domain.Docente;
import pe.edu.sistemas.sisasistlab.domain.LaboratorioAsist;
import pe.edu.sistemas.sisasistlab.domain.LaboratorioDisp;
import pe.edu.sistemas.sisasistlab.model.CursoModel;
import pe.edu.sistemas.sisasistlab.model.Search;
import pe.edu.sistemas.sisasistlab.service.CursoService;
import pe.edu.sistemas.sisasistlab.service.DocenteService;
import pe.edu.sistemas.sisasistlab.service.LaboratorioAsistService;
import pe.edu.sistemas.sisasistlab.service.LaboratorioDispService;

@Controller
public class RegistroController {
	
	@Autowired
	public DocenteService docservice;
	
	@Autowired
	public CursoService curservice;
	
	@Autowired
	public LaboratorioDispService labdispservice;
	
	@Autowired
	public LaboratorioAsistService labasistservice;
	
	protected final Log logger = LogFactory.getLog(RegistroController.class);
	
	Integer iddocenteg;
	List<CursoModel> listcursom = null ;
	
	@ModelAttribute("listaLaboratorioDisp")
	public List<LaboratorioDisp> listaLaboratorioDisp(){		
		List<LaboratorioDisp> listlabdisp = labdispservice.obtenerListaLaboratoriosDisp();	
		return listlabdisp;
	}
	
	@ModelAttribute("laboratorioAsist")
	public LaboratorioAsist LaboratorioAsist(){		
		LaboratorioAsist laboratorioAsist = new LaboratorioAsist();	
		return laboratorioAsist;
	}
	
	@GetMapping("/registro")
	public String vistaRegistro(Model model){
		List<Docente> listdoc = docservice.obtenerListaDocentePeriodoActual();
		
		model.addAttribute("listaDocente", listdoc);
		model.addAttribute("search", new Search());
		model.addAttribute("listaCursos", listcursom);
		// FALTA OBTENER DATA SOBRE LABORATORIOS ABIERTOS 
		return "/registro";
	}
	
	@GetMapping("/")
	public String vistaInicial(Model model){
		
		// FALTA OBTENER DATA SOBRE LABORATORIOS ABIERTOS 
		return "/index";
	}
	
	@RequestMapping(value="/cursos", method = RequestMethod.POST)
	public @ResponseBody List<CursoModel> buscarCursosDocente(ModelMap model, @RequestBody String iddocente){
		
		logger.info("ID del docente seleccionado: " + iddocente.replaceAll("\"",""));
		
		iddocenteg = Integer.parseInt(iddocente.replaceAll("\"",""));
		listcursom = curservice.obtenerListaCursosPeriodoxDocente(iddocenteg);
		
		return listcursom;
	}
	
	@RequestMapping(value="/laboratorio", method = RequestMethod.POST)
	public @ResponseBody Integer buscarLaboratorioCurso(ModelMap model, @RequestBody String idgrupocurso){
		
		logger.info("ID del curso-grupo seleccionado: " + idgrupocurso.replaceAll("\"","") + " ID DOCENTE: " + iddocenteg) ;
		

		LaboratorioDisp labdisp = labdispservice.obtenerLaboratorioxGrupoyDocente(Integer.parseInt(idgrupocurso.replaceAll("\"","")), iddocenteg);
		//if(labdisp!=null)
			//logger.info(labdisp.toString());
		return labdisp.getIdLaboratorioDisp();
	}
	
	@RequestMapping(value="/guardarAperturaLab", method = RequestMethod.POST)
	public @ResponseBody String guardarLaboratorioAsist(ModelMap model, @RequestBody LaboratorioAsist labAsist) {
		//Cómo consigo el involucrado?
		Date FechayHoraActual=new Date();
		labAsist.setLaboratorioAsistFecha(FechayHoraActual);
		labAsist.setLaboratorioAsistApertura(FechayHoraActual);
		labAsist.setLaboratorioAsistInvolucradoApertura(""); 	//Falta el nombre del involucrado
		
		boolean exito=labasistservice.insertarLaboratorioAsist(labAsist);
		if(exito)
			return "/registro";
		else
			return "/error";	//Faltaría crear una vista de error
		
	}
}
