package com.belli.uniud.applicazione;

import com.belli.uniud.enums.Durata;
import com.belli.uniud.enums.TipoSessione;

import java.util.Date;

class Sessione {
    private Date dataSessione;
    private Durata durataSessione;
    private TipoSessione tipoSessione;

    public Sessione(Date dataSessione, Durata durataSessione, TipoSessione tipoSessione) {
        this.dataSessione = dataSessione;
        this.durataSessione = durataSessione;
        this.tipoSessione = tipoSessione;
    }

    public Date getDataSessione() {
        return dataSessione;
    }

    public void setDataSessione(Date dataSessione) {
        this.dataSessione = dataSessione;
    }

    public Durata getDurataSessione() {
        return durataSessione;
    }

    public void setDurataSessione(Durata durataSessione) {
        this.durataSessione = durataSessione;
    }

    public TipoSessione getTipoSessione() {
        return tipoSessione;
    }

    public void setTipoSessione(TipoSessione tipoSessione) {
        this.tipoSessione = tipoSessione;
    }
}
