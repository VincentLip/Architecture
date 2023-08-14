package org.example.repository;

import org.example.entity.PlantEntity;
import org.springframework.data.repository.CrudRepository;

public interface PlantEntityRepository extends CrudRepository<PlantEntity,Integer> {
}
