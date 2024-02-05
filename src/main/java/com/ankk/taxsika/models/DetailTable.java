package com.ankk.taxsika.models;

import jakarta.persistence.*;
import lombok.Data;

import static jakarta.persistence.FetchType.LAZY;

@Data
@Entity
@Table(
    indexes = {
        @Index(name = "detailtable_nomenclature_idx", columnList = "nomenclature_id")
    }
)
public class DetailTable extends AbstractEntity{

    private String libelle;
    private Integer periode;
    private Integer cout;
    private Integer unite;
    private Integer codeAuvent;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "mairie_id", nullable = false,
            foreignKey = @ForeignKey(name = "FK_mairie_detailtable"))
    private Mairie mairie;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "nomenclature_id", nullable = false,
            foreignKey = @ForeignKey(name = "FK_nomenclature_detailtable"))
    private Nomenclature nomenclature;
}
