package com.ankk.taxsika.models;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

import static jakarta.persistence.FetchType.LAZY;

@Data
@Entity
@Table(
    indexes = {
        @Index(name = "payer_magasin_idx", columnList = "magasin_id"),
        @Index(name = "payer_commercant_idx", columnList = "commercant_id"),
        @Index(name = "payer_utilisateur_idx", columnList = "utilisateur_id")
    }
)
public class Payer extends AbstractEntity{

    private Integer montant;
    private Integer jour;
    private Integer mois;
    private Integer annee;
    private Integer taxeOdp; // 0 : taxe    ---    1 : ODP

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "magasin_id", nullable = false,
            foreignKey = @ForeignKey(name = "FK_magasin_payer"))
    private Magasin magasin;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "commercant_id", nullable = false,
            foreignKey = @ForeignKey(name = "FK_commercant_payer"))
    private Commercant commercant;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "utilisateur_id", nullable = false,
            foreignKey = @ForeignKey(name = "FK_utilisateur_payer"))
    private Utilisateur utilisateur;
}
