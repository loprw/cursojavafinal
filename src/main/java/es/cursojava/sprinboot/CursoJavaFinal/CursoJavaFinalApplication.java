package es.cursojava.sprinboot.CursoJavaFinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CursoJavaFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoJavaFinalApplication.class, args);
	}

}
