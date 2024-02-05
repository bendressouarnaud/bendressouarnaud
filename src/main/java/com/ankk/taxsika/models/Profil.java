package com.ankk.taxsika.models;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Profil extends AbstractEntity{
    private String libelle;
}
