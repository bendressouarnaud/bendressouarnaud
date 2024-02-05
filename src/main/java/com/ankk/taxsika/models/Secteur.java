package com.ankk.taxsika.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import static jakarta.persistence.FetchType.LAZY;

@Data
@Entity
public class Secteur extends AbstractEntity{
    private String libelle;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "quartier_id", nullable = false,
            foreignKey = @ForeignKey(name = "FK_quartier_secteur"))
    private Quartier quartier;
}
