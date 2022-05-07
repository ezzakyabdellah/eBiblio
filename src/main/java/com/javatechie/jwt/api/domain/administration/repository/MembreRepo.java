package com.javatechie.jwt.api.domain.administration.repository;

import com.javatechie.jwt.api.domain.administration.Membre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembreRepo extends JpaRepository<Membre, Long> {
}
