package com.javatechie.jwt.api.domain.reservation;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Document document;
    private Date dateDeReservation;
    private EtatDeReservation etatDeReservation;
    private Date dateDeCloture;
}
