package org.example.service;

import org.example.entity.Plant;
import org.example.port.PlantRepository;
import org.example.port.PlantService;

import java.util.List;

public class PlantServiceImpl implements PlantService {

    private PlantRepository plantRepository;

    public PlantServiceImpl(PlantRepository plantRepository){
        this.plantRepository = plantRepository;
    }
    @Override
    public Plant createPlant(String name, String description, String url, String detail) {
        Plant plant = new Plant(name,description,url,detail);
        return plantRepository.save(plant);
    }

    @Override
    public List<Plant> getAllPlants() {
        return plantRepository.findAll();
    }

    @Override
    public Plant getPlantById(int id) {
        return plantRepository.findById(id);
    }

    @Override
    public Plant getWaterPlant(int id) {
        Plant oldWaterPlant = getPlantById(id);
        oldWaterPlant.setLevel(oldWaterPlant.getLevel()+1);
        return plantRepository.save(oldWaterPlant);
    }
}
