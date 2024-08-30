package search.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import search.model.Pet;

public interface PetRepositoryJpa extends JpaRepository<Pet, Integer> {

}
