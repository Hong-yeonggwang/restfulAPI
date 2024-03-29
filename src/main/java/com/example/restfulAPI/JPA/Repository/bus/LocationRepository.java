package com.example.restfulAPI.JPA.Repository.bus;

import com.example.restfulAPI.JPA.Entity.bus.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LocationRepository extends JpaRepository<Location,Long> {

    @Query(value = "select * from location where busstopseq is not null and LOCATIONTIME > DATE_FORMAT(DATE_ADD(now(),INTERVAL -5 MINUTE),'%Y-%m-%d %H:%i:%s')\n" +
            "group by deviceseq ORDER BY locationtime DESC LIMIT 0,500", nativeQuery = true)
    List<Location> searchLocation();
}
