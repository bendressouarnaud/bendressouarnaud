package com.ankk.taxsika.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.Collection;

import static jakarta.persistence.FetchType.LAZY;


@Data
@Entity
public class Mairie extends AbstractEntity{

    private String libelle;
    private String code;
    private String cle;
    private String identifiant;
    private String monnaie;

    @OneToMany(fetch = LAZY, mappedBy = "mairie")
    private Collection<Quartier> quartiers;

    @OneToMany(fetch = LAZY, mappedBy = "mairie")
    private Collection<Commercant> commercants;

}
