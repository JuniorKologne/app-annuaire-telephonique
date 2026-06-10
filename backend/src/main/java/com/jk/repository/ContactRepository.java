package com.jk.repository;

import com.jk.model.Contact;
import com.jk.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    List<Contact> findByUtilisateur(Utilisateur utilisateur);
    List<Contact> findByNomContainingIgnoreCase(String nom);
}
