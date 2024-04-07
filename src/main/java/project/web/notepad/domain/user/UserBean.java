package project.web.notepad.domain.user;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "t_user")
public class UserBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private String username;
    private String password;
    private String email;
    private String phoneNum;
    private String birth;
    private String joinDate;
    private String lastLoginDate;
    private String status;
}
