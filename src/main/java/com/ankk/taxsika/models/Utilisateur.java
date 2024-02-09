package com.ankk.taxsika.models;
import lombok.Data;
import org.hibernate.annotations.ColumnTransformer;

import jakarta.persistence.*;
import java.util.Collection;

import static jakarta.persistence.FetchType.LAZY;

@Data
@Entity
@Table(
    indexes = {
        @Index(name = "contact_utilisateur_idx", columnList = "contact"),
        @Index(name = "email_utilisateur_idx", columnList = "email"),
    }
)
public class Utilisateur extends AbstractEntity{

    private String nom;
    private String prenom;
    private String email;
    private String contact;
    @Column(columnDefinition="TEXT", length = 1000)
    private String motdepasse;
    private String token;
    private String fcmtoken;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "mairie_id", nullable = false,
            foreignKey = @ForeignKey(name = "FK_mairie_utilisateur"))
    private Mairie mairie;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "profil_id", nullable = false,
            foreignKey = @ForeignKey(name = "FK_profil_utilisateur"))
    private Profil profil;

    @OneToMany(fetch = LAZY, mappedBy = "utilisateur")
    private Collection<Payer> payers;

}
