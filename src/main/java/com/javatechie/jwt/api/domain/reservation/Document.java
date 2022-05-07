package com.javatechie.jwt.api.domain.reservation;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@NoArgsConstructor
public class Document {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
//
    private String rayon;
    private String titre;
    private String resume;
    private String acteurs;
    private Date dateDeCreation;
    private Date dateDeMiseAJour;
    private String version;
    private String responsable;
    private TypeDeDocument typeDeDocument;

}
