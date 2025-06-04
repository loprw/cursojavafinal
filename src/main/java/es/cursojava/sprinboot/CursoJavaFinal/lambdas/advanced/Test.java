package es.cursojava.sprinboot.CursoJavaFinal.lambdas.advanced;

import java.util.Arrays;

import es.cursojava.sprinboot.CursoJavaFinal.lambdas.advanced.dao.Producto;
import es.cursojava.sprinboot.CursoJavaFinal.lambdas.advanced.dao.ProductoDAO;
import es.cursojava.sprinboot.CursoJavaFinal.lambdas.advanced.models.Cliente;

public class Test {

	public static void main(String[] args) {
		EjemploConsumer ec = new EjemploConsumer();
		ec.getProductos( () -> {
        	ProductoDAO pDAO = new ProductoDAO(null);
        	return pDAO.getProductos();
        } );
		
		ec.getProductos(() -> Arrays.asList(new Producto()) );
		
		
		ec.generaNombre("Jose");
		

	}
	
	public static void pintaNombreCliente(Cliente cliente) {
		System.out.println(cliente.getNombre());
	}

}
