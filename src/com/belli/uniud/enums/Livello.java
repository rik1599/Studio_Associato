package com.belli.uniud.enums;

public enum Livello {
    JUNIOR(1.0),
    SENIOR(1.5),
    MASTER(2.0);

    private final Double moltiplicatore;

    Livello(Double moltiplicatore) {
        this.moltiplicatore = moltiplicatore;
    }

    public Double getMoltiplicatore() {
        return moltiplicatore;
    }
}
