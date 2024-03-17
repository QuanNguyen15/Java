package betamovie.betamovie.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.print.attribute.standard.MediaSize;

@Entity
@Table(name = "tbl_BillFood")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BillFood {
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
    @JoinColumn(name = "FoodId", referencedColumnName = "Id")
    @JsonBackReference
    private Food food;

}
