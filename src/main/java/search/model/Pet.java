package search.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pets", schema = "public")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String city;
    @ManyToOne(fetch = FetchType.LAZY) //думаю, что на одну локацию может быть несколько потеряшек
    @JoinColumn(name = "location_id")
    private Location location;

    @Column(name = "chip")
    private boolean isChip;
    //клеймо
    @Column(name = "brand")
    private boolean isBrand;

    @Column(name = "loss_time")
    private LocalDateTime lossTime;

    private String description;

}
