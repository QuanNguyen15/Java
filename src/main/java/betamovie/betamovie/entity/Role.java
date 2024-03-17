package betamovie.betamovie.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.lang.model.element.Name;
import javax.print.attribute.standard.MediaSize;
import java.util.List;

@Entity
@Table(name = "tbl_Role")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @Column(name = "Code")
    private String code;

    @Column(name = "RoleName")
    @Enumerated
    private ERole roleName;

    @OneToMany(mappedBy = "role")
    private List<User>roleUser;
}
