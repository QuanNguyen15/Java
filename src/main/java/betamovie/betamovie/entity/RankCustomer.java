package betamovie.betamovie.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;


@Entity
@Table(name = "tbl_RankCustomer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RankCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "Point")
    private int point;
    @Column(name = "description")
    private String description;
    @Column(name = "Name")
    private String name;
    @Column(name = "isActive")
    private boolean isActive;

    @OneToMany(mappedBy = "rankCustomer")
    @JsonManagedReference
    private List<User> userList;

    @OneToMany(mappedBy = "rankCustomer")
    @JsonManagedReference
    private List<Promotion> promotionList;
}
