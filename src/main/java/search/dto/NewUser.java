package search.dto;

import lombok.*;
import search.model.Location;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NewUser {

    @Email
    @NotBlank
    private String email;
    @NotBlank
    private String name;
    @NotBlank
    private String city;

    //private List<Location> places;

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
