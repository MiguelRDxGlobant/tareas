package com.example.demo.registration.token;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

public interface SuscriptionTokenRepository
        extends JpaRepository<SuscriptionToken, Long > {

    Optional<SuscriptionToken> findByToken(String token);

    @Transactional
    @Modifying
    @Query("UPDATE SuscriptionToken c " +
            "SET c.confirmedAt = ?2 " +
            "WHERE c.token = ?1")
    int updateConfirmedAt(String token,
                          LocalDateTime confirmedAt);
}