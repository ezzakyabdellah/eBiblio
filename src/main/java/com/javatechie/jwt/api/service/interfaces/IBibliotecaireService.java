package com.javatechie.jwt.api.service.interfaces;


import com.javatechie.jwt.api.domain.administration.Bibliotecaire;
import com.javatechie.jwt.api.domain.reservation.Document;

public interface IBibliotecaireService {
    Bibliotecaire save(Bibliotecaire bibliotecaire);
    void remettreLeDocument(Document document);

}
