package com.ankk.taxsika.models;
import com.ankk.taxsika.enums.CommercantType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.List;

import static jakarta.persistence.FetchType.LAZY;

@Setter
@Getter
@Entity
@Table(
        indexes = {
                @Index(name = "contact_commercant_idx", columnList = "contact")
        }
)
public class Commercant extends AbstractEntity{

    private String nom;
    private String prenom;
    private String contact;
    private String email;
    @Enumerated(EnumType.ORDINAL)
    private CommercantType commercantType; // 0 : PATENTE    ---    1 : JOURNALIER

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "mairie_id", nullable = false,
            foreignKey = @ForeignKey(name = "FK_mairie_commercant"))
    private Mairie mairie;

    @OneToMany(fetch = LAZY, mappedBy = "commercant")
    private Collection<Payer> payers;

    @OneToMany(fetch = LAZY, mappedBy = "commercant")
    private Collection<Louer> louers;
}
