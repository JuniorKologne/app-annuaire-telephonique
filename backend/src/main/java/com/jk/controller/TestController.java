package com.jk.controller;

import com.jk.model.Utilisateur;
import com.jk.repository.UtilisateurRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final UtilisateurRepository utilisateurRepository;

    public TestController(UtilisateurRepository utilisateurRepository){
        this.utilisateurRepository = utilisateurRepository;
    }

    @GetMapping("/api/test")
    public String testDatabase(){
        Utilisateur u = new Utilisateur("apprendreac", "apprendreac@test.com", "1234");

        utilisateurRepository.save(u);
        return "✅ Utilisateur sauvegardé avec ID : " + u.getId();
    }
}
