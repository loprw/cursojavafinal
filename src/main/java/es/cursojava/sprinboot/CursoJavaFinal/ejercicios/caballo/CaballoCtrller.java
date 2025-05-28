package es.cursojava.sprinboot.CursoJavaFinal.ejercicios.caballo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CaballoCtrller {

	@Autowired
	private Caballo caballo;

	public CaballoCtrller() {
	}

	public CaballoCtrller(Caballo caballo) { 
		this.caballo = caballo;
	}
	
	@GetMapping("/caballo")
	public ModelAndView inicio(@ModelAttribute Caballo caballo) {
		
		return new ModelAndView("formulario_caballo", "caballoAtr", caballo);
	}
	
	@GetMapping("/procesa_caballo")
	public ModelAndView procesarCaballo(@ModelAttribute Caballo caballo) {
		
		return new ModelAndView("respuesta_caballos", "caballoAtr", caballo);
	}
}
