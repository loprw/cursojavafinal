package es.cursojava.sprinboot.CursoJavaFinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) -> sin BBDD.
@SpringBootApplication
public class CursoJavaFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoJavaFinalApplication.class, args);
	}

}
