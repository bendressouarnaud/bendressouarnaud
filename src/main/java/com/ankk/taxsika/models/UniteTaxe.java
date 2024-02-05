package com.ankk.taxsika.models;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class UniteTaxe extends AbstractEntity{
    private String libelle;
}
