package betamovie.betamovie.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.print.attribute.standard.MediaSize;
import java.util.List;

@Entity
@Table(name = "tbl_Ticket")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "Code")
    private String code;

    @ManyToOne
    @JoinColumn(name = "ScheduleId", referencedColumnName = "Id",insertable = false, updatable = false)
    @JsonBackReference
    private Schedule schedule;

    @ManyToOne
    @JoinColumn(name = "SeatId", referencedColumnName = "Id", insertable = false, updatable = false)
    @JsonBackReference
    private Seat seat;


    @Column(name = "PriceTicket")
    private double priceTicket;
    @Column(name = "isActive")
    private boolean isActive;

    @OneToMany(mappedBy = "ticket")
    @JsonManagedReference
    private List<BillTicket>billTicketList;
}
