package org.sid.RadarService.feign;

import org.sid.RadarService.model.Infraction;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name ="INFRACTION-SERVICE")
public interface InfractionFeignClient {
    // Get infraction
    @GetMapping("/api/infractions/{id}")
    Infraction getInfraction(@PathVariable("id") Integer id);

    // Get infractions by radar id
    @GetMapping("/api/infractions/radar/{id}")
    List<Infraction> getInfractionsByRadarId(@PathVariable("id") Integer id);

    // Save infraction
    @PostMapping("/api/infractions")
    Infraction saveInfraction(@RequestBody Infraction infraction);
}
