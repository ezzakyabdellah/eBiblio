package com.javatechie.jwt.api.service;

import com.javatechie.jwt.api.domain.administration.Bibliotecaire;
import com.javatechie.jwt.api.domain.administration.repository.BibliotecaireRepo;
import com.javatechie.jwt.api.domain.reservation.Document;
import com.javatechie.jwt.api.service.interfaces.IBibliotecaireService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class BibliotecaireService implements IBibliotecaireService {
    @Autowired
    private BibliotecaireRepo bibliotecaireRepo;

    @Override
    public Bibliotecaire save(Bibliotecaire bibliotecaire) {
        return bibliotecaireRepo.save(bibliotecaire);
    }

    @Override
    public void remettreLeDocument(Document document) {

    }
}
