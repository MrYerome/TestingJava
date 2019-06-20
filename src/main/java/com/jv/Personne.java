package com.jv;

import java.time.LocalDate;

public class Personne {
    private LocalDate dateNaissance;
    private String prenom;


    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Personne(LocalDate dateNaissance, String prenom) {
        this.dateNaissance = dateNaissance;
        this.prenom = prenom;
    }


}
