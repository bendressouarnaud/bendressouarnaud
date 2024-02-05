package com.ankk.taxsika.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.Collection;

import static jakarta.persistence.FetchType.LAZY;

@Data
@Entity
@Table(
    indexes = {
        @Index(name = "numero_magasin_idx", columnList = "numero"),
        @Index(name = "denomination_idx", columnList = "denomination"),
    },
    uniqueConstraints = {
        @UniqueConstraint(name = "numero_magasin_ukey", columnNames = {"numero"})
    }
)
public class Magasin extends AbstractEntity{

    private String numero;
    private Integer superficie;
    private String denomination;
    private Integer natureTaxe;
    private Integer detailTaxe;
    private Integer odp;
    private OffsetDateTime dates;
    private Integer valeurLocative;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "secteur_id", nullable = false,
            foreignKey = @ForeignKey(name = "FK_secteur_magasin"))
    private Secteur secteur;

    @OneToMany(fetch = LAZY, mappedBy = "magasin")
    private Collection<Payer> payers;

    @OneToMany(fetch = LAZY, mappedBy = "magasin")
    private Collection<Louer> louers;
}
