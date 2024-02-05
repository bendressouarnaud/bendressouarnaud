package com.ankk.taxsika.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum CommercantType {
    PATENTE(0),
    JOURNALIER(1);
    private final int value;
}
