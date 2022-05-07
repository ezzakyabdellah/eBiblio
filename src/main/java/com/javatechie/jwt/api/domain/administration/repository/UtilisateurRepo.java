package com.javatechie.jwt.api.domain.administration.repository;

import com.javatechie.jwt.api.domain.administration.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepo extends JpaRepository<Utilisateur, Long> {
    Utilisateur findByUserName(String username);
}
