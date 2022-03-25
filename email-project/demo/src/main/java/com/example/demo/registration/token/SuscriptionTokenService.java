package com.example.demo.registration.token;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SuscriptionTokenService {

    private  final SuscriptionTokenRepository suscriptionTokenRepository;

    public  void  saveSuscriptionToken(SuscriptionToken token) {suscriptionTokenRepository.save(token);
    }

    public Optional<SuscriptionToken> getToken(String token) {
        return suscriptionTokenRepository.findByToken(token);
    }

    public int setConfirmeAt(String token) {
        return suscriptionTokenRepository.updateConfirmedAt(
                token, LocalDateTime.now());
    }
}
