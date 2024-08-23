package search;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/", "/home").permitAll() // Эти страницы доступны всем без авторизации
                .anyRequest().authenticated() // Все остальные страницы требуют авторизации
                .and()
                .formLogin()
                .loginPage("/login") // Настраиваем свою страницу логина
                .permitAll() // Доступ к странице логина разрешён всем
                .and()
                .logout()
                .permitAll(); // Доступ к logout разрешён всем
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("user") // Создаём пользователя с именем "user"
                .password("{noop}password") // Пароль пользователя (noop означает, что пароль не зашифрован)
                .roles("USER"); // Назначаем роль "USER"
    }
}

