package uz.db.h2_db.entity;

import lombok.*;

import javax.persistence.*;

/**
 * @author Botirov Najmiddin, Wed 11:42 AM. 9/14/2022
 */

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AuthUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

}
