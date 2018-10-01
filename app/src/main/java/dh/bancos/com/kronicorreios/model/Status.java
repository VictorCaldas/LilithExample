package dh.bancos.com.kronicorreios.model;

import com.google.gson.annotations.SerializedName;

public class Status {

    @SerializedName("cidade")
    private String cidade;

    @SerializedName("data")
    private String data;

    @SerializedName("hora")
    private String hora;

    @SerializedName("status")
    private String status;

    @SerializedName("uf")
    private String uf;

    public String getCidade() {
        return cidade;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public String getStatus() {
        return status;
    }

    public String getUf() {
        return uf;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
