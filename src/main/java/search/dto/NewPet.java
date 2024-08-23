package search.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NewPet {
    @NotBlank
    private String name;
    @NotBlank
    private String city;
    @NotNull
    private double lat;
    @NotNull
    private double lon;

    private boolean isChip;

    private boolean isBrand;
    @Past
    @NotNull
    private LocalDateTime lossTime;
    @NotBlank
    private String description;

}
