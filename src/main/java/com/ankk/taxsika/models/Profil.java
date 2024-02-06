package com.ankk.taxsika.models;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.Collection;

import static jakarta.persistence.FetchType.LAZY;

@Data
@Entity
public class Profil extends AbstractEntity{
    private String libelle;

    @OneToMany(fetch = LAZY, mappedBy = "profil")
    private Collection<Utilisateur> utilisateurs;
}
