package com.belli.uniud.applicazione;

import com.belli.uniud.enums.Livello;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class GestoreConsulenti implements Gestore {
    private List<Consulente> consulenti;

    public Collection<Consulente> find(Settore settore, Livello livello) {
        List<Consulente> found = new ArrayList<>();
        for (Consulente consulente : consulenti) {
            Livello level = consulente.getCompetenze().get(settore);
            if (level != null && level.compareTo(livello) >= 0) {
                found.add(consulente);
            }
        }

        return found;
    }
}
