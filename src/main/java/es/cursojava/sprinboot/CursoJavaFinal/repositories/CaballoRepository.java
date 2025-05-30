package es.cursojava.sprinboot.CursoJavaFinal.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.cursojava.sprinboot.CursoJavaFinal.ejercicios.caballo.Caballo;

public interface CaballoRepository extends JpaRepository<Caballo, Long> {

	public List<Caballo> findByNombre(String nombre);
}
