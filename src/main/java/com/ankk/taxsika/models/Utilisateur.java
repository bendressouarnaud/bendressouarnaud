package com.ankk.taxsika.models;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ColumnTransformer;

import java.util.Collection;

import static jakarta.persistence.FetchType.LAZY;

@Data
@Entity
@Table(
    indexes = {
        @Index(name = "numero_utilisateur_idx", columnList = "numero"),
        @Index(name = "email_utilisateur_idx", columnList = "email"),
    }
)
public class Utilisateur extends AbstractEntity{

    private String nom;
    private String prenom;
    private String email;
    private String contact;
    private Integer profil;
    @Column(columnDefinition="TEXT", length = 1000)
    private String identifiant;
    @Column(columnDefinition="TEXT", length = 1000)
    private String motdepasse;
    private String token;
    private String fcmtoken;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "mairie_id", nullable = false,
            foreignKey = @ForeignKey(name = "FK_mairie_utilisateur"))
    private Mairie mairie;

    @OneToMany(fetch = LAZY, mappedBy = "utilisateur")
    private Collection<Payer> payers;

}
