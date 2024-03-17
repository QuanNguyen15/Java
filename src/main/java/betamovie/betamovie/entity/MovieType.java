package betamovie.betamovie.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "tbl_MovieType")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class MovieType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "MovieTypeName")
    private String movieTypeName;
    @Column(name = "isActive")
    private boolean isActive;

    @OneToMany(mappedBy = "movieType")
    @JsonManagedReference
    private List<Movie> movieList;

}
