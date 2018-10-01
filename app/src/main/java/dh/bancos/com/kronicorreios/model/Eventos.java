package dh.bancos.com.kronicorreios.model;

import com.google.gson.annotations.SerializedName;

public class Eventos {

    @SerializedName("data")
    private String data;

    @SerializedName("evento")
    private String evento;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }
}
