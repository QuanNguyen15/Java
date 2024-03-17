package betamovie.betamovie.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.lang.model.element.Name;
import javax.print.attribute.standard.MediaSize;
import javax.swing.*;

@Entity
@Table(name = "tbl_Seat")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "Number")
    private int number;
    @ManyToOne
    @JoinColumn(name = "SeatStatusId", referencedColumnName = "Id", insertable = false, updatable = false)
    @JsonBackReference
    private SeatStatus seatStatus;
    @Column(name = "Line")
    private String line;

    @ManyToOne
    @JoinColumn(name = "RoomId", referencedColumnName = "Id", insertable = false, updatable = false)
    @JsonBackReference
    private Room room;

    @Column(name = "isActive")
    private boolean isActive;
    @ManyToOne
    @JoinColumn(name = "SeatTypeId", referencedColumnName = "Id", insertable = false, updatable = false)
    @JsonBackReference
    private SeatType seatType;

}
