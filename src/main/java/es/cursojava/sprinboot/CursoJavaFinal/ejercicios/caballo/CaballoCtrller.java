package es.cursojava.sprinboot.CursoJavaFinal.ejercicios.caballo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import es.cursojava.sprinboot.CursoJavaFinal.repositories.CaballoRepository;

@Controller
public class CaballoCtrller {

	@Autowired
	private Caballo caballo;
	
	@Autowired
	private CaballoRepository repo;

	public CaballoCtrller() {
	}

	public CaballoCtrller(Caballo caballo) { 
		this.caballo = caballo;
	}
	
	@GetMapping("/caballo")
	public ModelAndView inicio(@ModelAttribute Caballo caballo) {
		
		return new ModelAndView("caballos/formulario_caballo", "caballoAtr", caballo);
	}
	
	@PostMapping("/procesa_caballo")
	public String procesarCaballo(@ModelAttribute Caballo caballo, Model model) {
		repo.save(caballo);
		
		model.addAttribute("caballoAtrb", caballo);
		return "caballos/respuesta_caballos";
	}
	
	@GetMapping("/consulta_caballos")
	public ModelAndView consultarCaballos() {
		List<Caballo> listadoCaballos = repo.findAll();
		
		return new ModelAndView("caballos/consulta_caballos", "caballos", listadoCaballos);
	}
	
	@PostMapping("/filtra_caballos")
	public ModelAndView filtrarCaballos(@RequestParam("nombre_caballo") String nombre) {
		List<Caballo> listadoCaballos = repo.findByNombre(nombre);
		
		return new ModelAndView("caballos/consulta_caballos", "caballos", listadoCaballos);
	} 
		
}
