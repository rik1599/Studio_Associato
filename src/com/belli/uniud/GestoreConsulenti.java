package com.belli.uniud;

import com.belli.uniud.enums.Livello;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class GestoreConsulenti implements Gestore {
    private List<Consulente> consulenti;

    public Stream<Consulente> find(Settore settore, Livello livello) {
        List<Consulente> found = new ArrayList<>();
        for (Consulente consulente : consulenti) {
            Livello level = consulente.getCompetenze().get(settore);
            if (level != null && level.compareTo(livello) >= 0) {
                found.add(consulente);
            }
        }

        return found.stream();
    }
}
