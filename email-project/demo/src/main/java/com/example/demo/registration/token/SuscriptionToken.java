package com.example.demo.registration.token;

import com.example.demo.appuser.AppUser;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class SuscriptionToken {

    @SequenceGenerator(
            name = "suscription_token_sequence",
            sequenceName = "suscription_token_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )

    private Long id;

    @Column(nullable = false)
    private  String token;

    @Column(nullable = false)
    private LocalDateTime createAt;

    @Column(nullable = false)
    private LocalDateTime expiresAt;

    private LocalDateTime confirmedAt;

    @ManyToOne
    @JoinColumn(
            nullable = false,
            name = "app_user_id"
    )
    private AppUser appUser;

    public SuscriptionToken(String token,
                            LocalDateTime createAt,
                            LocalDateTime expiresAt,
                            AppUser appUser
                             ) {
        this.token = token;
        this.createAt = createAt;
        this.expiresAt = expiresAt;
        this.appUser = appUser;
    }
}
