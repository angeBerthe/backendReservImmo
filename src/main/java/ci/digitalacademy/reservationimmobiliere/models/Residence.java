package ci.digitalacademy.reservationimmobiliere.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "residence")
public class Residence implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal price;
    private String description;
    private String name;
    private Integer NumberOfRooms;
    private Integer NumberOfShowers;
    private Integer NumberOfDiningRoom;
    private Integer NumberOfTerrace;
    private Integer NumberOfLounges;
    private boolean wifi;
    private boolean parking;
    private boolean catering;
    private boolean cleaning;
    private boolean available;

    @Column(unique = true)
    private String slug;

    @OneToMany(mappedBy = "residence", fetch = FetchType.EAGER)
    private List<Review> reviews;

    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Address address;

    @ManyToOne
    private Owner owner;

    @OneToMany(mappedBy = "residence",fetch = FetchType.EAGER )
    private List<PictureResidence> PictureResidences;
}
