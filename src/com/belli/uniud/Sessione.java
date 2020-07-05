package com.belli.uniud;

import com.belli.uniud.enums.Durata;
import com.belli.uniud.enums.Livello;
import com.belli.uniud.enums.TipoSessione;

import java.util.Date;

public class Sessione {
    private Date dataSessione;
    private Durata durataSessione;
    private Settore settore;
    private Livello livello;
    private TipoSessione tipoSessione;

    public Sessione(Date dataSessione, Durata durataSessione, Settore settore, Livello livello, TipoSessione tipoSessione) {
        this.dataSessione = dataSessione;
        this.durataSessione = durataSessione;
        this.settore = settore;
        this.livello = livello;
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

    public Settore getSettore() {
        return settore;
    }

    public void setSettore(Settore settore) {
        this.settore = settore;
    }

    public Livello getLivello() {
        return livello;
    }

    public void setLivello(Livello livello) {
        this.livello = livello;
    }

    public TipoSessione getTipoSessione() {
        return tipoSessione;
    }

    public void setTipoSessione(TipoSessione tipoSessione) {
        this.tipoSessione = tipoSessione;
    }
}
