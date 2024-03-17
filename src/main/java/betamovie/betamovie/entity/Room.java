package betamovie.betamovie.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.lang.model.element.Name;
import javax.print.attribute.standard.MediaSize;
import java.util.List;

@Entity
@Table(name = "tbl_Room")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "Capacity")
    private int capacity;
    @Column(name = "Description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "CinemaId", referencedColumnName = "Id", insertable = false, updatable = false)
    @JsonBackReference
    private Cinema cinema;

    @Column(name = "Code")
    private String code;

    @Column(name = "Name")
    private String name;

    @Column(name = "isActive")
    private boolean isActive;

    @OneToMany(mappedBy = "room")
    @JsonManagedReference
    private List<Seat> seatList;

    @OneToMany(mappedBy = "room")
    @JsonManagedReference
    private List<Schedule> scheduleList;
}
