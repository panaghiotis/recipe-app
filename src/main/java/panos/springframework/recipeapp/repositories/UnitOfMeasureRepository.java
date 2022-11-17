package panos.springframework.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import panos.springframework.recipeapp.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
