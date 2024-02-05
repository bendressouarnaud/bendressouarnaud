package com.ankk.taxsika.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
import java.sql.Timestamp;

@Data
@Entity
public class Journal extends AbstractEntity{

    private String libelle;
    private Integer choix;

    @OneToOne
    @JoinColumn(name = "payer_id",  foreignKey = @ForeignKey(name = "FK_payer_journal"))
    private Payer payer;
}
