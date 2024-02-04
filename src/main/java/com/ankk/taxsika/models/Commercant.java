package com.ankk.taxsika.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(
        indexes = {
                @Index(name = "contact_commercant_idx", columnList = "contact")
        }
)
public class Commercant extends AbstractEntity{

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "contact")
    private String contact;

    @Column(name = "email")
    private String email;

    @Column(name = "idmai")
    private Integer idmai;
}
