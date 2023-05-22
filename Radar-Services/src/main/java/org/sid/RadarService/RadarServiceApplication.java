package org.sid.RadarService;

import org.sid.RadarService.entities.Radar;
import org.sid.RadarService.feign.ImmatriculationFeignClient;
import org.sid.RadarService.feign.InfractionFeignClient;
import org.sid.RadarService.repositories.RadarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Random;

@SpringBootApplication
@EnableFeignClients
public class RadarServiceApplication {
	private final RadarRepository radarRepository;
	private final ImmatriculationFeignClient immatriculationFeignClient;
	private final InfractionFeignClient infractionFeignClient;

	public RadarServiceApplication(RadarRepository radarRepository, ImmatriculationFeignClient immatriculationFeignClient, InfractionFeignClient infractionFeignClient) {
		this.radarRepository = radarRepository;
		this.immatriculationFeignClient = immatriculationFeignClient;
		this.infractionFeignClient = infractionFeignClient;
	}

	public static void main(String[] args) {
		SpringApplication.run(RadarServiceApplication.class, args);
	}
	@Bean
	public void start() throws Exception {
		// Add some radars
		for(int i = 0; i < 10; i++) {
			Radar radar = new Radar();
			radar.setVitesseMaxRadar(100+i );
			radar.setLatitude(50.0 + i);
			radar.setLongitude(13.0 + i);
			radarRepository.save(radar);
			System.out.println(radar);
		}
	}
}
