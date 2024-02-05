package com.ankk.taxsika.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import static jakarta.persistence.FetchType.LAZY;

@Data
@Entity
public class Superficie extends AbstractEntity{

    private String libelle;
    private Integer montant;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "mairie_id", nullable = false,
            foreignKey = @ForeignKey(name = "FK_mairie_superficie"))
    private Mairie mairie;

}
