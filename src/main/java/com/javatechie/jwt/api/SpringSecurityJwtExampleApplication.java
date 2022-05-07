package com.javatechie.jwt.api;

import com.javatechie.jwt.api.domain.administration.Utilisateur;
import com.javatechie.jwt.api.domain.administration.repository.UtilisateurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringSecurityJwtExampleApplication {
    @Autowired
    private UtilisateurRepo repository;

    @PostConstruct
    public void initUsers() {
        List<Utilisateur> users = Stream.of(
                new Utilisateur(null, "javatechie", "password", "javatechie@gmail.com"),
                new Utilisateur(null, "user1", "pwd1", "user1@gmail.com"),
                new Utilisateur(null, "user2", "pwd2", "user2@gmail.com"),
                new Utilisateur(null, "user3", "pwd3", "user3@gmail.com")
        ).collect(Collectors.toList());
        repository.saveAll(users);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJwtExampleApplication.class, args);
    }

}
