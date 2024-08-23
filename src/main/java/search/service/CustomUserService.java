package search.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import search.CustomUserDetails;
import search.model.User;
import search.repository.UserRepositoryJpa;

@Service
@RequiredArgsConstructor
public class CustomUserService implements UserDetailsService {

    private final UserRepositoryJpa userRepositoryJpa;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepositoryJpa.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Нет пользователя с таким email: " + email));
        return new CustomUserDetails(user);
    }
}
