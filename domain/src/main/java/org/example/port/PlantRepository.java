package org.example.port;

import org.example.entity.Plant;

import java.util.List;

public interface PlantRepository {

    Plant save(Plant plant);
    Plant findById(int id);
    List<Plant> findAll();


}
