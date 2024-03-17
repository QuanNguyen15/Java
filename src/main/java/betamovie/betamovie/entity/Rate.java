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
@Table(name = "tbl_Rate")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "Description")
    private String description;
    @Column(name = "Code")
    private String code;

    @OneToMany(mappedBy = "rate")
    @JsonManagedReference
    private List<Movie>movieList;

}
