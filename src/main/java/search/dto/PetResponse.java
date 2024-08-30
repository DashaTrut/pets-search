package search.dto;

import lombok.*;
import search.model.Location;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PetResponse {
    private int id;

    private String name;

    private String city;

    private Location location;

    @Column(name = "loss_time")
    private LocalDateTime lossTime;

    private String description;

}
