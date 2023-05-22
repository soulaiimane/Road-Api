package org.sid.ImmatriculationService;

import org.sid.ImmatriculationService.entities.Proprietaire;
import org.sid.ImmatriculationService.entities.Vehicule;
import org.sid.ImmatriculationService.repositories.ProprietaireRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.sid.ImmatriculationService.repositories.VehiculeRepository;

import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class ImmatriculationServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ImmatriculationServiceApplication.class, args);
	}
	Random random=new Random();
	@Bean
	CommandLineRunner start(ProprietaireRepository proprietaireRepository, VehiculeRepository vehculeRepository){
		return args -> {
			Stream.of("Mohamed","Hassan","Mostafa","khansae","Fatima","Khadija","saida","fakhita","samira").forEach(
					p->{
					Proprietaire proprietaire=Proprietaire.builder()
							.Id(random.nextInt())
							.nom(p)
							.email(p+"@gmail.com")
							.datecreat(new Date())
							.build();
						proprietaireRepository.save(proprietaire);
					});
				proprietaireRepository.findAll().forEach(proprietaire -> {

					Stream.of("Crossover","Targa","Coupé","Break","Minibus","Fourgonnette","Berline","SUV")
							.forEach(v->{

					for (int i=0; i<10;i++){
						Vehicule vehicule=Vehicule.builder()
								.Id(random.nextInt())
								.nom(v)
								.marque("KIA")
								.modele(v+random.nextInt(2000,2023))
								.puissFiscal(random.nextInt(0,1500))
								.matricule(UUID.randomUUID().toString())
								.proprietaire(proprietaire)
								.build();
						vehculeRepository.save(vehicule);

					}});

				});
		};

	}
	
}
