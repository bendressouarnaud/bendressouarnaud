package com.ankk.taxsika.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.Date;

import static jakarta.persistence.FetchType.LAZY;

@Data
@Entity
public class Louer extends AbstractEntity{

    private OffsetDateTime dateDebut;
    private OffsetDateTime dateFin;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "magasin_id", nullable = false,
            foreignKey = @ForeignKey(name = "FK_magasin_louer"))
    private Magasin magasin;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "commercant_id", nullable = false,
            foreignKey = @ForeignKey(name = "FK_commercant_louer"))
    private Commercant commercant;

}
