package com.ankk.taxsika.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(
        indexes = {
                @Index(name = "contact_journalier_idx", columnList = "contact")
        }
)
public class ClientJournalier extends AbstractEntity{

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "contact")
    private String contact;

    @Column(name = "idmai")
    private Integer idmai;

}
