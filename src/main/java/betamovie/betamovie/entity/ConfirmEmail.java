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

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tbl_ConfirmEmail")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ConfirmEmail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "UserId", referencedColumnName = "Id", insertable = false, updatable = false)
    @JsonBackReference
    private User user;

    @Column(name = "RequiredTime")
    private Date requriedTime;

    @Column(name = "ExpiredTime")
    private Date expiredTime;

    @Column(name = "ConfirmCode")
    private String confirmCode;

    @Column(name = "isConfirm")
    private boolean isConfirm;
}
