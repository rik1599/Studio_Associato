package com.belli.uniud;
import com.belli.uniud.enums.Livello;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;

public class Richiesta {
    private Map<Settore, Livello> richieste;
    private Date dataInizio;

    public Iterator<Map.Entry<Settore, Livello>> iterator() {
        return richieste.entrySet().iterator();
    }
}
