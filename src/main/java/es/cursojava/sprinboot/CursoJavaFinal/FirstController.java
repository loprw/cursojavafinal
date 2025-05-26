package es.cursojava.sprinboot.CursoJavaFinal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class FirstController {

	@RequestMapping("/inicio")
	public String primerMetodo(Model model, HttpServletRequest req) {
		System.out.println("Mi primer controlador de Spring.");	
		model.addAttribute("mensaje", "David Juan Moreno Riera");
		model.addAttribute("palabra", req.getParameter("palabra"));
		return "hola";
	}
}
