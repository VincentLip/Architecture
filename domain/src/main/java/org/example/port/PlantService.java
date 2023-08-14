package org.example.port;

import org.example.entity.Plant;

import java.util.List;

public interface PlantService {

    Plant createPlant(String name,String description,String url,String detail);
    List<Plant> getAllPlants();
    Plant getPlantById(int id);

    Plant getWaterPlant(int id);

}
