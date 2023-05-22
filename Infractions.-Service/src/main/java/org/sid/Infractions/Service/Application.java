package org.sid.Infractions.Service;

import org.sid.Infractions.Service.entities.Infraction;
import org.sid.Infractions.Service.repositories.InfractionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.Random;

@SpringBootApplication
public class Application {
	Random random=new Random();

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
@Bean
	CommandLineRunner start(InfractionRepository infractionRepository){
		return args -> {
			infractionRepository.save(new Infraction(null, new Date(),random.nextInt(),random.nextInt(),random.nextInt(120,150),random.nextInt(61,120),random.nextFloat(100,400)));
			infractionRepository.save(new Infraction(null, new Date(),random.nextInt(),random.nextInt(),random.nextInt(120,150),random.nextInt(61,120),random.nextFloat(100,400)));
			infractionRepository.save(new Infraction(null, new Date(),random.nextInt(),random.nextInt(),random.nextInt(120,150),random.nextInt(61,120),random.nextFloat(100,400)));
			infractionRepository.save(new Infraction(null, new Date(),random.nextInt(),random.nextInt(),random.nextInt(120,150),random.nextInt(61,120),random.nextFloat(100,400)));
			infractionRepository.save(new Infraction(null, new Date(),random.nextInt(),random.nextInt(),random.nextInt(120,150),random.nextInt(61,120),random.nextFloat(100,400)));
			infractionRepository.save(new Infraction(null, new Date(),random.nextInt(),random.nextInt(),random.nextInt(120,150),random.nextInt(61,120),random.nextFloat(100,400)));
			infractionRepository.save(new Infraction(null, new Date(),random.nextInt(),random.nextInt(),random.nextInt(120,150),random.nextInt(61,120),random.nextFloat(100,400)));
			infractionRepository.save(new Infraction(null, new Date(),random.nextInt(),random.nextInt(),random.nextInt(120,150),random.nextInt(61,120),random.nextFloat(100,400)));
			infractionRepository.save(new Infraction(null, new Date(),random.nextInt(),random.nextInt(),random.nextInt(120,150),random.nextInt(61,120),random.nextFloat(100,400)));
			infractionRepository.save(new Infraction(null, new Date(),random.nextInt(),random.nextInt(),random.nextInt(120,150),random.nextInt(61,120),random.nextFloat(100,400)));
			infractionRepository.save(new Infraction(null, new Date(),random.nextInt(),random.nextInt(),random.nextInt(120,150),random.nextInt(61,120),random.nextFloat(100,400)));
		};
}
}
