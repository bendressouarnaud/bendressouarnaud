package com.ankk.taxsika.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import java.util.Date;

import static jakarta.persistence.FetchType.LAZY;

@Data
@Entity
public class PositionGps extends AbstractEntity{

    private Double latitude;
    private Double longitude;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "magasin_id", nullable = false,
            foreignKey = @ForeignKey(name = "FK_magasin_positiongps"))
    private Magasin magasin;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "utilisateur_id", nullable = false,
            foreignKey = @ForeignKey(name = "FK_utilisateur_positiongps"))
    private Utilisateur utilisateur;

}
