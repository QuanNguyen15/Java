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
@Table(name = "tbl_UserStatus")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "Code")
    private String code;
    @Column(name = "Name")
    private String name;

    @OneToMany(mappedBy = "userStatus")
    @JsonManagedReference
    private List<User> userList;
}
