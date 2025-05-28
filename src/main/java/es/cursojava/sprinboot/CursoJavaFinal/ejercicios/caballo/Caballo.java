package es.cursojava.sprinboot.CursoJavaFinal.ejercicios.caballo;

import org.springframework.stereotype.Component;

@Component
public class Caballo {

	private String nombre;
	private int edad;
	private double velocidadMaxima;
	private boolean activo;
	
	public Caballo() {
	}

	public Caballo(String nombre, int edad, double velocidadMaxima, boolean activo) {
		this.nombre = nombre;
		this.edad = edad;
		this.velocidadMaxima = velocidadMaxima;
		this.activo = activo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
}
