package com.ankk.taxsika.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.FetchType.LAZY;

@Getter
@Setter
@Entity
public class Quartier extends AbstractEntity{
    private String libelle;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "mairie_id", nullable = false,
            foreignKey = @ForeignKey(name = "FK_mairie_quartier"))
    private Mairie mairie;
}
