package dh.bancos.com.kronicorreios.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RastreamentoResponse {

    @SerializedName("status")
    public Status status;

    @SerializedName("eventos")
    public List<Eventos> eventos;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Eventos> getEventos() {
        return eventos;
    }

    public void setEventos(List<Eventos> eventos) {
        this.eventos = eventos;
    }
}

