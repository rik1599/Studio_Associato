package com.belli.uniud.applicazione;

import com.belli.uniud.enums.Livello;
import com.belli.uniud.enums.TipoSessione;

import java.util.Map;

class Corso {
    private Settore settore;
    private Livello livello;
    private Map<TipoSessione, Integer> strutturaCorso;
}
