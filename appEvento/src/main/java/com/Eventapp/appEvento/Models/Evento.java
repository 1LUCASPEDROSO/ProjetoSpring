package com.Eventapp.appEvento.Models;

import org.springframework.web.bind.annotation.ModelAttribute;


public class Evento {
    private String NomeEvento;
    private String LocalEvento;
    private String HoraEvento;
    private String DataEvento;

    public String getNomeEvento() {
        return NomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        NomeEvento = nomeEvento;
    }

    public String getLocalEvento() {
        return LocalEvento;
    }

    public void setLocalEvento(String localEvento) {
        LocalEvento = localEvento;
    }

    public String getHoraEvento() {
        return HoraEvento;
    }

    public void setHoraEvento(String horaEvento) {
        HoraEvento = horaEvento;
    }

    public String getDataEvento() {
        return DataEvento;
    }

    public void setDataEvento(String dataEvento) {
        DataEvento = dataEvento;
    }
}
