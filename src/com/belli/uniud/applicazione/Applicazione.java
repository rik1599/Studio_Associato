package com.belli.uniud.applicazione;
import com.belli.uniud.enums.Livello;

import java.util.*;

public class Applicazione {
    private GestoreConsulenti gestoreConsulenti;
    private GestoreProgrammi gestoreProgrammi;

    public Programma creaProgramma(Richiesta richiesta) {

    }

    public Collection<Consulente> find(Programma programma) {
        List<Consulente> found = new ArrayList<>();
        for (Map.Entry<Settore, Livello> entry :
                programma.corsi.entrySet()) {
            found.addAll(gestoreConsulenti.find(entry.getKey(), entry.getValue()));
        }
        return found;
    }

    public boolean verificaProgramma(Programma programma) {

    }

    public Double calcolaCosto(Programma programma) {
        Double prezzo = 0.0;
        for (Sessione sessione : programma.sessioni) {
            prezzo += sessione.getSettore().getCostoBase() *
                    sessione.getLivello().getMoltiplicatore() *
                    sessione.getDurataSessione().getMoltiplicatore();
        }

        return prezzo;
    }
}
