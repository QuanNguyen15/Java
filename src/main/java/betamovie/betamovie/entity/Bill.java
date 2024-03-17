package betamovie.betamovie.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @Column(name = "TotalMoney")
    private double totalMoney;

    @Column(name = "TradingCode")
    private String tradingCode;

    @Column(name = "CreateTime")
    private Date createTime;

    @ManyToOne
    @JoinColumn(name = "CustomerId", referencedColumnName = "Id", insertable = false, updatable = false)
    @JsonBackReference
    private User user;

    @Column(name = "Name")
    private String name;

    @Column(name = "UpdateTime")
    private Date updateTime;

    @ManyToOne
    @JoinColumn(name = "PromotionId", referencedColumnName = "Id", insertable = false, updatable = false)
    @JsonBackReference
    private Promotion promotion;

    @ManyToOne
    @JoinColumn(name = "BillStatusId", referencedColumnName = "Id", insertable = false, updatable = false)
    @JsonBackReference
    private BillStatus billStatus;

    private boolean isActive;


    @OneToMany(mappedBy = "bill")
    @JsonManagedReference
    private List<BillFood> billFoodList;

    @OneToMany(mappedBy = "bill")
    @JsonManagedReference
    private List<BillTicket> billTicketsList;


}