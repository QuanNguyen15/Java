package betamovie.betamovie.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.print.attribute.standard.MediaSize;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tbl_Schedule")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "Price")
    private double price;
    @Column(name = "StartAt")
    private Date startAt;
    @Column(name = "EndAt")
    private Date endAt;
    @Column(name = "Code")
    private String code;

    @ManyToOne
    @JoinColumn(name = "MovieId", referencedColumnName = "Id", insertable = false, updatable = false)
    @JsonBackReference
    private Movie movie;

    @Column(name = "Name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "RoomId", referencedColumnName = "Id", insertable = false, updatable = false)
    @JsonBackReference
    private Room room;

    @Column(name = "isActive")
    private boolean isActive;

    @OneToMany(mappedBy = "schedule", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Ticket> ticketList;



}
