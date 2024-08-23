package search.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import search.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepositoryJpa extends JpaRepository<User, Integer> {

    Page<User> findByIdIn(List<Integer> ids, Pageable pageable);

    Optional<User> findByEmail(String email);
}
