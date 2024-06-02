package com.ucentral.CampeonatoProy;

import com.ucentral.CampeonatoProy.entity.Equipos;
import com.ucentral.CampeonatoProy.repository.EquiposRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CampeonatoProyApplication {

	public static void main(String[] args) {
		SpringApplication.run(CampeonatoProyApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(EquiposRepository equiposRepository) {
		return args -> {
				List<Equipos> equipos = Arrays.asList(
						new Equipos("Tejares", "Azul", "Camilo", "Postobon", "Calle 1 #54-05", "TejaresCancha"),
						new Equipos("Aurora", "Rojo", "Pedro", "Aguila", "Carrera 54 #21-08", "CanchaAurora"),
						new Equipos("Brasilia", "Verde", "Jesus", "D1", "Calle 95 sur #1-24", "Brasilia")
						);
				equiposRepository.saveAll(equipos);
		};
	};

}
