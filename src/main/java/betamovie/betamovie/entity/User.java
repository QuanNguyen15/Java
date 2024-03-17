package betamovie.betamovie.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Table(name = "tbl_User")
@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "Point")
    private int point;
    @Column(name = "Username")
    private String userName;
    @Column(name = "Email")
    private String email;
    @Column(name = "Name")
    private String name;
    @Column(name = "PhoneNumber")
    private String phoneNumber;
    @Column(name = "Password")
    private String password;
    @Column(name = "isActive")
    private boolean isActive;


    @ManyToOne
    @JoinColumn(name = "RankCustomerId", referencedColumnName = "Id",insertable = false, updatable = false)
    private RankCustomer rankCustomer;

    @ManyToOne
    @JoinColumn(name = "UserStatusId", referencedColumnName = "Id", insertable = false, updatable = false)
    private UserStatus userStatus;

    @ManyToOne
    @JoinColumn(name = "RoleId", referencedColumnName = "Id", insertable = false, updatable = false)
    private Role role;


    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<ConfirmEmail> confirmEmailList;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<RefreshToken> refreshTokenList;

}
