package es.cursojava.sprinboot.CursoJavaFinal.ejercicios.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

	@Autowired
	private Usuario usuario;
	
	@GetMapping("/usuario")
	public String mostrarUsuario(Model model) {
		model.addAttribute("usuario", usuario);
		
		return "user";
	}
	
	@PostMapping("/procesar")
	public String procesarFormulario(@ModelAttribute Usuario usuario, Model model) {
		model.addAttribute("usuario", usuario);
		
		return "user_result";
	}
}
