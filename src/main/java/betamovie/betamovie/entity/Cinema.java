package betamovie.betamovie.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.print.attribute.standard.MediaSize;
import java.util.List;

@Entity
@Table(name = "tbl_Cinema")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cinema {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Address")
    private String address;
    @Column(name = "Description")
    private String description;
    @Column(name = "Code")
    private String code;
    @Column(name = "NameOfCinema")
    private String nameOfCinema;
    @Column(name = "isActive")
    private boolean isActive;


    @OneToMany(mappedBy = "cinema", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Room> roomList;

}
