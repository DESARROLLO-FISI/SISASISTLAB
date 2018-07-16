package pe.edu.sistemas.sisasistlab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConsultaController {
	@GetMapping("/consulta")
	public String vistaConsulta(Model model) {
		return "/consulta";
	}
}
