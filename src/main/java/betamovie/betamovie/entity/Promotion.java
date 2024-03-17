package betamovie.betamovie.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.print.attribute.standard.MediaSize;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "tbl_Promotion")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "Percent")
    private int percent;
    @Column(name = "Quantity")
    private int quantity;
    @Column(name = "Type")
    private String type;
    @Column(name = "StartTime")
    private Date starTime;
    @Column(name = "EndTime")
    private Date endTime;
    @Column(name = "Description")
    private String description;
    @Column(name = "Name")
    private String name;
    @Column(name = "isActive")
    private boolean isActive;

    @ManyToOne
    @JoinColumn(name = "RankCustomerId", referencedColumnName = "Id", insertable = false, updatable = false)
    @JsonBackReference
    private RankCustomer rankCustomer;

    @OneToMany(mappedBy = "promotion")
    @JsonManagedReference
    private List<Bill> billList;

}
