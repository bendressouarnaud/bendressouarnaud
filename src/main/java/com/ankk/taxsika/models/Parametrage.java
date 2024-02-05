package com.ankk.taxsika.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import static jakarta.persistence.FetchType.LAZY;

@Data
@Entity
public class Parametrage extends AbstractEntity{

    private Integer prixMetreCarre;
    private Integer trimestreUn;
    private Integer trimestreDeux;
    private Integer trimestreTrois;
    private Integer trimestreQuatre;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "mairie_id", nullable = false,
            foreignKey = @ForeignKey(name = "FK_mairie_parametrage"))
    private Mairie mairie;
}
