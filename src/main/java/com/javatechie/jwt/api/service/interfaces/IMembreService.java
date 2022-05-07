package com.javatechie.jwt.api.service.interfaces;


import com.javatechie.jwt.api.domain.reservation.Document;
import com.javatechie.jwt.api.domain.reservation.Reservation;

public interface IMembreService {
    void redigerUneReservation(Reservation reservation);
    void remisUneDocument(Document document);
    void annulerUneReservation(Reservation reservation);
}
