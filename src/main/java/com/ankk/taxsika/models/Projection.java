package com.ankk.taxsika.models;

import jakarta.persistence.*;
import lombok.Data;

import static jakarta.persistence.FetchType.LAZY;

@Data
@Entity
@Table(
        indexes = {
                @Index(name = "projection_mois_idx", columnList = "mois"),
                @Index(name = "projection_annee_idx", columnList = "annee")
        }
)
public class Projection extends AbstractEntity{

    private Integer mois;
    private Integer montant;
    private Integer choix;
    private Integer annee;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "magasin_id", nullable = false,
            foreignKey = @ForeignKey(name = "FK_magasin_projection"))
    private Magasin magasin;
}
