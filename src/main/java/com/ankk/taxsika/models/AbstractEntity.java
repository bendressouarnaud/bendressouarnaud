package com.ankk.taxsika.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.OffsetDateTime;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Getter
@MappedSuperclass
@NoArgsConstructor
public abstract class AbstractEntity {

    @Id
    @GeneratedValue(strategy = SEQUENCE)
    private Long id;

    @Version
    @Setter
    private int version;

    @CreationTimestamp
    @Setter
    private OffsetDateTime creationDatetime;

}
