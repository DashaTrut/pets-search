package search.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import search.model.Location;
import search.model.User;

public interface LocationRepositoryJpa  extends JpaRepository<Location, Integer> {
}
