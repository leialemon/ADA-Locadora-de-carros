package tech.ada.locadora_de_carros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class LocadoraDeCarrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocadoraDeCarrosApplication.class, args);
	}

}
