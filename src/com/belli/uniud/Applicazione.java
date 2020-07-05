package com.belli.uniud;

import com.belli.uniud.enums.Livello;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Applicazione {
    private GestoreConsulenti gestoreConsulenti;
    private GestoreProgrammi gestoreProgrammi;

    public Programma creaProgramma(Richiesta richiesta) {
        Iterator<Map.Entry<Settore, Livello>> richiestaIteratori = richiesta.iterator();
        while (richiestaIteratori.hasNext()) {
            Map.Entry<Settore, Livello> entry = richiestaIteratori.next();
            Settore settore = entry.getKey();
            Livello livello = entry.getValue();
        }
    }

    public Stream<Consulente> find(Programma programma) {

    }

    public boolean verificaProgramma(Programma programma) {

    }

    public Double calcolaCosto(Programma programma) {
        
    }
}
