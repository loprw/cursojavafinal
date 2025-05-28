package es.cursojava.sprinboot.CursoJavaFinal.ejercicios.caballo;

import org.springframework.stereotype.Service;

@Service
public class CaballoService {
	
	private Caballo caballo;

	public CaballoService(Caballo caballo) {
		this.caballo = caballo;
	}

	public CaballoService() {
	}

	public Caballo getCaballo() {
		return caballo;
	}

	public void setCaballo(Caballo caballo) {
		this.caballo = caballo;
	}
}
