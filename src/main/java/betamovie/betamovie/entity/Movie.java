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

import java.util.BitSet;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tbl_Movie")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "MovieDuration")
    private int movieDuration;
    @Column(name = "EndTime")
    private Date endTime;
    @Column(name = "PrimereDate")
    private Date primereDate;
    @Column(name = "Description")
    private String description;
    @Column(name = "Director")
    private String director;
    @Column(name = "Image")
    private String image;
    @Column(name = "HeroImage")
    private String heroImage;
    @Column(name = "Language")
    private String language;

    @ManyToOne
    @JoinColumn(name = "MovieTypeId", referencedColumnName = "Id", insertable = false, updatable = false)
    @JsonBackReference
    private MovieType movieType;

    @Column(name = "Name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "RateId", referencedColumnName = "Id", insertable = false, updatable = false)
    @JsonBackReference
    private Rate rate;

    @Column(name = "Trailer")
    private String trailer;
    @Column(name = "isActive")
    private BitSet isActive;

    @OneToMany(mappedBy = "movie")
    @JsonManagedReference
    private List<Schedule> scheduleList;

}
