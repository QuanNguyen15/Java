package betamovie.betamovie.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.print.attribute.standard.MediaSize;

@Entity
@Table(name = "tbl_BillTicket")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BillTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @Column(name = "Quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "BillId", referencedColumnName = "Id")
    @JsonBackReference
    private Bill bill;

    @ManyToOne
    @JoinColumn(name = "TicketId", referencedColumnName = "Id")
    @JsonBackReference
    private Ticket ticket;



}