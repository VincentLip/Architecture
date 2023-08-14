package org.example.repository.impl;

import org.example.entity.Plant;
import org.example.entity.PlantEntity;
import org.example.exception.NotFoundException;
import org.example.port.PlantRepository;
import org.example.repository.PlantEntityRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PlantRepositoryImpl implements PlantRepository {

    private final PlantEntityRepository plantEntityRepository;

    private final ModelMapper modelMapper;

    public PlantRepositoryImpl(PlantEntityRepository plantEntityRepository, ModelMapper modelMapper) {
        this.plantEntityRepository = plantEntityRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Plant save(Plant plant) {
        PlantEntity plantEntity = modelMapper.map(plant, PlantEntity.class);
        return modelMapper.map(plantEntityRepository.save(plantEntity), Plant.class);
    }

    @Override
    public Plant findById(int id) {
        Optional<PlantEntity> optionalPlantEntity = plantEntityRepository.findById(id);
        if(optionalPlantEntity.isPresent()){
            return modelMapper.map(optionalPlantEntity.get(), Plant.class);
        }
        throw new NotFoundException();
    }

    @Override
    public List<Plant> findAll() {
        return convertToListPlants((List<PlantEntity>) plantEntityRepository.findAll());
    }

    private List<Plant> convertToListPlants(List<PlantEntity> plantEntityList) {
        List<Plant> plantList = new ArrayList<>();
        plantEntityList.forEach(p ->plantList.add(modelMapper.map(p, Plant.class)));
        return plantList;
    }
}
