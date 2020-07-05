package com.belli.uniud.enums;

public enum Durata {
    MATTINA(1.0),
    POMERIGGIO(1.0),
    GIORNATA_INTERA(2.0);

    private final Double moltiplicatore;

    Durata(Double moltiplicatore) {
        this.moltiplicatore = moltiplicatore;
    }

    public Double getMoltiplicatore() {
        return moltiplicatore;
    }
}
