package com.javatechie.jwt.api.domain.administration;

import com.javatechie.jwt.api.domain.reservation.Reservation;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Membre extends User{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name;
    private String prenom;
    private String adresse;
    @OneToMany
    private Collection<Reservation> reseravation;

    public Membre(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public Membre(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }

    public Membre(String username, String password, Collection<? extends GrantedAuthority> authorities, Long id, String name, String prenom, String adresse) {
        super(username, password, authorities);
        this.id = id;
        this.name = name;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public Membre(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities, Long id, String name, String prenom, String adresse) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        this.id = id;
        this.name = name;
        this.prenom = prenom;
        this.adresse = adresse;
    }
}
