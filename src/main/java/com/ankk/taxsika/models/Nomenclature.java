package com.ankk.taxsika.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;

import static jakarta.persistence.FetchType.LAZY;

@Data
@Entity
public class Nomenclature extends AbstractEntity{
    private String libelle;
    private Integer recetteBrute;

    @OneToMany(fetch = LAZY, mappedBy = "nomenclature")
    private Collection<DetailTable> detailTables;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "mairie_id", nullable = false,
            foreignKey = @ForeignKey(name = "FK_mairie_nomenclature"))
    private Mairie mairie;
}
