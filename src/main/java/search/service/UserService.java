package search.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import search.exception.EntityNotFoundException;
import search.model.User;
import search.repository.UserRepositoryJpa;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepositoryJpa userRepositoryJpa;


    public User getUser(Integer userId) {
        return userRepositoryJpa.findById(userId).orElseThrow(() ->
                new EntityNotFoundException("Зарегистрированного пользователя не существует"));
    }
}
